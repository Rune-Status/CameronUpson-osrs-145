package com.jagex;

public class GraphicDefinition extends DoublyNode {

    public static ReferenceCache definitionCache = new ReferenceCache(64);
    public static ReferenceCache modelCache = new ReferenceCache(30);
    public static ReferenceTable definitionTable;

    public int animation = -1;
    short[] replacementTextures;
    int modelId;
    short[] originalColors;
    short[] replacementColors;
    int contrast = 0;
    int id;
    int scaleXZ = 128;
    int scaleY = 128;
    int orientation = 0;
    int ambience = 0;
    short[] originalTextures;

    public static GraphicDefinition get(int id) {
        GraphicDefinition def = (GraphicDefinition) definitionCache.get((long) id);
        if (def != null) {
            return def;
        }
        byte[] buffer = definitionTable.unpack(13, id);
        def = new GraphicDefinition();
        def.id = id;
        if (buffer != null) {
            def.decode(new Buffer(buffer));
        }

        definitionCache.put(def, (long) id);
        return def;
    }

    void decode(Buffer buffer) {
        while (true) {
            int opcode = buffer.readUnsignedByte();
            if (opcode == 0) {
                return;
            }
            decode(buffer, opcode);
        }
    }

    void decode(Buffer buffer, int opcode) {
        if (opcode == 1) {
            modelId = buffer.readUnsignedShort();
        } else if (opcode == 2) {
            animation = buffer.readUnsignedShort();
        } else if (opcode == 4) {
            scaleXZ = buffer.readUnsignedShort();
        } else if (opcode == 5) {
            scaleY = buffer.readUnsignedShort();
        } else if (opcode == 6) {
            orientation = buffer.readUnsignedShort();
        } else if (opcode == 7) {
            ambience = buffer.readUnsignedByte();
        } else if (opcode == 8) {
            contrast = buffer.readUnsignedByte();
        } else {
            int count;
            int index;
            if (opcode == 40) {
                count = buffer.readUnsignedByte();
                originalColors = new short[count];
                replacementColors = new short[count];

                for (index = 0; index < count; ++index) {
                    originalColors[index] = (short) buffer.readUnsignedShort();
                    replacementColors[index] = (short) buffer.readUnsignedShort();
                }
            } else if (opcode == 41) {
                count = buffer.readUnsignedByte();
                originalTextures = new short[count];
                replacementTextures = new short[count];

                for (index = 0; index < count; ++index) {
                    originalTextures[index] = (short) buffer.readUnsignedShort();
                    replacementTextures[index] = (short) buffer.readUnsignedShort();
                }
            }
        }

    }

    public final Model getModel(int frame) {
        Model model = (Model) modelCache.get((long) this.id);
        if (model == null) {
            ModelHeader header = ModelHeader.method571(ModelHeader.aReferenceTable1844, modelId, 0);
            if (header == null) {
                return null;
            }

            int index;
            if (originalColors != null) {
                for (index = 0; index < originalColors.length; ++index) {
                    header.recolor(originalColors[index], replacementColors[index]);
                }
            }

            if (originalTextures != null) {
                for (index = 0; index < originalTextures.length; ++index) {
                    header.retexture(originalTextures[index], replacementTextures[index]);
                }
            }

            model = header.light(ambience + 64, contrast + 850, -30, -50, -30);
            modelCache.put(model, (long) this.id);
        }

        Model var5;
        if (animation != -1 && frame != -1) {
            var5 = AnimationSequence.get(animation).getAnimatedModel(model, frame);
        } else {
            var5 = model.method732(true);
        }

        if (scaleXZ != 128 || scaleY != 128) {
            var5.scale(scaleXZ, scaleY, scaleXZ); //TODO should be scale
        }

        if (orientation != 0) {
            if (orientation == 90) {
                var5.method725();
            }

            if (orientation == 180) {
                var5.method725();
                var5.method725();
            }

            if (orientation == 270) {
                var5.method725();
                var5.method725();
                var5.method725();
            }
        }

        return var5;
    }
}
