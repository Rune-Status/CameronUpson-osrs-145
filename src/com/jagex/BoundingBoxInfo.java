package com.jagex;

public class BoundingBoxInfo {

    public static BoundingBoxDrawType currentBoundingBoxDrawType;
    public static boolean drawLegacyClickBoxes; //if set to true, will draw legacy clickboxes when hovering models
    public static boolean drawAxisAlignedBoundingBoxes; //if set to true, will draw MOUSE_OVER clickboxes when hovering models
    public static LinkedList<BoundingBox> boundingBoxes; //if drawing bounding boxes, they are pushed to this list
    public static boolean useLegacyClickBoxes; //if set to true, the renderer will use legacy 2d click boxes
    public static boolean useAxisAlignedBoundingBoxes = true;

    static {
        currentBoundingBoxDrawType = BoundingBoxDrawType.MOUSE_OVER;
        drawLegacyClickBoxes = false;
        drawAxisAlignedBoundingBoxes = true;
        boundingBoxes = new LinkedList<>();
        useLegacyClickBoxes = false;
    }

}
