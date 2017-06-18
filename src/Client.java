import netscape.javascript.JSObject;

import java.io.IOException;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;

public final class Client extends Applet_Sub1 {
    static final int[] anIntArray1532;
    static final Class113_Sub1 aClass113_Sub1_1462;
    static final int[] anIntArray1607;
    public static boolean membersWorld = false;
    static int[] anIntArray1700;
    static int currentWorld = 1;
    static int currentWorldMask = 0;
    static String[] aStringArray1553;
    static short aShort1452;
    static int anInt1585;
    static Packet aPacket1522;
    static int anInt1478;
    static int connectionState = 0;
    static Class55 aClass55_1497;
    static int anInt1579;
    static int[] interfaceHeights;
    static MouseRecorder mouseRecorder;
    static int anInt1475 = -1;
    static int anInt1479 = -1;
    static int anInt1480 = -1;
    static int anInt1614;
    static boolean showFps = false;
    static int anInt1466 = 0;
    static int anInt1485 = 0;
    static int anInt1492;
    static int anInt1472 = 0;
    static int hintArrowX = 0;
    static int hintArrowY = 0;
    static Node_Sub21_Sub26_Sub2[] aNode_Sub21_Sub26_Sub2Array1542;
    static int anInt1494 = 0;
    static int[] menuPrimaryArgs;
    static Class55 aClass55_1491;
    static boolean aBoolean1690;
    static int anInt1501;
    static int anInt1430;
    static int[] menuOpcodes;
    static long aLong1489;
    static Class27[] aClass27Array1449;
    static CacheReferenceTable aCacheReferenceTable1496;
    static int anInt1502;
    static int anInt1505;
    static int anInt1499;
    static int anInt1503;
    static int anInt1506;
    static int anInt1618;
    static long[] aLongArray1683;
    static byte[] aByteArray1500;
    static int anInt1705;
    static int[] anIntArray1457;
    static int[] anIntArray1507;
    static Packet packet;
    static int anInt1641;
    static Packet aPacket1521;
    static int anInt1514;
    static int anInt1511;
    static int anInt1518;
    static int audioEffectCount;
    static int anInt1689;
    static int anInt1516;
    static int anInt1517;
    static int specialScript;
    static boolean aBoolean1512;
    static int engineCycle = 0;
    static boolean aBoolean1484 = true;
    static int anInt1527;
    static int[] anIntArray1572;
    static InterfaceComponent anInterfaceComponent1642;
    static String clanChatName;
    static int anInt1548;
    static boolean inInstancedScene;
    static int[][][] anIntArrayArrayArray1530;
    static int anInt1536;
    static int anInt1533;
    static int anInt1537;
    static int anInt1534;
    static Class139 aClass139_1441;
    static int anInt1535;
    static int anInt1538;
    static int mapScale;
    static int anInt1528;
    static int mapOffset;
    static int anInt1546;
    static boolean aBoolean1639;
    static int anInt1643;
    static int[] anIntArray1444;
    static int anInt1543;
    static int anInt1545;
    static int anInt1592;
    static int anInt1549;
    static boolean aBoolean1550;
    static short aShort1434;
    static boolean aBoolean1628;
    static int mapRotation;
    static CacheReferenceTable aCacheReferenceTable1493;
    static int anInt1563;
    static int anInt1440;
    static int anInt1558;
    static int anInt1573;
    static int anInt1569;
    static int anInt1564;
    static int[] interfacePositionsY;
    static int anInt1567;
    static int[] npcIndices;
    static int[] anIntArray1560;
    static int[] anIntArray1568;
    static int[] anIntArray1554;
    static int[] anIntArray1566;
    static int[] anIntArray1555;
    static int[] anIntArray1556;
    static boolean aBoolean1473 = true;
    static int[][] anIntArrayArray1559;
    static int anInt1565;
    static int anInt1561;
    static int[] levels;
    static int anInt1557;
    static int viewportScale;
    static int[] anIntArray1428;
    static int cursorState;
    static int anInt1587;
    static int anInt1581;
    static int anInt1588;
    static CollisionMap[] collisionMaps;
    static int anInt1490;
    static int anInt1590;
    static int anInt1531;
    static int anInt1582;
    static int anInt1589;
    static int anInt1654;
    static int playerIndex;
    static long aLong1465 = -1L;
    static int anInt1580;
    static int[] anIntArray1584;
    static int hintArrowType = 0;
    static String[] playerActions;
    static NodeDeque<GraphicsObject> graphicsObjects;
    static int[] anIntArray1467;
    static int anInt1608;
    static int[] anIntArray1709;
    static NodeDeque<PendingSpawn> pendingSpawns;
    static int[] anIntArray1692;
    static int anInt1488 = 0;
    static int viewportHeight;
    static int anInt1699;
    static int[] experiences;
    static int anInt1610;
    static boolean menuOpen;
    static int menuRowCount;
    static int[] menuSecondaryArgs;
    static int[] menuTertiaryArgs;
    static Player[] players;
    static int anInt1571;
    static String[] menuActions;
    static String[] menuTargets;
    static HashMap aHashMap1513;
    static int anInt1624;
    static int[] interfacePositionsX;
    static boolean lowMemory = false;
    static int anInt1617;
    static int anInt1625;
    static int itemSelectionState;
    static String latestSelectedItemName;
    static boolean spellSelected;
    static int anInt1629;
    static int anInt1657;
    static String aString1623;
    static String aString1616;
    static int anInt1632;
    static int rights;
    static int anInt1626;
    static int anInt1620;
    static InterfaceComponent anInterfaceComponent1627;
    static int energy;
    static int weight;
    static int anInt1547;
    static int anInt1552;
    static boolean aBoolean1636;
    static boolean aBoolean1637;
    static boolean aBoolean1650;
    static InterfaceComponent anInterfaceComponent1638;
    static InterfaceComponent anInterfaceComponent1647;
    static InterfaceComponent anInterfaceComponent1653;
    static int anInt1651;
    static int anInt1645;
    static boolean aBoolean1562;
    static boolean aBoolean1648;
    static NodeDeque<PickableNode>[][][] pickableNodes;
    static int anInt1646;
    static int anInt1698;
    static int anInt1574;
    static int anInt1633;
    static boolean aBoolean1634;
    static int anInt1644;
    static int[] anIntArray1666;
    static int anInt1635;
    static int[] anIntArray1670;
    static int anInt1663;
    static int anInt1508;
    static int anInt1662;
    static int anInt1668;
    static int anInt1660;
    static int anInt1520;
    static int anInt1667;
    static int anInt1672;
    static int anInt1658;
    static int anInt1575;
    static NodeDeque<ScriptEvent> aNodeDeque1661;
    static NodeDeque<ScriptEvent> aNodeDeque1675;
    static boolean aBoolean1576;
    static NodeTable<IntegerNode> interfaceConfigs;
    static int anInt1673;
    static int anInt1655;
    static boolean[] aBooleanArray1656;
    static boolean[] aBooleanArray1674;
    static int anInt1539;
    static int anInt1524;
    static int anInt1577;
    static int[] interfaceWidths;
    static int anInt1510;
    static NodeTable<InterfaceNode> interfaceNodes;
    static long aLong1691;
    static int anInt1463 = 0;
    static int[] anIntArray1686;
    static boolean aBoolean1458 = true;
    static int anInt1687;
    static String aString1679;
    static int anInt1544;
    static int anInt1685;
    static int anInt1540;
    static boolean[] aBooleanArray1665;
    static int[] anIntArray1708;
    static long aLong1684;
    static String clanChatOwner;
    static int anInt1681;
    static int hintArrowNpcIndex = 0;
    static int anInt1693;
    static int[] anIntArray1688;
    static NodeDeque<ScriptEvent> aNodeDeque1669;
    static Sprite[] aSpriteArray1706;
    static int destinationX;
    static int destinationY;
    static boolean resizableMode;
    static int anInt1694;
    static int anInt1703;
    static boolean aBoolean1707;
    static int anInt1704;
    static boolean[] aBooleanArray1595;
    static int redrawMode;
    static short aShort1439;
    static IgnoredPlayer[] ignoredPlayers;
    static int[] currentLevels;
    static int[] anIntArray1712;
    static AudioEffect[] audioEffects;
    static boolean cameraLocked;
    static boolean[] aBooleanArray1427;
    static int[] anIntArray1601;
    static int[] anIntArray1713;
    static int[] anIntArray1433;
    static int anInt1619;
    static Npc[] npcs;
    static int anInt1541;
    static short aShort1435;
    static int anInt1470 = 0;
    static short aShort1445;
    static short aShort1454;
    static short aShort1446;
    static short aShort1456;
    static int anInt1437;
    static int anInt1432;
    static int viewportWidth;
    static Class162 aClass162_1468;
    static int[] anIntArray1429;
    static int anInt1431;
    static int friendCount;
    static NodeDeque<Projectile> projectiles;
    static int[] anIntArray1659;
    static int anInt1450;
    static int anInt1593;
    static PlayerAppearance aPlayerAppearance1455;
    static GrandExchangeOffer[] grandExchangeOffers;
    static int anInt1436;
    static int[] anIntArray1696;
    static Class43 aClass43_1459;
    static long aLong1460;
    static long aLong1461;
    static int anInt1551;
    static int anInt1487;
    static int anInt1671;
    static Player player;
    static long aLong682;
    static ClientPreferences preferences;

    static {
        aClass55_1491 = Class55.aClass55_422;
        aClass55_1497 = Class55.aClass55_422;
        anInt1492 = 0;
        anInt1487 = 0;
        anInt1490 = 0;
        anInt1502 = 0;
        anInt1505 = 0;
        anInt1499 = 0;
        anInt1503 = 0;
        anInt1506 = 0;
        aByteArray1500 = null;
        npcs = new Npc['耀'];
        anInt1501 = 0;
        npcIndices = new int['耀'];
        anInt1508 = 0;
        anIntArray1507 = new int[250];
        packet = new Packet(5000);
        aPacket1522 = new Packet(5000);
        aPacket1521 = new Packet(15000);
        anInt1514 = 0;
        anInt1511 = 0;
        anInt1518 = 0;
        audioEffectCount = 0;
        anInt1520 = 0;
        anInt1516 = 0;
        anInt1517 = 0;
        specialScript = 0;
        aBoolean1512 = false;
        aHashMap1513 = new HashMap();
        anInt1510 = 0;
        anInt1527 = 1;
        anInt1540 = 0;
        anInt1531 = 1;
        anInt1539 = 0;
        collisionMaps = new CollisionMap[4];
        inInstancedScene = false;
        anIntArrayArrayArray1530 = new int[4][13][13];
        anIntArray1532 = new int[]{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
        anInt1536 = 0;
        anInt1533 = 2;
        anInt1537 = 0;
        anInt1534 = 2;
        anInt1524 = 0;
        anInt1535 = 1;
        anInt1538 = 0;
        mapScale = 0;
        anInt1528 = 2;
        mapOffset = 0;
        anInt1546 = 1;
        anInt1548 = 0;
        anInt1544 = 0;
        anInt1543 = 2301979;
        anInt1545 = 5063219;
        anInt1551 = 3353893;
        anInt1549 = 7759444;
        aBoolean1550 = false;
        anInt1547 = 0;
        anInt1541 = 128;
        mapRotation = 0;
        anInt1574 = 0;
        anInt1563 = 0;
        anInt1575 = 0;
        anInt1558 = 0;
        anInt1573 = 50;
        anInt1569 = 0;
        aBoolean1562 = false;
        anInt1564 = 0;
        anInt1552 = 0;
        anInt1567 = 50;
        anIntArray1572 = new int[anInt1567];
        anIntArray1560 = new int[anInt1567];
        anIntArray1568 = new int[anInt1567];
        anIntArray1554 = new int[anInt1567];
        anIntArray1566 = new int[anInt1567];
        anIntArray1555 = new int[anInt1567];
        anIntArray1556 = new int[anInt1567];
        aStringArray1553 = new String[anInt1567];
        anIntArrayArray1559 = new int[104][104];
        anInt1565 = 0;
        anInt1561 = -1;
        anInt1571 = -1;
        anInt1557 = 0;
        anInt1577 = 0;
        anInt1585 = 0;
        cursorState = 0;
        anInt1587 = 0;
        anInt1581 = 0;
        anInt1588 = 0;
        anInt1579 = 0;
        anInt1592 = 0;
        anInt1590 = 0;
        aBoolean1576 = false;
        anInt1582 = 0;
        anInt1589 = 0;
        players = new Player[2048];
        playerIndex = -1;
        anInt1593 = 0;
        anInt1580 = 0;
        anIntArray1584 = new int[1000];
        anIntArray1607 = new int[]{44, 45, 46, 47, 48, 49, 50, 51};
        playerActions = new String[8];
        aBooleanArray1595 = new boolean[8];
        anIntArray1601 = new int[]{768, 1024, 1280, 512, 1536, 256, 0, 1792};
        anInt1608 = -1;
        pickableNodes = new NodeDeque[4][104][104];
        pendingSpawns = new NodeDeque<>();
        projectiles = new NodeDeque<>();
        graphicsObjects = new NodeDeque<>();
        currentLevels = new int[25];
        levels = new int[25];
        experiences = new int[25];
        anInt1610 = 0;
        menuOpen = false;
        menuRowCount = 0;
        menuSecondaryArgs = new int[500];
        menuTertiaryArgs = new int[500];
        menuOpcodes = new int[500];
        menuPrimaryArgs = new int[500];
        menuActions = new String[500];
        menuTargets = new String[500];
        resizableMode = false;
        anInt1624 = -1;
        aBoolean1628 = false;
        anInt1618 = -1;
        anInt1617 = -1;
        anInt1614 = 0;
        anInt1625 = 50;
        itemSelectionState = 0;
        latestSelectedItemName = null;
        spellSelected = false;
        anInt1629 = -1;
        anInt1619 = -1;
        aString1623 = null;
        aString1616 = null;
        anInt1632 = -1;
        interfaceNodes = new NodeTable<>(8);
        anInt1626 = 0;
        anInt1620 = 0;
        anInterfaceComponent1627 = null;
        energy = 0;
        weight = 0;
        rights = 0;
        anInt1641 = -1;
        aBoolean1636 = false;
        aBoolean1637 = false;
        aBoolean1650 = false;
        anInterfaceComponent1638 = null;
        anInterfaceComponent1647 = null;
        anInterfaceComponent1653 = null;
        anInt1651 = 0;
        anInt1645 = 0;
        anInterfaceComponent1642 = null;
        aBoolean1648 = false;
        anInt1635 = -1;
        anInt1646 = -1;
        aBoolean1639 = false;
        anInt1643 = -1;
        anInt1633 = -1;
        aBoolean1634 = false;
        anInt1644 = 1;
        anIntArray1666 = new int[32];
        anInt1654 = 0;
        anIntArray1670 = new int[32];
        anInt1663 = 0;
        anIntArray1659 = new int[32];
        anInt1662 = 0;
        anInt1668 = 0;
        anInt1660 = 0;
        anInt1657 = 0;
        anInt1667 = 0;
        anInt1672 = 0;
        anInt1658 = 0;
        anInt1671 = 0;
        aNodeDeque1661 = new NodeDeque<>();
        aNodeDeque1675 = new NodeDeque<>();
        aNodeDeque1669 = new NodeDeque<>();
        interfaceConfigs = new NodeTable<>(512);
        anInt1673 = 0;
        anInt1655 = -2;
        aBooleanArray1656 = new boolean[100];
        aBooleanArray1674 = new boolean[100];
        aBooleanArray1665 = new boolean[100];
        interfacePositionsX = new int[100];
        interfacePositionsY = new int[100];
        interfaceWidths = new int[100];
        interfaceHeights = new int[100];
        redrawMode = 35;
        aLong1691 = 0L;
        aBoolean1690 = true;
        anIntArray1686 = new int[]{16776960, 16711680, 65280, 65535, 16711935, 16777215};
        anInt1689 = 0;
        anInt1687 = 0;
        aString1679 = "";
        aLongArray1683 = new long[100];
        anInt1685 = 0;
        anInt1681 = 0;
        anIntArray1688 = new int[128];
        anIntArray1692 = new int[128];
        aLong1684 = -1L;
        clanChatOwner = null;
        clanChatName = null;
        anInt1705 = -1;
        anInt1693 = 0;
        anIntArray1696 = new int[1000];
        anIntArray1700 = new int[1000];
        aSpriteArray1706 = new Sprite[1000];
        destinationX = 0;
        destinationY = 0;
        anInt1698 = 0;
        anInt1694 = 255;
        anInt1703 = -1;
        aBoolean1707 = false;
        anInt1704 = 127;
        anInt1699 = 127;
        anInt1430 = 0;
        anIntArray1709 = new int[50];
        anIntArray1713 = new int[50];
        anIntArray1712 = new int[50];
        anIntArray1429 = new int[50];
        audioEffects = new AudioEffect[50];
        cameraLocked = false;
        aBooleanArray1427 = new boolean[5];
        anIntArray1708 = new int[5];
        anIntArray1428 = new int[5];
        anIntArray1433 = new int[5];
        anIntArray1444 = new int[5];
        aShort1434 = 256;
        aShort1439 = 205;
        aShort1435 = 256;
        aShort1452 = 320;
        aShort1445 = 1;
        aShort1454 = 32767;
        aShort1446 = 1;
        aShort1456 = 32767;
        anInt1437 = 0;
        anInt1432 = 0;
        viewportWidth = 0;
        viewportHeight = 0;
        viewportScale = 0;
        anInt1431 = 0;
        friendCount = 0;
        aClass27Array1449 = new Class27[400];
        aClass139_1441 = new Class139();
        anInt1450 = 0;
        ignoredPlayers = new IgnoredPlayer[400];
        aPlayerAppearance1455 = new PlayerAppearance();
        anInt1440 = -1;
        anInt1436 = 1;
        grandExchangeOffers = new GrandExchangeOffer[8];
        aLong1460 = -1L;
        aLong1461 = -1L;
        aClass113_Sub1_1462 = new Class113_Sub1();
        anIntArray1457 = new int[50];
        anIntArray1467 = new int[50];
    }

    static void method894(String var0) {
        if (Class126.aClanMateArray1370 != null) {
            packet.writeHeader(127);
            packet.method451(Class27.method179(var0));
            packet.method865(var0);
        }
    }

    static void method393(int var0) {
        Node_Sub21_Sub16.aClass42_2097 = new Class42();
        Node_Sub21_Sub16.aClass42_2097.anInt352 = menuSecondaryArgs[var0];
        Node_Sub21_Sub16.aClass42_2097.anInt357 = menuTertiaryArgs[var0];
        Node_Sub21_Sub16.aClass42_2097.anInt354 = menuOpcodes[var0];
        Node_Sub21_Sub16.aClass42_2097.anInt355 = menuPrimaryArgs[var0];
        Node_Sub21_Sub16.aClass42_2097.aString353 = menuActions[var0];
    }

    public static void method332(String var0, Throwable var1) {
        var1.printStackTrace();
    }

    static int method357() {
        return ++Class59.anInt626 - 1;
    }

    public static void method352() {
        try {
            if (Class133.anInt1725 == 1) {
                int var0 = Class133.aNode_Sub10_Sub3_1723.method195();
                if (var0 > 0 && Class133.aNode_Sub10_Sub3_1723.method922()) {
                    var0 -= CollisionMap.anInt1323;
                    if (var0 < 0) {
                        var0 = 0;
                    }

                    Class133.aNode_Sub10_Sub3_1723.method454(var0);
                    return;
                }

                Class133.aNode_Sub10_Sub3_1723.method916();
                Class133.aNode_Sub10_Sub3_1723.method556();
                if (Class133.aReferenceTable1727 != null) {
                    Class133.anInt1725 = 2;
                } else {
                    Class133.anInt1725 = 0;
                }

                Class59.aNode_Sub26_625 = null;
                Class9.aClass85_67 = null;
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            Class133.aNode_Sub10_Sub3_1723.method916();
            Class133.anInt1725 = 0;
            Class59.aNode_Sub26_625 = null;
            Class9.aClass85_67 = null;
            Class133.aReferenceTable1727 = null;
        }

    }

    protected final void method240() {
    }

    public final void init() {
        if (this.method242()) {

           for (int var3 = 0; var3 < new Class184[]{Class184.aClass184_2170, Class184.aClass184_2178, Class184.aClass184_2167, Class184.aClass184_2172, Class184.aClass184_2165, Class184.aClass184_2168, Class184.aClass184_2174, Class184.aClass184_2173, Class184.aClass184_2177, Class184.aClass184_2164, Class184.aClass184_2171, Class184.aClass184_2175, Class184.aClass184_2166, Class184.aClass184_2169, Class184.aClass184_2163}.length; ++var3) {
                Class184 var4 = new Class184[]{Class184.aClass184_2170, Class184.aClass184_2178, Class184.aClass184_2167, Class184.aClass184_2172, Class184.aClass184_2165, Class184.aClass184_2168, Class184.aClass184_2174, Class184.aClass184_2173, Class184.aClass184_2177, Class184.aClass184_2164, Class184.aClass184_2171, Class184.aClass184_2175, Class184.aClass184_2166, Class184.aClass184_2169, Class184.aClass184_2163}[var3];
                String var5 = this.getParameter(var4.aString2176);
                if (var5 != null) {
                    switch (Integer.parseInt(var4.aString2176)) {
                        case 1:
                            currentWorld = Integer.parseInt(var5);
                            break;
                        case 2:
                            anInt1470 = Integer.parseInt(var5);
                            break;
                        case 3:
                            Class147.aString1808 = var5;
                            break;
                        case 4:
                            Class54.anInt418 = Integer.parseInt(var5);
                        case 5:
                        case 8:
                        default:
                            break;
                        case 6:
                            if (var5.equalsIgnoreCase("true")) {
                            }
                            break;
                        case 7:
                           membersWorld = var5.equalsIgnoreCase("true");
                            break;
                        case 9:
                            aClass162_1468 = (Class162) Canvas.method185(Key.method364(), Integer.parseInt(var5));
                            if (Class162.aClass162_1956 == aClass162_1468) {
                                Class2.aClass188_13 = Class188.aClass188_2190;
                            } else {
                                Class2.aClass188_13 = Class188.aClass188_2194;
                            }
                            break;
                        case 10:
                            anInt1463 = Integer.parseInt(var5);
                            break;
                        case 11:
                            currentWorldMask = Integer.parseInt(var5);
                            break;
                        case 12:
                            Class122_Sub1.aString1184 = var5;
                            break;
                        case 13:
                            int var6 = Integer.parseInt(var5);
                            Class155[] var8 = Class75.method445();
                            int var9 = 0;

                            Class155 var11;
                            while (true) {
                                if (var9 >= var8.length) {
                                    var11 = null;
                                    break;
                                }

                                Class155 var10 = var8[var9];
                                if (var10.anInt1841 == var6) {
                                    var11 = var10;
                                    break;
                                }

                                ++var9;
                            }

                            Class65.aClass155_662 = var11;
                            break;
                        case 14:
                            anInt1478 = Integer.parseInt(var5);
                    }
                }
            }

            SceneGraph.aBoolean1232 = false;
            lowMemory = false;
            Class10.aString69 = this.getCodeBase().getHost();
            String var14 = Class65.aClass155_662.aString1840;
            byte var7 = 0;

            try {
                Class33.method218("oldschool", var14, var7, 17);
            } catch (Exception var13) {
                method332(null, var13);
            }

            Class160.aClient1856 = this;
            this.method256(765, 503, 145);
        }
    }

    protected final void method228() {
        ++engineCycle;
        this.method892();

        while (true) {
            NodeDeque var1 = Class165.aNodeDeque2003;
            CacheFile var2;
            synchronized (Class165.aNodeDeque2003) {
                var2 = Class165.aNodeDeque2006.method994();
            }

            if (var2 == null) {
                method352();
                ScriptEvent.method273();
                Class4 var11 = Class4.aClass4_26;
                synchronized (Class4.aClass4_26) {
                    ++Class4.anInt24;
                    Class4.anInt29 = Class4.anInt22;
                    Class4.anInt19 = 0;
                    int var3;
                    if (Class4.anInt20 >= 0) {
                        while (Class4.anInt21 != Class4.anInt20) {
                            var3 = Class4.anIntArray31[Class4.anInt21];
                            Class4.anInt21 = Class4.anInt21 + 1 & 127;
                            if (var3 < 0) {
                                Class4.aBooleanArray23[~var3] = false;
                            } else {
                                if (!Class4.aBooleanArray23[var3] && Class4.anInt19 < Class4.anIntArray25.length - 1) {
                                    Class4.anIntArray25[++Class4.anInt19 - 1] = var3;
                                }

                                Class4.aBooleanArray23[var3] = true;
                            }
                        }
                    } else {
                        for (var3 = 0; var3 < 112; ++var3) {
                            Class4.aBooleanArray23[var3] = false;
                        }

                        Class4.anInt20 = Class4.anInt21;
                    }

                    if (Class4.anInt19 > 0) {
                        Class4.anInt24 = 0;
                    }

                    Class4.anInt22 = Class4.anInt27;
                }

                Class33 var12 = Class33.aClass33_267;
                synchronized (Class33.aClass33_267) {
                    Class33.anInt272 = Class33.anInt257;
                    Class33.anInt261 = Class33.anInt269;
                    Class33.anInt260 = Class33.anInt271;
                    Class33.anInt265 = Class33.anInt258;
                    Class33.anInt255 = Class33.anInt256;
                    Class33.anInt259 = Class33.anInt266;
                    Class33.aLong270 = Class33.aLong268;
                    Class33.anInt258 = 0;
                }

                int var4;
                if (Class14.aClass115_116 != null) {
                    var4 = Class14.aClass115_116.method43();
                    anInt1671 = var4;
                }

                if (connectionState == 0) {
                    Class77.method464();
                    aClass122_303.method665();

                    for (var4 = 0; var4 < 32; ++var4) {
                        aLongArray282[var4] = 0L;
                    }

                    for (var4 = 0; var4 < 32; ++var4) {
                        aLongArray310[var4] = 0L;
                    }

                    anInt290 = 0;
                } else if (connectionState == 5) {
                    Applet_Sub1.method351(this);
                    Class77.method464();
                    aClass122_303.method665();

                    for (var4 = 0; var4 < 32; ++var4) {
                        aLongArray282[var4] = 0L;
                    }

                    for (var4 = 0; var4 < 32; ++var4) {
                        aLongArray310[var4] = 0L;
                    }

                    anInt290 = 0;
                } else if (connectionState != 10 && connectionState != 11) {
                    if (connectionState == 20) {
                        Applet_Sub1.method351(this);
                        this.method889();
                    } else if (connectionState == 25) {
                        Class118.method798();
                    }
                } else {
                    Applet_Sub1.method351(this);
                }

                if (connectionState == 30) {
                    this.method899();
                } else if (connectionState == 40 || connectionState == 45) {
                    this.method889();
                }

                return;
            }

            var2.table.method1131(var2.index, (int) var2.key, var2.buffer, false);
        }
    }

    protected final void method237(boolean var1) {
        boolean var2;
        label165:
        {
            try {
                if (Class133.anInt1725 == 2) {
                    if (Class59.aNode_Sub26_625 == null) {
                        Class59.aNode_Sub26_625 = Node_Sub26.method1044(Class133.aReferenceTable1727, Class133.anInt1728, Class5.anInt38);
                        if (Class59.aNode_Sub26_625 == null) {
                            var2 = false;
                            break label165;
                        }
                    }

                    if (Class9.aClass85_67 == null) {
                        Class9.aClass85_67 = new Class85(Class133.aReferenceTable1724, Class133.aReferenceTable1729);
                    }

                    if (Class133.aNode_Sub10_Sub3_1723.method920(Class59.aNode_Sub26_625, Class133.aReferenceTable1722, Class9.aClass85_67, 22050)) {
                        Class133.aNode_Sub10_Sub3_1723.method935();
                        Class133.aNode_Sub10_Sub3_1723.method454(Class141.anInt1784);
                        Class133.aNode_Sub10_Sub3_1723.method929(Class59.aNode_Sub26_625, Class46.aBoolean371);
                        Class133.anInt1725 = 0;
                        Class59.aNode_Sub26_625 = null;
                        Class9.aClass85_67 = null;
                        Class133.aReferenceTable1727 = null;
                        var2 = true;
                        break label165;
                    }
                }
            } catch (Exception var6) {
                var6.printStackTrace();
                Class133.aNode_Sub10_Sub3_1723.method916();
                Class133.anInt1725 = 0;
                Class59.aNode_Sub26_625 = null;
                Class9.aClass85_67 = null;
                Class133.aReferenceTable1727 = null;
            }

            var2 = false;
        }

        if (var2 && aBoolean1707 && Class105.aClass84_1244 != null) {
            Class105.aClass84_1244.method489();
        }

        if ((connectionState == 10 || connectionState == 20 || connectionState == 30) && 0L != aLong1691 && Class124.method873() > aLong1691) {
            Class1.method4(Node_Sub21_Sub20.method1126());
        }

        int var4;
        if (var1) {
            for (var4 = 0; var4 < 100; ++var4) {
                aBooleanArray1656[var4] = true;
            }
        }

        if (connectionState == 0) {
            this.method238(Login.anInt699, Login.aString686, var1);
        } else if (connectionState == 5) {
            Class2.method12(Class35.aFont313, Class78.aFont838, Boundary.aFont1150, var1);
        } else if (connectionState != 10 && connectionState != 11) {
            if (connectionState == 20) {
                Class2.method12(Class35.aFont313, Class78.aFont838, Boundary.aFont1150, var1);
            } else if (connectionState == 25) {
                if (anInt1539 == 1) {
                    if (anInt1510 > anInt1527) {
                        anInt1527 = anInt1510;
                    }

                    var4 = (anInt1527 * 50 - anInt1510 * 50) / anInt1527;
                    Class122.method811("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
                } else if (anInt1539 == 2) {
                    if (anInt1540 > anInt1531) {
                        anInt1531 = anInt1540;
                    }

                    var4 = (anInt1531 * 50 - anInt1540 * 50) / anInt1531 + 50;
                    Class122.method811("Loading - please wait." + "<br>" + " (" + var4 + "%" + ")", false);
                } else {
                    Class122.method811("Loading - please wait.", false);
                }
            } else if (connectionState == 30) {
                this.method895();
            } else if (connectionState == 40) {
                Class122.method811("Connection lost" + "<br>" + "Please wait - attempting to reestablish", false);
            } else if (connectionState == 45) {
                Class122.method811("Please wait...", false);
            }
        } else {
            Class2.method12(Class35.aFont313, Class78.aFont838, Boundary.aFont1150, var1);
        }

        if (connectionState == 30 && redrawMode == 0 && !var1) {
            for (var4 = 0; var4 < anInt1673; ++var4) {
                if (aBooleanArray1674[var4]) {
                    World.graphicsProvider.method170(interfacePositionsX[var4], interfacePositionsY[var4], interfaceWidths[var4], interfaceHeights[var4]);
                    aBooleanArray1674[var4] = false;
                }
            }
        } else if (connectionState > 0) {
            World.graphicsProvider.method172(0, 0);

            for (var4 = 0; var4 < anInt1673; ++var4) {
                aBooleanArray1674[var4] = false;
            }
        }

    }

    void method892() {
        if (connectionState != 1000) {
            boolean var1 = TilePaint.method662();
            if (!var1) {
                this.method891();
            }

        }
    }

    void method891() {
        if (Class168.anInt2088 >= 4) {
            this.method227("js5crc");
            connectionState = 1000;
        } else {
            if (Class168.anInt2069 >= 4) {
                if (connectionState <= 5) {
                    this.method227("js5io");
                    connectionState = 1000;
                    return;
                }

                anInt1490 = 3000;
                Class168.anInt2069 = 3;
            }

            if (--anInt1490 + 1 <= 0) {
                try {
                    if (anInt1487 == 0) {
                        Class33.aClass103_262 = aClass108_301.method749(Class10.aString69, Buffer.anInt1363);
                        ++anInt1487;
                    }

                    if (anInt1487 == 1) {
                        if (Class33.aClass103_262.anInt1162 == 2) {
                            this.method901(-1);
                            return;
                        }

                        if (Class33.aClass103_262.anInt1162 == 1) {
                            ++anInt1487;
                        }
                    }

                    if (anInt1487 == 2) {
                        Class51.aSocket380 = new Socket((java.net.Socket) Class33.aClass103_262.anObject1161, aClass108_301);
                        Buffer var1 = new Buffer(5);
                        var1.method451(15);
                        var1.method869(145);
                        Class51.aSocket380.method885(var1.payload, 0, 5);
                        ++anInt1487;
                        aLong1489 = Class124.method873();
                    }

                    if (anInt1487 == 3) {
                        if (connectionState > 5 && Class51.aSocket380.method884() <= 0) {
                            if (Class124.method873() - aLong1489 > 30000L) {
                                this.method901(-2);
                                return;
                            }
                        } else {
                            int var2 = Class51.aSocket380.method886();
                            if (var2 != 0) {
                                this.method901(var2);
                                return;
                            }

                            ++anInt1487;
                        }
                    }

                    if (anInt1487 == 4) {
                        Class105.method721(Class51.aSocket380, connectionState > 20);
                        Class33.aClass103_262 = null;
                        Class51.aSocket380 = null;
                        anInt1487 = 0;
                        anInt1502 = 0;
                    }
                } catch (IOException var3) {
                    this.method901(-3);
                }

            }
        }
    }

    final void method889() {
        try {
            if (anInt1505 == 0) {
                if (InterfaceNode.aSocket317 != null) {
                    InterfaceNode.aSocket317.method882();
                    InterfaceNode.aSocket317 = null;
                }

                Class78.aClass103_839 = null;
                aBoolean1512 = false;
                anInt1499 = 0;
                anInt1505 = 1;
            }

            if (anInt1505 == 1) {
                if (Class78.aClass103_839 == null) {
                    Class78.aClass103_839 = aClass108_301.method749(Class10.aString69, Buffer.anInt1363);
                }

                if (Class78.aClass103_839.anInt1162 == 2) {
                    throw new IOException();
                }

                if (Class78.aClass103_839.anInt1162 == 1) {
                    InterfaceNode.aSocket317 = new Socket((java.net.Socket) Class78.aClass103_839.anObject1161, aClass108_301);
                    Class78.aClass103_839 = null;
                    anInt1505 = 2;
                }
            }

            if (anInt1505 == 2) {
                packet.caret = 0;
                packet.method451(14);
                InterfaceNode.aSocket317.method885(packet.payload, 0, 1);
                aPacket1521.caret = 0;
                anInt1505 = 3;
            }

            int var1;
            if (anInt1505 == 3) {
                if (Class105.aClass84_1244 != null) {
                    Class105.aClass84_1244.method488();
                }

                if (Player.aClass84_231 != null) {
                    Player.aClass84_231.method488();
                }

                var1 = InterfaceNode.aSocket317.method886();
                if (Class105.aClass84_1244 != null) {
                    Class105.aClass84_1244.method488();
                }

                if (Player.aClass84_231 != null) {
                    Player.aClass84_231.method488();
                }

                if (var1 != 0) {
                    Node_Sub21_Sub1.method181(var1);
                    return;
                }

                aPacket1521.caret = 0;
                anInt1505 = 4;
            }

            if (anInt1505 == 4) {
                if (aPacket1521.caret < 8) {
                    var1 = InterfaceNode.aSocket317.method884();
                    if (var1 > 8 - aPacket1521.caret) {
                        var1 = 8 - aPacket1521.caret;
                    }

                    if (var1 > 0) {
                        InterfaceNode.aSocket317.method883(aPacket1521.payload, aPacket1521.caret, var1);
                        aPacket1521.caret += var1;
                    }
                }

                if (aPacket1521.caret == 8) {
                    aPacket1521.caret = 0;
                    aLong682 = aPacket1521.method837();
                    anInt1505 = 5;
                }
            }

            int var3;
            int var4;
            if (anInt1505 == 5) {
                int[] var2 = new int[]{(int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (aLong682 >> 32), (int) (aLong682 & -1L)};
                packet.caret = 0;
                packet.method451(1);
                packet.method451(Login.aClass109_693.ordinal());
                packet.method869(var2[0]);
                packet.method869(var2[1]);
                packet.method869(var2[2]);
                packet.method869(var2[3]);
                switch (Login.aClass109_693.anInt157) {
                    case 0:
                    case 2:
                        packet.method867(World.anInt392);
                        packet.caret += 5;
                        break;
                    case 1:
                        packet.caret += 8;
                        break;
                    case 3:
                        packet.method869(((Integer) preferences.properties.get(Class71.method418(Login.username))).intValue());
                        packet.caret += 4;
                }

                packet.method865(Login.password);
                packet.method830(Class57.aBigInteger432, Class57.aBigInteger434);
                aPacket1522.caret = 0;
                if (connectionState == 40) {
                    aPacket1522.method451(18);
                } else {
                    aPacket1522.method451(16);
                }

                aPacket1522.method755(0);
                var3 = aPacket1522.caret;
                aPacket1522.method869(145);
                aPacket1522.method860(packet.payload, 0, packet.caret);
                var4 = aPacket1522.caret;
                aPacket1522.method865(Login.username);
                aPacket1522.method451((aBoolean1690 ? 1 : 0) << 1 | (lowMemory ? 1 : 0));
                aPacket1522.method755(AxisAlignedBoundingBox.appletWidth);
                aPacket1522.method755(Class64.appletHeight);
                Class177.method1189(aPacket1522);
                aPacket1522.method865(Class147.aString1808);
                aPacket1522.method869(anInt1478);
                Buffer var5 = new Buffer(Class62.aNode_Sub28_635.method591());
                Class62.aNode_Sub28_635.method1052(var5);
                aPacket1522.method860(var5.payload, 0, var5.payload.length);
                aPacket1522.method451(Class54.anInt418);
                aPacket1522.method869(0);
                aPacket1522.method869(aCacheReferenceTable1493.anInt2048);
                aPacket1522.method869(aCacheReferenceTable1496.anInt2048);
                aPacket1522.method869(Class73.aCacheReferenceTable741.anInt2048);
                aPacket1522.method869(BoundingBox.aCacheReferenceTable372.anInt2048);
                aPacket1522.method869(Class34.aCacheReferenceTable274.anInt2048);
                aPacket1522.method869(Class126.aCacheReferenceTable1368.anInt2048);
                aPacket1522.method869(Class100.aCacheReferenceTable1119.anInt2048);
                aPacket1522.method869(Class76.aCacheReferenceTable823.anInt2048);
                aPacket1522.method869(Class21.aCacheReferenceTable139.anInt2048);
                aPacket1522.method869(Class60.aCacheReferenceTable630.anInt2048);
                aPacket1522.method869(Class82.aCacheReferenceTable848.anInt2048);
                aPacket1522.method869(Applet_Sub1.aCacheReferenceTable681.anInt2048);
                aPacket1522.method869(ScriptEvent.aCacheReferenceTable322.anInt2048);
                aPacket1522.method869(Class2.aCacheReferenceTable8.anInt2048);
                aPacket1522.method869(Class147.aCacheReferenceTable1810.anInt2048);
                aPacket1522.method869(Class119.aCacheReferenceTable1357.anInt2048);
                aPacket1522.method869(Class73.aCacheReferenceTable740.anInt2048);
                aPacket1522.method824(var2, var4, aPacket1522.caret);
                aPacket1522.method866(aPacket1522.caret - var3);
                InterfaceNode.aSocket317.method885(aPacket1522.payload, 0, aPacket1522.caret);
                packet.method787(var2);

                for (int var6 = 0; var6 < 4; ++var6) {
                    var2[var6] += 50;
                }

                aPacket1521.method787(var2);
                anInt1505 = 6;
            }

            if (anInt1505 == 6 && InterfaceNode.aSocket317.method884() > 0) {
                var1 = InterfaceNode.aSocket317.method886();
                if (var1 == 21 && connectionState == 20) {
                    anInt1505 = 7;
                } else if (var1 == 2) {
                    anInt1505 = 9;
                } else if (var1 == 15 && connectionState == 40) {
                    anInt1514 = -1;
                    anInt1505 = 13;
                } else if (var1 == 23 && anInt1503 < 1) {
                    ++anInt1503;
                    anInt1505 = 0;
                } else {
                    if (var1 != 29) {
                        Node_Sub21_Sub1.method181(var1);
                        return;
                    }

                    anInt1505 = 11;
                }
            }

            if (anInt1505 == 7 && InterfaceNode.aSocket317.method884() > 0) {
                anInt1506 = (InterfaceNode.aSocket317.method886() + 3) * 60;
                anInt1505 = 8;
            }

            if (anInt1505 == 8) {
                anInt1499 = 0;
                Class22.setLoginResponse("You have only just leftSpriteId another world.", "Your profile will be transferred in:", anInt1506 / 60 + " seconds.");
                if (--anInt1506 <= 0) {
                    anInt1505 = 0;
                }

            } else {
                boolean var14;
                if (anInt1505 == 9 && InterfaceNode.aSocket317.method884() >= 13) {
                    boolean var12 = InterfaceNode.aSocket317.method886() == 1;
                    InterfaceNode.aSocket317.method883(aPacket1521.payload, 0, 4);
                    aPacket1521.caret = 0;
                    var14 = false;
                    if (var12) {
                        var3 = aPacket1521.method784() << 24;
                        var3 |= aPacket1521.method784() << 16;
                        var3 |= aPacket1521.method784() << 8;
                        var3 |= aPacket1521.method784();
                        var4 = Class71.method418(Login.username);
                        if (preferences.properties.size() >= 10 && !preferences.properties.containsKey(var4)) {
                            Iterator var15 = preferences.properties.entrySet().iterator();
                            var15.next();
                            var15.remove();
                        }

                        preferences.properties.put(var4, var3);
                        Class78.method467();
                    }

                    rights = InterfaceNode.aSocket317.method886();
                    aBoolean1636 = InterfaceNode.aSocket317.method886() == 1;
                    playerIndex = InterfaceNode.aSocket317.method886();
                    playerIndex <<= 8;
                    playerIndex += InterfaceNode.aSocket317.method886();
                    anInt1593 = InterfaceNode.aSocket317.method886();
                    InterfaceNode.aSocket317.method883(aPacket1521.payload, 0, 1);
                    aPacket1521.caret = 0;
                    anInt1511 = aPacket1521.method784();
                    InterfaceNode.aSocket317.method883(aPacket1521.payload, 0, 2);
                    aPacket1521.caret = 0;
                    anInt1514 = aPacket1521.readUnsignedShort();

                    try {
                        Client var7 = Class160.aClient1856;
                        JSObject.getWindow(var7).call("zap", (Object[]) null);
                    } catch (Throwable var9) {
                    }

                    anInt1505 = 10;
                }

                if (anInt1505 != 10) {
                    if (anInt1505 == 11 && InterfaceNode.aSocket317.method884() >= 2) {
                        aPacket1521.caret = 0;
                        InterfaceNode.aSocket317.method883(aPacket1521.payload, 0, 2);
                        aPacket1521.caret = 0;
                        Class22.anInt148 = aPacket1521.readUnsignedShort();
                        anInt1505 = 12;
                    }

                    if (anInt1505 == 12 && InterfaceNode.aSocket317.method884() >= Class22.anInt148) {
                        aPacket1521.caret = 0;
                        InterfaceNode.aSocket317.method883(aPacket1521.payload, 0, Class22.anInt148);
                        aPacket1521.caret = 0;
                        String var13 = aPacket1521.method819();
                        String var17 = aPacket1521.method819();
                        String var16 = aPacket1521.method819();
                        Class22.setLoginResponse(var13, var17, var16);
                        Class45.method304(10);
                    }

                    if (anInt1505 == 13) {
                        if (anInt1514 == -1) {
                            if (InterfaceNode.aSocket317.method884() < 2) {
                                return;
                            }

                            InterfaceNode.aSocket317.method883(aPacket1521.payload, 0, 2);
                            aPacket1521.caret = 0;
                            anInt1514 = aPacket1521.readUnsignedShort();
                        }

                        if (InterfaceNode.aSocket317.method884() >= anInt1514) {
                            InterfaceNode.aSocket317.method883(aPacket1521.payload, 0, anInt1514);
                            aPacket1521.caret = 0;
                            var1 = anInt1514;
                            Tile.method664();
                            Class36.method263(aPacket1521);
                            if (aPacket1521.caret != var1) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        ++anInt1499;
                        if (anInt1499 > 2000) {
                            if (anInt1503 < 1) {
                                if (Class22.anInt151 == Buffer.anInt1363) {
                                    Buffer.anInt1363 = Class61.anInt632;
                                } else {
                                    Buffer.anInt1363 = Class22.anInt151;
                                }

                                ++anInt1503;
                                anInt1505 = 0;
                            } else {
                                Node_Sub21_Sub1.method181(-3);
                            }
                        }
                    }
                } else {
                    if (InterfaceNode.aSocket317.method884() >= anInt1514) {
                        aPacket1521.caret = 0;
                        InterfaceNode.aSocket317.method883(aPacket1521.payload, 0, anInt1514);
                        aLong1465 = -1L;
                        anInt1480 = -1;
                        mouseRecorder.index = 0;
                        Class42.aBoolean356 = true;
                        aBoolean1473 = true;
                        aLong1684 = -1L;
                        Class171.aLinkedList2124 = new LinkedList<>();
                        packet.caret = 0;
                        aPacket1521.caret = 0;
                        anInt1511 = -1;
                        anInt1520 = 1;
                        anInt1516 = -1;
                        anInt1517 = -1;
                        anInt1518 = 0;
                        anInt1466 = 0;
                        specialScript = 0;
                        anInt1485 = 0;
                        menuRowCount = 0;
                        anInt1624 = -1;
                        menuOpen = false;
                        Class17.method134(0);
                        Class59.aMap624.clear();
                        Class59.A_ITERABLE_NODE_TABLE___628.clear();
                        Class59.aClass142_627.method979();
                        Class59.anInt626 = 0;
                        itemSelectionState = 0;
                        spellSelected = false;
                        anInt1430 = 0;
                        anInt1536 = (int) (Math.random() * 100.0D) - 50;
                        anInt1537 = (int) (Math.random() * 110.0D) - 55;
                        anInt1524 = (int) (Math.random() * 80.0D) - 40;
                        mapScale = (int) (Math.random() * 120.0D) - 60;
                        mapOffset = (int) (Math.random() * 30.0D) - 20;
                        mapRotation = (int) (Math.random() * 20.0D) - 10 & 2047;
                        anInt1698 = 0;
                        anInt1705 = -1;
                        destinationX = 0;
                        destinationY = 0;
                        aClass55_1491 = Class55.aClass55_422;
                        aClass55_1497 = Class55.aClass55_422;
                        anInt1501 = 0;
                        Class50.method317();

                        for (var1 = 0; var1 < 2048; ++var1) {
                            players[var1] = null;
                        }

                        for (var1 = 0; var1 < 32768; ++var1) {
                            npcs[var1] = null;
                        }

                        anInt1608 = -1;
                        projectiles.method989();
                        graphicsObjects.method989();

                        for (var1 = 0; var1 < 4; ++var1) {
                            for (var3 = 0; var3 < 104; ++var3) {
                                for (var4 = 0; var4 < 104; ++var4) {
                                    pickableNodes[var1][var3][var4] = null;
                                }
                            }
                        }

                        pendingSpawns = new NodeDeque<>();
                        friendCount = 0;
                        anInt1431 = 0;
                        anInt1450 = 0;

                        for (var1 = 0; var1 < Node_Sub21_Sub20.anInt209; ++var1) {
                            Node_Sub21_Sub20 var8 = Class74.method436(var1);
                            if (var8 != null) {
                                Varps.anIntArray2000[var1] = 0;
                                Varps.values[var1] = 0;
                            }
                        }

                        Class34.aClass67_277.method403();
                        anInt1641 = -1;
                        if (anInt1632 != -1) {
                            var1 = anInt1632;
                            if (var1 != -1 && Class70.aBooleanArray716[var1]) {
                                Class51.aReferenceTable382.method1089(var1);
                                if (InterfaceComponent.interfaces[var1] != null) {
                                    var14 = true;

                                    for (var4 = 0; var4 < InterfaceComponent.interfaces[var1].length; ++var4) {
                                        if (InterfaceComponent.interfaces[var1][var4] != null) {
                                            if (InterfaceComponent.interfaces[var1][var4].type != 2) {
                                                InterfaceComponent.interfaces[var1][var4] = null;
                                            } else {
                                                var14 = false;
                                            }
                                        }
                                    }

                                    if (var14) {
                                        InterfaceComponent.interfaces[var1] = null;
                                    }

                                    Class70.aBooleanArray716[var1] = false;
                                }
                            }
                        }

                        for (InterfaceNode var11 = interfaceNodes.first(); var11 != null; var11 = interfaceNodes.next()) {
                            Class134_Sub1.method216(var11, true);
                        }

                        anInt1632 = -1;
                        interfaceNodes = new NodeTable<>(8);
                        anInterfaceComponent1627 = null;
                        menuRowCount = 0;
                        anInt1624 = -1;
                        menuOpen = false;
                        aPlayerAppearance1455.method1037(null, new int[]{0, 0, 0, 0, 0}, false, -1);

                        for (var1 = 0; var1 < 8; ++var1) {
                            playerActions[var1] = null;
                            aBooleanArray1595[var1] = false;
                        }

                        ItemTable.itemTables = new NodeTable<>(32);
                        aBoolean1484 = true;

                        for (var1 = 0; var1 < 100; ++var1) {
                            aBooleanArray1656[var1] = true;
                        }

                        Class34.method224();
                        clanChatOwner = null;
                        GrandExchangeOffer.anInt738 = 0;
                        Class126.aClanMateArray1370 = null;

                        for (var1 = 0; var1 < 8; ++var1) {
                            grandExchangeOffers[var1] = new GrandExchangeOffer();
                        }

                        aClass43_1459 = null;
                        Class36.method263(aPacket1521);
                        Class13.anInt102 = -1;
                        Class45.method305(false);
                        anInt1511 = -1;
                    }

                }
            }
        } catch (IOException var10) {
            if (anInt1503 < 1) {
                if (Class22.anInt151 == Buffer.anInt1363) {
                    Buffer.anInt1363 = Class61.anInt632;
                } else {
                    Buffer.anInt1363 = Class22.anInt151;
                }

                ++anInt1503;
                anInt1505 = 0;
            } else {
                Node_Sub21_Sub1.method181(-2);
            }
        }
    }

    void method903() {
        int var1 = AxisAlignedBoundingBox.appletWidth;
        int var2 = Class64.appletHeight;
        if (this.anInt293 < var1) {
            var1 = this.anInt293;
        }

        if (this.anInt305 < var2) {
            var2 = this.anInt305;
        }

        if (preferences != null) {
            try {
                Class29.method189(Class160.aClient1856, "resize", new Object[]{Node_Sub21_Sub20.method1126()});
            } catch (Throwable var4) {
            }
        }

    }

    final void method898() {
        Class21.method145();
        if (Class118.anInterfaceComponent1348 == null) {
            if (anInterfaceComponent1647 == null) {
                int var2;
                int var4;
                int var5;
                int var19;
                label287:
                {
                    int var1 = Class33.anInt265;
                    int var3;
                    int var6;
                    int var8;
                    int var11;
                    if (menuOpen) {
                        if (var1 != 1 && (Class163.aBoolean1965 || var1 != 4)) {
                            var2 = Class33.anInt261;
                            var3 = Class33.anInt260;
                            if (var2 < Class84.anInt861 - 10 || var2 > Class108.anInt1299 + Class84.anInt861 + 10 || var3 < Class77.anInt833 - 10 || var3 > Class3.anInt16 + Class77.anInt833 + 10) {
                                menuOpen = false;
                                Class50.method319(Class84.anInt861, Class77.anInt833, Class108.anInt1299, Class3.anInt16);
                            }
                        }

                        if (var1 == 1 || !Class163.aBoolean1965 && var1 == 4) {
                            var2 = Class84.anInt861;
                            var3 = Class77.anInt833;
                            var4 = Class108.anInt1299;
                            var5 = Class33.anInt255;
                            var6 = Class33.anInt259;
                            int var18 = -1;

                            for (var8 = 0; var8 < menuRowCount; ++var8) {
                                var19 = var3 + 31 + (menuRowCount - 1 - var8) * 15;
                                if (var5 > var2 && var5 < var4 + var2 && var6 > var19 - 13 && var6 < var19 + 3) {
                                    var18 = var8;
                                }
                            }

                            if (var18 != -1 && var18 >= 0) {
                                var8 = menuSecondaryArgs[var18];
                                var19 = menuTertiaryArgs[var18];
                                var11 = menuOpcodes[var18];
                                int var12 = menuPrimaryArgs[var18];
                                String var13 = menuActions[var18];
                                String var14 = menuTargets[var18];
                                Class94.method620(var8, var19, var11, var12, var13, var14, Class33.anInt255, Class33.anInt259);
                            }

                            menuOpen = false;
                            Class50.method319(Class84.anInt861, Class77.anInt833, Class108.anInt1299, Class3.anInt16);
                        }
                    } else {
                        var2 = Class158.method1013();
                        if ((var1 == 1 || !Class163.aBoolean1965 && var1 == 4) && var2 >= 0) {
                            var3 = menuOpcodes[var2];
                            if (var3 == 39 || var3 == 40 || var3 == 41 || var3 == 42 || var3 == 43 || var3 == 33 || var3 == 34 || var3 == 35 || var3 == 36 || var3 == 37 || var3 == 38 || var3 == 1005) {
                                var4 = menuSecondaryArgs[var2];
                                var5 = menuTertiaryArgs[var2];
                                InterfaceComponent var10 = Class161.method1016(var5);
                                var8 = Class75.method448(var10);
                                boolean var7 = (var8 >> 28 & 1) != 0;
                                if (var7) {
                                    break label287;
                                }

                                var11 = Class75.method448(var10);
                                boolean var9 = (var11 >> 29 & 1) != 0;
                                if (var9) {
                                    break label287;
                                }
                            }
                        }

                        if (var1 == 1 || !Class163.aBoolean1965 && var1 == 4) {
                            label293:
                            {
                                label210:
                                {
                                    if (anInt1610 == 1 && menuRowCount > 2) {
                                        boolean var17;
                                        if (menuRowCount <= 0) {
                                            var17 = false;
                                        } else var17 = aBoolean1628 && Class4.aBooleanArray23[81] && anInt1624 != -1;

                                        if (!var17) {
                                            break label210;
                                        }
                                    }

                                    if (!Class12.method66(var2)) {
                                        break label293;
                                    }
                                }

                                var1 = 2;
                            }
                        }

                        if ((var1 == 1 || !Class163.aBoolean1965 && var1 == 4) && menuRowCount > 0 && var2 >= 0) {
                            var3 = menuSecondaryArgs[var2];
                            var4 = menuTertiaryArgs[var2];
                            var5 = menuOpcodes[var2];
                            var6 = menuPrimaryArgs[var2];
                            String var15 = menuActions[var2];
                            String var16 = menuTargets[var2];
                            Class94.method620(var3, var4, var5, var6, var15, var16, Class33.anInt255, Class33.anInt259);
                        }

                        if (var1 == 2 && menuRowCount > 0) {
                            this.method897(Class33.anInt255, Class33.anInt259);
                        }
                    }

                    return;
                }

                if (Class118.anInterfaceComponent1348 != null && !aBoolean1576) {
                    var19 = Class158.method1013();
                    if (anInt1610 != 1 && !Class12.method66(var19) && menuRowCount > 0) {
                        Node_Sub21_Sub1.method184(anInt1579, anInt1592);
                    }
                }

                aBoolean1576 = false;
                anInt1582 = 0;
                if (Class118.anInterfaceComponent1348 != null) {
                    ItemTable.method284(Class118.anInterfaceComponent1348);
                }

                Class118.anInterfaceComponent1348 = Class161.method1016(var5);
                anInt1588 = var4;
                anInt1579 = Class33.anInt255;
                anInt1592 = Class33.anInt259;
                if (var2 >= 0) {
                    method393(var2);
                }

                ItemTable.method284(Class118.anInterfaceComponent1348);
            }
        }
    }

    final void method897(int var1, int var2) {
        int var3 = Class35.aFont313.getTextWidth("Choose Option");

        int var4;
        for (var4 = 0; var4 < menuRowCount; ++var4) {
            Font var5 = Class35.aFont313;
            String var6;
            if (var4 < 0) {
                var6 = "";
            } else if (menuTargets[var4].length() > 0) {
                var6 = menuActions[var4] + " " + menuTargets[var4];
            } else {
                var6 = menuActions[var4];
            }

            int var7 = var5.getTextWidth(var6);
            if (var7 > var3) {
                var3 = var7;
            }
        }

        var3 += 8;
        var4 = menuRowCount * 15 + 22;
        int var8 = var1 - var3 / 2;
        if (var3 + var8 > AxisAlignedBoundingBox.appletWidth) {
            var8 = AxisAlignedBoundingBox.appletWidth - var3;
        }

        if (var8 < 0) {
            var8 = 0;
        }

        int var9 = var2;
        if (var2 + var4 > Class64.appletHeight) {
            var9 = Class64.appletHeight - var4;
        }

        if (var9 < 0) {
            var9 = 0;
        }

        Class60.aSceneGraph631.method676(Player.floorLevel, var1, var2, false);
        menuOpen = true;
        Class84.anInt861 = var8;
        Class77.anInt833 = var9;
        Class108.anInt1299 = var3;
        Class3.anInt16 = menuRowCount * 15 + 22;
    }

    void method900(InterfaceComponent var1) {
        InterfaceComponent var2 = var1.parentUid == -1 ? null : Class161.method1016(var1.parentUid);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = AxisAlignedBoundingBox.appletWidth;
            var4 = Class64.appletHeight;
        } else {
            var3 = var2.width;
            var4 = var2.height;
        }

        Node_Sub21_Sub7.method1053(var1, var3, var4, false);
        RuntimeException_Sub1.method743(var1, var3, var4);
    }

    protected final void method236() {
        Class22.anInt151 = anInt1470 == 0 ? 'ꩊ' : currentWorld + '鱀';
        Class61.anInt632 = anInt1470 == 0 ? 443 : currentWorld + '썐';
        Buffer.anInt1363 = Class22.anInt151;
        PlayerAppearance.aShortArray1991 = Class164.aShortArray1994;
        Legacy2DBoundingBox.aShortArrayArray399 = Class164.aShortArrayArray1997;
        PlayerAppearance.aShortArray1988 = Class164.aShortArray1996;
        PlayerAppearance.equipmentColorReplacements = Class164.aShortArrayArray1995;
        this.method252();
        this.method246();
        Class14.aClass115_116 = this.method247();
        BoundingBox.aCacheIndex373 = new CacheIndex(255, Class97.aClass93_1080, Class97.aClass93_1077, 500000);
        Class82 var1 = null;
        ClientPreferences var2 = new ClientPreferences();

        try {
            var1 = TextureProviderImpl.method502("", aClass162_1468.aString1955, false);
            byte[] var3 = new byte[(int) var1.method475()];

            int var5;
            for (int var4 = 0; var4 < var3.length; var4 += var5) {
                var5 = var1.method477(var3, var4, var3.length - var4);
                if (var5 == -1) {
                    throw new IOException();
                }
            }

            var2 = new ClientPreferences(new Buffer(var3));
        } catch (Exception var8) {
        }

        try {
            if (var1 != null) {
                var1.method476();
            }
        } catch (Exception var7) {
        }

        preferences = var2;
        this.method253();
        Class44.method301(this, MouseRecorder.aString248);
        if (anInt1470 != 0) {
            showFps = true;
        }

        Class1.method4(preferences.resizable);
    }

    final void method893() {
        ItemTable.method284(anInterfaceComponent1647);
        ++Class2.anInt9;
        if (aBoolean1639 && aBoolean1648) {
            int var1 = Class33.anInt261;
            int var2 = Class33.anInt260;
            var1 -= anInt1651;
            var2 -= anInt1645;
            if (var1 < anInt1635) {
                var1 = anInt1635;
            }

            if (anInterfaceComponent1647.width + var1 > anInt1635 + anInterfaceComponent1653.width) {
                var1 = anInterfaceComponent1653.width + anInt1635 - anInterfaceComponent1647.width;
            }

            if (var2 < anInt1646) {
                var2 = anInt1646;
            }

            if (var2 + anInterfaceComponent1647.height > anInt1646 + anInterfaceComponent1653.height) {
                var2 = anInterfaceComponent1653.height + anInt1646 - anInterfaceComponent1647.height;
            }

            int var3 = var1 - anInt1643;
            int var4 = var2 - anInt1633;
            int var5 = anInterfaceComponent1647.anInt1892;
            if (Class2.anInt9 > anInterfaceComponent1647.anInt1889 && (var3 > var5 || var3 < -var5 || var4 > var5 || var4 < -var5)) {
                aBoolean1634 = true;
            }

            int var6 = anInterfaceComponent1653.insetX + (var1 - anInt1635);
            int var7 = var2 - anInt1646 + anInterfaceComponent1653.insetY;
            ScriptEvent var8;
            if (anInterfaceComponent1647.anObjectArray1903 != null && aBoolean1634) {
                var8 = new ScriptEvent();
                var8.source = anInterfaceComponent1647;
                var8.anInt232 = var6;
                var8.anInt327 = var7;
                var8.args = anInterfaceComponent1647.anObjectArray1903;
                Class25.method174(var8);
            }

            if (Class33.anInt272 == 0) {
                if (aBoolean1634) {
                    if (anInterfaceComponent1647.anObjectArray1906 != null) {
                        var8 = new ScriptEvent();
                        var8.source = anInterfaceComponent1647;
                        var8.anInt232 = var6;
                        var8.anInt327 = var7;
                        var8.anInterfaceComponent323 = anInterfaceComponent1642;
                        var8.args = anInterfaceComponent1647.anObjectArray1906;
                        Class25.method174(var8);
                    }

                    if (anInterfaceComponent1642 != null && Class36.method264(anInterfaceComponent1647) != null) {
                        packet.writeHeader(97);
                        packet.method842(anInterfaceComponent1642.uid);
                        packet.method843(anInterfaceComponent1642.componentIndex);
                        packet.method853(anInterfaceComponent1647.componentIndex);
                        packet.method842(anInterfaceComponent1647.uid);
                        packet.method755(anInterfaceComponent1642.itemId);
                        packet.method853(anInterfaceComponent1647.itemId);
                    }
                } else {
                    label132:
                    {
                        int var9 = Class158.method1013();
                        if (menuRowCount > 2) {
                            label129:
                            {
                                label97:
                                {
                                    if (anInt1610 == 1) {
                                        boolean var10;
                                        if (menuRowCount <= 0) {
                                            var10 = false;
                                        } else var10 = aBoolean1628 && Class4.aBooleanArray23[81] && anInt1624 != -1;

                                        if (!var10) {
                                            break label97;
                                        }
                                    }

                                    if (!Class12.method66(var9)) {
                                        break label129;
                                    }
                                }

                                this.method897(anInt1651 + anInt1643, anInt1645 + anInt1633);
                                break label132;
                            }
                        }

                        if (menuRowCount > 0) {
                            Node_Sub21_Sub1.method184(anInt1651 + anInt1643, anInt1645 + anInt1633);
                        }
                    }
                }

                anInterfaceComponent1647 = null;
            }

        } else {
            if (Class2.anInt9 > 1) {
                anInterfaceComponent1647 = null;
            }

        }
    }

    final void method896(boolean var1) {
        int var2 = anInt1632;
        int var3 = AxisAlignedBoundingBox.appletWidth;
        int var4 = Class64.appletHeight;
        if (Class33.method220(var2)) {
            ClanMate.method207(InterfaceComponent.interfaces[var2], -1, var3, var4, var1);
        }

    }

    void method901(int var1) {
        Class33.aClass103_262 = null;
        Class51.aSocket380 = null;
        anInt1487 = 0;
        if (Class22.anInt151 == Buffer.anInt1363) {
            Buffer.anInt1363 = Class61.anInt632;
        } else {
            Buffer.anInt1363 = Class22.anInt151;
        }

        ++anInt1502;
        if (anInt1502 >= 2 && (var1 == 7 || var1 == 9)) {
            if (connectionState <= 5) {
                this.method227("js5connect_full");
                connectionState = 1000;
            } else {
                anInt1490 = 3000;
            }
        } else if (anInt1502 >= 2 && var1 == 6) {
            this.method227("js5connect_outofdate");
            connectionState = 1000;
        } else if (anInt1502 >= 4) {
            if (connectionState <= 5) {
                this.method227("js5connect");
                connectionState = 1000;
            } else {
                anInt1490 = 3000;
            }
        }

    }

    protected final void method241() {
        if (Class34.aClass67_277.method399()) {
            Class34.aClass67_277.method404();
        }

        if (mouseRecorder != null) {
            mouseRecorder.enabled = false;
        }

        mouseRecorder = null;
        if (InterfaceNode.aSocket317 != null) {
            InterfaceNode.aSocket317.method882();
            InterfaceNode.aSocket317 = null;
        }

        Class94.method619();
        if (Class33.aClass33_267 != null) {
            Class33 var1 = Class33.aClass33_267;
            synchronized (Class33.aClass33_267) {
                Class33.aClass33_267 = null;
            }
        }

        Class14.aClass115_116 = null;
        if (Class105.aClass84_1244 != null) {
            Class105.aClass84_1244.method490();
        }

        if (Player.aClass84_231 != null) {
            Player.aClass84_231.method490();
        }

        if (Class168.aSocket2082 != null) {
            Class168.aSocket2082.method882();
        }

        NpcDefinition.method335();
        Class61.method375();
    }

    final void method899() {
        if (anInt1466 > 1) {
            --anInt1466;
        }

        if (specialScript > 0) {
            --specialScript;
        }

        if (aBoolean1512) {
            aBoolean1512 = false;
            if (specialScript > 0) {
                TextureProviderImpl.method499();
            } else {
                Class45.method304(40);
                Class154.aSocket1833 = InterfaceNode.aSocket317;
                InterfaceNode.aSocket317 = null;
            }

        } else {
            if (!menuOpen) {
                menuRowCount = 0;
                anInt1624 = -1;
                menuOpen = false;
                menuActions[0] = "Cancel";
                menuTargets[0] = "";
                menuOpcodes[0] = 1006;
                menuRowCount = 1;
            }

            int var1;
            for (var1 = 0; var1 < 100 && this.method902(); ++var1) {
            }

            if (connectionState == 30) {
                while (Class70.method417()) {
                    packet.writeHeader(160);
                    packet.method451(0);
                    var1 = packet.caret;
                    Node_Sub21_Sub20.method1127(packet);
                    packet.method862(packet.caret - var1);
                }

                Object var2 = mouseRecorder.anObject250;
                int var3;
                int var4;
                int var5;
                int var6;
                int var7;
                int var8;
                int var9;
                int var10;
                synchronized (mouseRecorder.anObject250) {
                    if (!aBoolean1458) {
                        mouseRecorder.index = 0;
                    } else if (Class33.anInt265 != 0 || mouseRecorder.index >= 40) {
                        packet.writeHeader(168);
                        packet.method451(0);
                        var3 = packet.caret;
                        var4 = 0;

                        for (var5 = 0; var5 < mouseRecorder.index && packet.caret - var3 < 240; ++var5) {
                            ++var4;
                            var6 = mouseRecorder.anIntArray247[var5];
                            if (var6 < 0) {
                                var6 = 0;
                            } else if (var6 > 502) {
                                var6 = 502;
                            }

                            var7 = mouseRecorder.anIntArray245[var5];
                            if (var7 < 0) {
                                var7 = 0;
                            } else if (var7 > 764) {
                                var7 = 764;
                            }

                            var8 = var6 * 765 + var7;
                            if (mouseRecorder.anIntArray247[var5] == -1 && mouseRecorder.anIntArray245[var5] == -1) {
                                var7 = -1;
                                var6 = -1;
                                var8 = 524287;
                            }

                            if (var7 == anInt1475 && anInt1479 == var6) {
                                if (anInt1480 < 2047) {
                                    ++anInt1480;
                                }
                            } else {
                                var9 = var7 - anInt1475;
                                anInt1475 = var7;
                                var10 = var6 - anInt1479;
                                anInt1479 = var6;
                                if (anInt1480 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                                    var9 += 32;
                                    var10 += 32;
                                    packet.method755((var9 << 6) + (anInt1480 << 12) + var10);
                                    anInt1480 = 0;
                                } else if (anInt1480 < 8) {
                                    packet.method867((anInt1480 << 19) + 8388608 + var8);
                                    anInt1480 = 0;
                                } else {
                                    packet.method869((anInt1480 << 19) + -1073741824 + var8);
                                    anInt1480 = 0;
                                }
                            }
                        }

                        packet.method862(packet.caret - var3);
                        if (var4 >= mouseRecorder.index) {
                            mouseRecorder.index = 0;
                        } else {
                            mouseRecorder.index -= var4;

                            for (var5 = 0; var5 < mouseRecorder.index; ++var5) {
                                mouseRecorder.anIntArray245[var5] = mouseRecorder.anIntArray245[var5 + var4];
                                mouseRecorder.anIntArray247[var5] = mouseRecorder.anIntArray247[var4 + var5];
                            }
                        }
                    }
                }

                if (Class33.anInt265 == 1 || !Class163.aBoolean1965 && Class33.anInt265 == 4 || Class33.anInt265 == 2) {
                    long var11 = (Class33.aLong270 - aLong1465) / 50L;
                    if (var11 > 4095L) {
                        var11 = 4095L;
                    }

                    aLong1465 = Class33.aLong270;
                    var4 = Class33.anInt259;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > Class64.appletHeight) {
                        var4 = Class64.appletHeight;
                    }

                    var5 = Class33.anInt255;
                    if (var5 < 0) {
                        var5 = 0;
                    } else if (var5 > AxisAlignedBoundingBox.appletWidth) {
                        var5 = AxisAlignedBoundingBox.appletWidth;
                    }

                    var6 = (int) var11;
                    packet.writeHeader(101);
                    packet.method755((Class33.anInt265 == 2 ? 1 : 0) + (var6 << 1));
                    packet.method755(var5);
                    packet.method755(var4);
                }

                if (Class4.anInt19 > 0) {
                    packet.writeHeader(172);
                    packet.method755(0);
                    var1 = packet.caret;
                    long var13 = Class124.method873();

                    for (var5 = 0; var5 < Class4.anInt19; ++var5) {
                        long var15 = var13 - aLong1684;
                        if (var15 > 16777215L) {
                            var15 = 16777215L;
                        }

                        aLong1684 = var13;
                        packet.method854((int) var15);
                        packet.method823(Class4.anIntArray25[var5]);
                    }

                    packet.method866(packet.caret - var1);
                }

                if (anInt1569 > 0) {
                    --anInt1569;
                }

                if (Class4.aBooleanArray23[96] || Class4.aBooleanArray23[97] || Class4.aBooleanArray23[98] || Class4.aBooleanArray23[99]) {
                    aBoolean1562 = true;
                }

                if (aBoolean1562 && anInt1569 <= 0) {
                    anInt1569 = 20;
                    aBoolean1562 = false;
                    packet.writeHeader(51);
                    packet.method755(mapRotation);
                    packet.method843(anInt1541);
                }

                if (Class42.aBoolean356 && !aBoolean1473) {
                    aBoolean1473 = true;
                    packet.writeHeader(241);
                    packet.method451(1);
                }

                if (!Class42.aBoolean356 && aBoolean1473) {
                    aBoolean1473 = false;
                    packet.writeHeader(241);
                    packet.method451(0);
                }

                Login.method412();
                if (connectionState == 30) {
                    TilePaint.method663();

                    for (var1 = 0; var1 < anInt1430; ++var1) {
                        --anIntArray1712[var1];
                        if (anIntArray1712[var1] >= -10) {
                            AudioEffect var17 = audioEffects[var1];
                            if (var17 == null) {
                                Object var10000 = null;
                                var17 = AudioEffect.method606(Class34.aCacheReferenceTable274, anIntArray1709[var1], 0);
                                if (var17 == null) {
                                    continue;
                                }

                                anIntArray1712[var1] += var17.method608();
                                audioEffects[var1] = var17;
                            }

                            if (anIntArray1712[var1] < 0) {
                                if (anIntArray1429[var1] != 0) {
                                    var5 = (anIntArray1429[var1] & 255) * 128;
                                    var6 = anIntArray1429[var1] >> 16 & 255;
                                    var7 = var6 * 128 + 64 - player.strictX;
                                    if (var7 < 0) {
                                        var7 = -var7;
                                    }

                                    var8 = anIntArray1429[var1] >> 8 & 255;
                                    var9 = var8 * 128 + 64 - player.strictY;
                                    if (var9 < 0) {
                                        var9 = -var9;
                                    }

                                    var10 = var7 + var9 - 128;
                                    if (var10 > var5) {
                                        anIntArray1712[var1] = -100;
                                        continue;
                                    }

                                    if (var10 < 0) {
                                        var10 = 0;
                                    }

                                    var4 = anInt1699 * (var5 - var10) / var5;
                                } else {
                                    var4 = anInt1704;
                                }

                                if (var4 > 0) {
                                    Node_Sub11_Sub1 var18 = var17.method609().method473(Class33.aClass94_254);
                                    Node_Sub10_Sub2 var19 = Node_Sub10_Sub2.method535(var18, 100, var4);
                                    var19.method546(anIntArray1713[var1] - 1);
                                    Class15.aNode_Sub10_Sub1_123.method430(var19);
                                }

                                anIntArray1712[var1] = -100;
                            }
                        } else {
                            --anInt1430;

                            for (var3 = var1; var3 < anInt1430; ++var3) {
                                anIntArray1709[var3] = anIntArray1709[var3 + 1];
                                audioEffects[var3] = audioEffects[var3 + 1];
                                anIntArray1713[var3] = anIntArray1713[var3 + 1];
                                anIntArray1712[var3] = anIntArray1712[var3 + 1];
                                anIntArray1429[var3] = anIntArray1429[var3 + 1];
                            }

                            --var1;
                        }
                    }

                    if (aBoolean1707) {
                        boolean var30;
                        if (Class133.anInt1725 != 0) {
                            var30 = true;
                        } else {
                            var30 = Class133.aNode_Sub10_Sub3_1723.method922();
                        }

                        if (!var30) {
                            if (anInt1694 != 0 && anInt1703 != -1) {
                                Class43.method298(Class100.aCacheReferenceTable1119, anInt1703, 0, anInt1694, false);
                            }

                            aBoolean1707 = false;
                        }
                    }

                    ++anInt1518;
                    if (anInt1518 > 750) {
                        if (specialScript > 0) {
                            TextureProviderImpl.method499();
                        } else {
                            Class45.method304(40);
                            Class154.aSocket1833 = InterfaceNode.aSocket317;
                            InterfaceNode.aSocket317 = null;
                        }

                    } else {
                        var1 = Class71.anInt729;
                        int[] var34 = Class71.anIntArray723;

                        for (var4 = 0; var4 < var1; ++var4) {
                            Player var35 = players[var34[var4]];
                            if (var35 != null) {
                                Class15.method133(var35, 1);
                            }
                        }

                        Class53.method338();
                        int[] var28 = Class71.anIntArray723;

                        for (var3 = 0; var3 < Class71.anInt729; ++var3) {
                            Player var20 = players[var28[var3]];
                            if (var20 != null && var20.anInt761 > 0) {
                                --var20.anInt761;
                                if (var20.anInt761 == 0) {
                                    var20.aString752 = null;
                                }
                            }
                        }

                        for (var3 = 0; var3 < anInt1501; ++var3) {
                            var4 = npcIndices[var3];
                            Npc var37 = npcs[var4];
                            if (var37 != null && var37.anInt761 > 0) {
                                --var37.anInt761;
                                if (var37.anInt761 == 0) {
                                    var37.aString752 = null;
                                }
                            }
                        }

                        ++anInt1544;
                        if (cursorState != 0) {
                            anInt1585 += 20;
                            if (anInt1585 >= 400) {
                                cursorState = 0;
                            }
                        }

                        if (Class33.anInterfaceComponent264 != null) {
                            ++anInt1587;
                            if (anInt1587 >= 15) {
                                ItemTable.method284(Class33.anInterfaceComponent264);
                                Class33.anInterfaceComponent264 = null;
                            }
                        }

                        InterfaceComponent var29 = PickableNode.anInterfaceComponent673;
                        InterfaceComponent var36 = Class65.anInterfaceComponent663;
                        PickableNode.anInterfaceComponent673 = null;
                        Class65.anInterfaceComponent663 = null;
                        anInterfaceComponent1642 = null;
                        aBoolean1639 = false;
                        aBoolean1648 = false;
                        anInt1681 = 0;

                        while (Applet_Sub1.method353() && anInt1681 < 128) {
                            if (rights >= 2 && Class4.aBooleanArray23[82] && Class99.anInt1087 == 66) {
                                String var40 = MouseRecorder.method213();
                                Class160.aClient1856.method255(var40);
                            } else {
                                anIntArray1692[anInt1681] = Class99.anInt1087;
                                anIntArray1688[anInt1681] = Class77.aChar836;
                                ++anInt1681;
                            }
                        }

                        if (anInt1632 != -1) {
                            Class141.method978(anInt1632, 0, 0, AxisAlignedBoundingBox.appletWidth, Class64.appletHeight, 0, 0);
                        }

                        ++anInt1644;

                        while (true) {
                            InterfaceComponent var38;
                            InterfaceComponent var39;
                            ScriptEvent var41;
                            do {
                                var41 = aNodeDeque1675.method994();
                                if (var41 == null) {
                                    while (true) {
                                        do {
                                            var41 = aNodeDeque1669.method994();
                                            if (var41 == null) {
                                                while (true) {
                                                    do {
                                                        var41 = aNodeDeque1661.method994();
                                                        if (var41 == null) {
                                                            this.method898();
                                                            Varps.method1047();
                                                            if (anInterfaceComponent1647 != null) {
                                                                this.method893();
                                                            }

                                                            if (Class118.anInterfaceComponent1348 != null) {
                                                                ItemTable.method284(Class118.anInterfaceComponent1348);
                                                                ++anInt1582;
                                                                if (Class33.anInt272 == 0) {
                                                                    if (aBoolean1576) {
                                                                        if (Projectile.anInterfaceComponent809 == Class118.anInterfaceComponent1348 && anInt1588 != anInt1590) {
                                                                            InterfaceComponent var42 = Class118.anInterfaceComponent1348;
                                                                            byte var33 = 0;
                                                                            if (anInt1620 == 1 && var42.contentType == 206) {
                                                                                var33 = 1;
                                                                            }

                                                                            if (var42.itemIds[anInt1590] <= 0) {
                                                                                var33 = 0;
                                                                            }

                                                                            var7 = Class75.method448(var42);
                                                                            boolean var32 = (var7 >> 29 & 1) != 0;
                                                                            if (var32) {
                                                                                var8 = anInt1588;
                                                                                var9 = anInt1590;
                                                                                var42.itemIds[var9] = var42.itemIds[var8];
                                                                                var42.itemStackSizes[var9] = var42.itemStackSizes[var8];
                                                                                var42.itemIds[var8] = -1;
                                                                                var42.itemStackSizes[var8] = 0;
                                                                            } else if (var33 == 1) {
                                                                                var8 = anInt1588;
                                                                                var9 = anInt1590;

                                                                                while (var8 != var9) {
                                                                                    if (var8 > var9) {
                                                                                        var42.method1022(var8 - 1, var8);
                                                                                        --var8;
                                                                                    } else if (var8 < var9) {
                                                                                        var42.method1022(var8 + 1, var8);
                                                                                        ++var8;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                var42.method1022(anInt1590, anInt1588);
                                                                            }

                                                                            packet.writeHeader(237);
                                                                            packet.method845(anInt1590);
                                                                            packet.method869(Class118.anInterfaceComponent1348.uid);
                                                                            packet.method853(anInt1588);
                                                                            packet.method836(var33);
                                                                        }
                                                                    } else {
                                                                        label1131:
                                                                        {
                                                                            label1149:
                                                                            {
                                                                                var4 = Class158.method1013();
                                                                                if (menuRowCount > 2) {
                                                                                    if (anInt1610 == 1) {
                                                                                        boolean var31;
                                                                                        if (menuRowCount <= 0) {
                                                                                            var31 = false;
                                                                                        } else
                                                                                           var31 = aBoolean1628 && Class4.aBooleanArray23[81] && anInt1624 != -1;

                                                                                        if (!var31) {
                                                                                            break label1149;
                                                                                        }
                                                                                    }

                                                                                    if (Class12.method66(var4)) {
                                                                                        break label1149;
                                                                                    }
                                                                                }

                                                                                if (menuRowCount > 0) {
                                                                                    Node_Sub21_Sub1.method184(anInt1579, anInt1592);
                                                                                }
                                                                                break label1131;
                                                                            }

                                                                            this.method897(anInt1579, anInt1592);
                                                                        }
                                                                    }

                                                                    anInt1587 = 10;
                                                                    Class33.anInt265 = 0;
                                                                    Class118.anInterfaceComponent1348 = null;
                                                                } else if (anInt1582 >= 5 && (Class33.anInt261 > anInt1579 + 5 || Class33.anInt261 < anInt1579 - 5 || Class33.anInt260 > anInt1592 + 5 || Class33.anInt260 < anInt1592 - 5)) {
                                                                    aBoolean1576 = true;
                                                                }
                                                            }

                                                            if (SceneGraph.method683()) {
                                                                var4 = SceneGraph.anInt1201;
                                                                var5 = SceneGraph.anInt1198;
                                                                packet.writeHeader(203);
                                                                packet.method451(5);
                                                                packet.method845(Class62.anInt636 + var4);
                                                                packet.method845(var5 + Class49.anInt377);
                                                                packet.method823(Class4.aBooleanArray23[82] ? (Class4.aBooleanArray23[81] ? 2 : 1) : 0);
                                                                SceneGraph.method685();
                                                                anInt1557 = Class33.anInt255;
                                                                anInt1577 = Class33.anInt259;
                                                                cursorState = 1;
                                                                anInt1585 = 0;
                                                                destinationX = var4;
                                                                destinationY = var5;
                                                            }

                                                            if (PickableNode.anInterfaceComponent673 != var29) {
                                                                if (var29 != null) {
                                                                    ItemTable.method284(var29);
                                                                }

                                                                if (PickableNode.anInterfaceComponent673 != null) {
                                                                    ItemTable.method284(PickableNode.anInterfaceComponent673);
                                                                }
                                                            }

                                                            if (var36 != Class65.anInterfaceComponent663 && anInt1614 == anInt1625) {
                                                                if (var36 != null) {
                                                                    ItemTable.method284(var36);
                                                                }

                                                                if (Class65.anInterfaceComponent663 != null) {
                                                                    ItemTable.method284(Class65.anInterfaceComponent663);
                                                                }
                                                            }

                                                            if (Class65.anInterfaceComponent663 != null) {
                                                                if (anInt1614 < anInt1625) {
                                                                    ++anInt1614;
                                                                    if (anInt1614 == anInt1625) {
                                                                        ItemTable.method284(Class65.anInterfaceComponent663);
                                                                    }
                                                                }
                                                            } else if (anInt1614 > 0) {
                                                                --anInt1614;
                                                            }

                                                            var4 = anInt1536 + player.strictX;
                                                            var5 = player.strictY + anInt1537;
                                                            if (Class45.anInt370 - var4 < -500 || Class45.anInt370 - var4 > 500 || BoundaryDecor.anInt1106 - var5 < -500 || BoundaryDecor.anInt1106 - var5 > 500) {
                                                                Class45.anInt370 = var4;
                                                                BoundaryDecor.anInt1106 = var5;
                                                            }

                                                            if (var4 != Class45.anInt370) {
                                                                Class45.anInt370 += (var4 - Class45.anInt370) / 16;
                                                            }

                                                            if (BoundaryDecor.anInt1106 != var5) {
                                                                BoundaryDecor.anInt1106 += (var5 - BoundaryDecor.anInt1106) / 16;
                                                            }

                                                            if (Class33.anInt272 == 4 && Class163.aBoolean1965) {
                                                                var6 = Class33.anInt260 - anInt1558;
                                                                anInt1563 = var6 * 2;
                                                                anInt1558 = var6 != -1 && var6 != 1 ? (anInt1558 + Class33.anInt260) / 2 : Class33.anInt260;
                                                                var7 = anInt1575 - Class33.anInt261;
                                                                anInt1574 = var7 * 2;
                                                                anInt1575 = var7 != -1 && var7 != 1 ? (anInt1575 + Class33.anInt261) / 2 : Class33.anInt261;
                                                            } else {
                                                                if (Class4.aBooleanArray23[96]) {
                                                                    anInt1574 += (-24 - anInt1574) / 2;
                                                                } else if (Class4.aBooleanArray23[97]) {
                                                                    anInt1574 += (24 - anInt1574) / 2;
                                                                } else {
                                                                    anInt1574 /= 2;
                                                                }

                                                                if (Class4.aBooleanArray23[98]) {
                                                                    anInt1563 += (12 - anInt1563) / 2;
                                                                } else if (Class4.aBooleanArray23[99]) {
                                                                    anInt1563 += (-12 - anInt1563) / 2;
                                                                } else {
                                                                    anInt1563 /= 2;
                                                                }

                                                                anInt1558 = Class33.anInt260;
                                                                anInt1575 = Class33.anInt261;
                                                            }

                                                            mapRotation = anInt1574 / 2 + mapRotation & 2047;
                                                            anInt1541 += anInt1563 / 2;
                                                            if (anInt1541 < 128) {
                                                                anInt1541 = 128;
                                                            }

                                                            if (anInt1541 > 383) {
                                                                anInt1541 = 383;
                                                            }

                                                            var6 = Class45.anInt370 >> 7;
                                                            var7 = BoundaryDecor.anInt1106 >> 7;
                                                            var8 = Class25.method175(Class45.anInt370, BoundaryDecor.anInt1106, Player.floorLevel);
                                                            var9 = 0;
                                                            if (var6 > 3 && var7 > 3 && var6 < 100 && var7 < 100) {
                                                                for (var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                                                                    for (int var21 = var7 - 4; var21 <= var7 + 4; ++var21) {
                                                                        int var22 = Player.floorLevel;
                                                                        if (var22 < 3 && (Class26.aByteArrayArrayArray189[1][var10][var21] & 2) == 2) {
                                                                            ++var22;
                                                                        }

                                                                        int var23 = var8 - Class26.anIntArrayArrayArray191[var22][var10][var21];
                                                                        if (var23 > var9) {
                                                                            var9 = var23;
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                            var10 = var9 * 192;
                                                            if (var10 > 98048) {
                                                                var10 = 98048;
                                                            }

                                                            if (var10 < 32768) {
                                                                var10 = 32768;
                                                            }

                                                            if (var10 > anInt1564) {
                                                                anInt1564 += (var10 - anInt1564) / 24;
                                                            } else if (var10 < anInt1564) {
                                                                anInt1564 += (var10 - anInt1564) / 80;
                                                            }

                                                            if (cameraLocked) {
                                                                Class147.method999();
                                                            }

                                                            for (var4 = 0; var4 < 5; ++var4) {
                                                                ++anIntArray1444[var4];
                                                            }

                                                            Class34.aClass67_277.method407();
                                                            var4 = ++Class33.anInt263 - 1;
                                                            var6 = Class4.anInt24;
                                                            if (var4 > 15000 && var6 > 15000) {
                                                                specialScript = 250;
                                                                Class17.method134(14500);
                                                                packet.writeHeader(45);
                                                            }

                                                            ++anInt1538;
                                                            if (anInt1538 > 500) {
                                                                anInt1538 = 0;
                                                                var8 = (int) (Math.random() * 8.0D);
                                                                if ((var8 & 1) == 1) {
                                                                    anInt1536 += anInt1533;
                                                                }

                                                                if ((var8 & 2) == 2) {
                                                                    anInt1537 += anInt1534;
                                                                }

                                                                if ((var8 & 4) == 4) {
                                                                    anInt1524 += anInt1535;
                                                                }
                                                            }

                                                            if (anInt1536 < -50) {
                                                                anInt1533 = 2;
                                                            }

                                                            if (anInt1536 > 50) {
                                                                anInt1533 = -2;
                                                            }

                                                            if (anInt1537 < -55) {
                                                                anInt1534 = 2;
                                                            }

                                                            if (anInt1537 > 55) {
                                                                anInt1534 = -2;
                                                            }

                                                            if (anInt1524 < -40) {
                                                                anInt1535 = 1;
                                                            }

                                                            if (anInt1524 > 40) {
                                                                anInt1535 = -1;
                                                            }

                                                            ++anInt1548;
                                                            if (anInt1548 > 500) {
                                                                anInt1548 = 0;
                                                                var8 = (int) (Math.random() * 8.0D);
                                                                if ((var8 & 1) == 1) {
                                                                    mapScale += anInt1528;
                                                                }

                                                                if ((var8 & 2) == 2) {
                                                                    mapOffset += anInt1546;
                                                                }
                                                            }

                                                            if (mapScale < -60) {
                                                                anInt1528 = 2;
                                                            }

                                                            if (mapScale > 60) {
                                                                anInt1528 = -2;
                                                            }

                                                            if (mapOffset < -20) {
                                                                anInt1546 = 1;
                                                            }

                                                            if (mapOffset > 10) {
                                                                anInt1546 = -1;
                                                            }

                                                            for (Class134_Sub1 var24 = (Class134_Sub1) aClass139_1441.method969(); var24 != null; var24 = (Class134_Sub1) aClass139_1441.method968()) {
                                                                if ((long) var24.anInt251 < Class124.method873() / 1000L - 5L) {
                                                                    if (var24.aShort252 > 0) {
                                                                        Class78.method469(5, "", var24.aString253 + " has logged in.");
                                                                    }

                                                                    if (var24.aShort252 == 0) {
                                                                        Class78.method469(5, "", var24.aString253 + " has logged out.");
                                                                    }

                                                                    var24.method939();
                                                                }
                                                            }

                                                            ++audioEffectCount;
                                                            if (audioEffectCount > 50) {
                                                                packet.writeHeader(71);
                                                            }

                                                            try {
                                                                if (InterfaceNode.aSocket317 != null && packet.caret > 0) {
                                                                    InterfaceNode.aSocket317.method885(packet.payload, 0, packet.caret);
                                                                    packet.caret = 0;
                                                                    audioEffectCount = 0;
                                                                }
                                                            } catch (IOException var26) {
                                                                if (specialScript > 0) {
                                                                    TextureProviderImpl.method499();
                                                                } else {
                                                                    Class45.method304(40);
                                                                    Class154.aSocket1833 = InterfaceNode.aSocket317;
                                                                    InterfaceNode.aSocket317 = null;
                                                                }
                                                            }

                                                            return;
                                                        }

                                                        var38 = var41.source;
                                                        if (var38.componentIndex < 0) {
                                                            break;
                                                        }

                                                        var39 = Class161.method1016(var38.parentUid);
                                                    }
                                                    while (var39 == null || var39.components == null || var38.componentIndex >= var39.components.length || var39.components[var38.componentIndex] != var38);

                                                    Class25.method174(var41);
                                                }
                                            }

                                            var38 = var41.source;
                                            if (var38.componentIndex < 0) {
                                                break;
                                            }

                                            var39 = Class161.method1016(var38.parentUid);
                                        }
                                        while (var39 == null || var39.components == null || var38.componentIndex >= var39.components.length || var38 != var39.components[var38.componentIndex]);

                                        Class25.method174(var41);
                                    }
                                }

                                var38 = var41.source;
                                if (var38.componentIndex < 0) {
                                    break;
                                }

                                var39 = Class161.method1016(var38.parentUid);
                            }
                            while (var39 == null || var39.components == null || var38.componentIndex >= var39.components.length || var39.components[var38.componentIndex] != var38);

                            Class25.method174(var41);
                        }
                    }
                }
            }
        }
    }

    final boolean method902() {
        if (InterfaceNode.aSocket317 == null) {
            return false;
        } else {
            int var3;
            String var11;
            try {
                int var1 = InterfaceNode.aSocket317.method884();
                if (var1 == 0) {
                    return false;
                }

                if (anInt1511 == -1) {
                    InterfaceNode.aSocket317.method883(aPacket1521.payload, 0, 1);
                    aPacket1521.caret = 0;
                    anInt1511 = aPacket1521.method784();
                    anInt1514 = Class175.anIntArray2136[anInt1511];
                    --var1;
                }

                if (anInt1514 == -1) {
                    if (var1 <= 0) {
                        return false;
                    }

                    InterfaceNode.aSocket317.method883(aPacket1521.payload, 0, 1);
                    anInt1514 = aPacket1521.payload[0] & 255;
                    --var1;
                }

                if (anInt1514 == -2) {
                    if (var1 <= 1) {
                        return false;
                    }

                    InterfaceNode.aSocket317.method883(aPacket1521.payload, 0, 2);
                    aPacket1521.caret = 0;
                    anInt1514 = aPacket1521.readUnsignedShort();
                    var1 -= 2;
                }

                if (var1 < anInt1514) {
                    return false;
                }

                aPacket1521.caret = 0;
                InterfaceNode.aSocket317.method883(aPacket1521.payload, 0, anInt1514);
                anInt1518 = 0;
                anInt1517 = anInt1516;
                anInt1516 = anInt1520 * -1;
                anInt1520 = anInt1511 * -1;
                int var2;
                int var62;
                int var63;
                if (anInt1511 == 206) {
                    var2 = aPacket1521.readUnsignedByte();
                    var3 = aPacket1521.readUnsignedByte();
                    var62 = aPacket1521.readUnsignedByte();
                    var63 = aPacket1521.readUnsignedByte();
                    aBooleanArray1427[var2] = true;
                    anIntArray1708[var2] = var3;
                    anIntArray1428[var2] = var62;
                    anIntArray1433[var2] = var63;
                    anIntArray1444[var2] = 0;
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 78) {
                    if (anInt1632 != -1) {
                        Class76.method452(anInt1632, 0);
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 146) {
                    for (var2 = 0; var2 < Varps.values.length; ++var2) {
                        if (Varps.anIntArray2000[var2] != Varps.values[var2]) {
                            Varps.values[var2] = Varps.anIntArray2000[var2];
                            Class14.method129(var2);
                            anIntArray1666[++anInt1654 - 1 & 31] = var2;
                        }
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 71) {
                    PickableNode.aClass182_672 = Player.method197(aPacket1521.readUnsignedByte());
                    anInt1511 = -1;
                    return true;
                }

                boolean var103;
                if (anInt1511 == 101) {
                    var103 = aPacket1521.readUnsignedByte() == 1;
                    if (var103) {
                        Tile.aLong1166 = Class124.method873() - aPacket1521.method837();
                        aClass43_1459 = new Class43(aPacket1521, true);
                    } else {
                        aClass43_1459 = null;
                    }

                    anInt1672 = anInt1644;
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 24) {
                    Class5.anInt35 = aPacket1521.method822();
                    Class23.anInt153 = aPacket1521.method818();

                    while (aPacket1521.caret < anInt1514) {
                        anInt1511 = aPacket1521.readUnsignedByte();
                        Class13.method103();
                    }

                    anInt1511 = -1;
                    return true;
                }

                InterfaceComponent var6;
                int var8;
                int var68;
                if (anInt1511 == 33) {
                    var2 = aPacket1521.method835();
                    var3 = aPacket1521.readUnsignedShort();
                    if (var2 < -70000) {
                        var3 += 32768;
                    }

                    if (var2 >= 0) {
                        var6 = Class161.method1016(var2);
                    } else {
                        var6 = null;
                    }

                    for (; aPacket1521.caret < anInt1514; Login.method414(var3, var63, var68 - 1, var8)) {
                        var63 = aPacket1521.method541();
                        var68 = aPacket1521.readUnsignedShort();
                        var8 = 0;
                        if (var68 != 0) {
                            var8 = aPacket1521.readUnsignedByte();
                            if (var8 == 255) {
                                var8 = aPacket1521.method835();
                            }
                        }

                        if (var6 != null && var63 >= 0 && var63 < var6.itemIds.length) {
                            var6.itemIds[var63] = var68;
                            var6.itemStackSizes[var63] = var8;
                        }
                    }

                    if (var6 != null) {
                        ItemTable.method284(var6);
                    }

                    Applet_Sub1.method233();
                    anIntArray1670[++anInt1663 - 1 & 31] = var3 & 32767;
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 42) {
                    friendCount = 1;
                    anInt1660 = anInt1644;
                    anInt1511 = -1;
                    return true;
                }

                InterfaceComponent var70;
                if (anInt1511 == 72) {
                    var2 = aPacket1521.readUnsignedShort();
                    var3 = aPacket1521.method856();
                    var62 = aPacket1521.method849();
                    var63 = aPacket1521.method848();
                    var70 = Class161.method1016(var63);
                    if (var3 != var70.xRotation || var2 != var70.zRotation || var62 != var70.modelZoom) {
                        var70.xRotation = var3;
                        var70.zRotation = var2;
                        var70.modelZoom = var62;
                        ItemTable.method284(var70);
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 136) {
                    anInt1698 = aPacket1521.readUnsignedByte();
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 150) {
                    Class64.method382(true);
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 55) {
                    var2 = aPacket1521.method848();
                    ScriptEvent.aClass103_330 = aClass108_301.method750(var2);
                    anInt1511 = -1;
                    return true;
                }

                Player var12;
                int var30;
                Packet var76;
                if (anInt1511 == 82) {
                    Class45.method305(true);
                    aPacket1521.method784();
                    var2 = aPacket1521.readUnsignedShort();
                    var76 = aPacket1521;
                    var62 = var76.caret;
                    Class71.anInt724 = 0;
                    var63 = 0;
                    var76.method790();

                    for (var68 = 0; var68 < Class71.anInt729; ++var68) {
                        var8 = Class71.anIntArray723[var68];
                        if ((Class71.aByteArray719[var8] & 1) == 0) {
                            if (var63 > 0) {
                                --var63;
                                Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                            } else {
                                var30 = var76.method788(1);
                                if (var30 == 0) {
                                    var63 = World.method329(var76);
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                } else {
                                    Class51.method321(var76, var8);
                                }
                            }
                        }
                    }

                    var76.method789();
                    if (var63 != 0) {
                        throw new RuntimeException();
                    }

                    var76.method790();

                    for (var68 = 0; var68 < Class71.anInt729; ++var68) {
                        var8 = Class71.anIntArray723[var68];
                        if ((Class71.aByteArray719[var8] & 1) != 0) {
                            if (var63 > 0) {
                                --var63;
                                Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                            } else {
                                var30 = var76.method788(1);
                                if (var30 == 0) {
                                    var63 = World.method329(var76);
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                } else {
                                    Class51.method321(var76, var8);
                                }
                            }
                        }
                    }

                    var76.method789();
                    if (var63 != 0) {
                        throw new RuntimeException();
                    }

                    var76.method790();

                    for (var68 = 0; var68 < Class71.anInt722; ++var68) {
                        var8 = Class71.anIntArray720[var68];
                        if ((Class71.aByteArray719[var8] & 1) != 0) {
                            if (var63 > 0) {
                                --var63;
                                Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                            } else {
                                var30 = var76.method788(1);
                                if (var30 == 0) {
                                    var63 = World.method329(var76);
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                } else if (Class5.method18(var76, var8)) {
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                }
                            }
                        }
                    }

                    var76.method789();
                    if (var63 != 0) {
                        throw new RuntimeException();
                    }

                    var76.method790();

                    for (var68 = 0; var68 < Class71.anInt722; ++var68) {
                        var8 = Class71.anIntArray720[var68];
                        if ((Class71.aByteArray719[var8] & 1) == 0) {
                            if (var63 > 0) {
                                --var63;
                                Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                            } else {
                                var30 = var76.method788(1);
                                if (var30 == 0) {
                                    var63 = World.method329(var76);
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                } else if (Class5.method18(var76, var8)) {
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                }
                            }
                        }
                    }

                    var76.method789();
                    if (var63 != 0) {
                        throw new RuntimeException();
                    }

                    Class71.anInt729 = 0;
                    Class71.anInt722 = 0;

                    for (var68 = 1; var68 < 2048; ++var68) {
                        Class71.aByteArray719[var68] = (byte) (Class71.aByteArray719[var68] >> 1);
                        var12 = players[var68];
                        if (var12 != null) {
                            Class71.anIntArray723[++Class71.anInt729 - 1] = var68;
                        } else {
                            Class71.anIntArray720[++Class71.anInt722 - 1] = var68;
                        }
                    }

                    PickableNode.method395(var76);
                    if (var76.caret - var62 != var2) {
                        throw new RuntimeException(var76.caret - var62 + " " + var2);
                    }

                    anInt1511 = -1;
                    return true;
                }

                int var14;
                int var20;
                Packet var86;
                String var90;
                if (anInt1511 == 109) {
                    var86 = aPacket1521;
                    var3 = anInt1514;
                    ClassStructure var88 = new ClassStructure();
                    var88.anInt206 = var86.readUnsignedByte();
                    var88.anInt204 = var86.method835();
                    var88.anIntArray950 = new int[var88.anInt206];
                    var88.anIntArray2134 = new int[var88.anInt206];
                    var88.fields = new Field[var88.anInt206];
                    var88.anIntArray934 = new int[var88.anInt206];
                    var88.methods = new Method[var88.anInt206];
                    var88.methodArgs = new byte[var88.anInt206][][];

                    for (var63 = 0; var63 < var88.anInt206; ++var63) {
                        try {
                            var68 = var86.readUnsignedByte();
                            String var98;
                            if (var68 != 0 && var68 != 1 && var68 != 2) {
                                if (var68 == 3 || var68 == 4) {
                                    var90 = var86.method819();
                                    var98 = var86.method819();
                                    var14 = var86.readUnsignedByte();
                                    String[] var99 = new String[var14];

                                    for (int var100 = 0; var100 < var14; ++var100) {
                                        var99[var100] = var86.method819();
                                    }

                                    String var101 = var86.method819();
                                    byte[][] var102 = new byte[var14][];
                                    if (var68 == 3) {
                                        for (int var104 = 0; var104 < var14; ++var104) {
                                            var20 = var86.method835();
                                            var102[var104] = new byte[var20];
                                            var86.method826(var102[var104], 0, var20);
                                        }
                                    }

                                    var88.anIntArray950[var63] = var68;
                                    Class[] var106 = new Class[var14];

                                    for (var20 = 0; var20 < var14; ++var20) {
                                        var106[var20] = Class63.method379(var99[var20]);
                                    }

                                    Class var107 = Class63.method379(var101);
                                    if (Class63.method379(var90).getClassLoader() == null) {
                                        throw new SecurityException();
                                    }

                                   for (int var25 = 0; var25 < Class63.method379(var90).getDeclaredMethods().length; ++var25) {
                                        Method var26 = Class63.method379(var90).getDeclaredMethods()[var25];
                                        if (var26.getName().equals(var98)) {
                                            Class[] var27 = var26.getParameterTypes();
                                            if (var106.length == var27.length) {
                                                boolean var28 = true;

                                                for (int var29 = 0; var29 < var106.length; ++var29) {
                                                    if (var106[var29] != var27[var29]) {
                                                        var28 = false;
                                                        break;
                                                    }
                                                }

                                                if (var28 && var107 == var26.getReturnType()) {
                                                    var88.methods[var63] = var26;
                                                }
                                            }
                                        }
                                    }

                                    var88.methodArgs[var63] = var102;
                                }
                            } else {
                                var90 = var86.method819();
                                var98 = var86.method819();
                                var14 = 0;
                                if (var68 == 1) {
                                    var14 = var86.method835();
                                }

                                var88.anIntArray950[var63] = var68;
                                var88.anIntArray934[var63] = var14;
                                if (Class63.method379(var90).getClassLoader() == null) {
                                    throw new SecurityException();
                                }

                                var88.fields[var63] = Class63.method379(var90).getDeclaredField(var98);
                            }
                        } catch (ClassNotFoundException var55) {
                            var88.anIntArray2134[var63] = -1;
                        } catch (SecurityException var56) {
                            var88.anIntArray2134[var63] = -2;
                        } catch (NullPointerException var57) {
                            var88.anIntArray2134[var63] = -3;
                        } catch (Exception var58) {
                            var88.anIntArray2134[var63] = -4;
                        } catch (Throwable var59) {
                            var88.anIntArray2134[var63] = -5;
                        }
                    }

                    Class171.aLinkedList2124.method905(var88);
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 236) {
                    Applet_Sub1.method233();
                    weight = aPacket1521.readShort();
                    anInt1658 = anInt1644;
                    anInt1511 = -1;
                    return true;
                }

                InterfaceNode var110;
                if (anInt1511 == 134) {
                    var2 = aPacket1521.method848();
                    var3 = aPacket1521.method856();
                    var62 = aPacket1521.method834();
                    var110 = interfaceNodes.lookup((long) var2);
                    if (var110 != null) {
                        Class134_Sub1.method216(var110, var3 != var110.id);
                    }

                    Class134_Sub1.method214(var2, var3, var62);
                    anInt1511 = -1;
                    return true;
                }

                InterfaceComponent var31;
                if (anInt1511 == 32) {
                    var2 = aPacket1521.readUnsignedShort();
                    var3 = aPacket1521.method846();
                    var62 = aPacket1521.method840();
                    var31 = Class161.method1016(var3);
                    var31.anInt792 = var62 + (var2 << 16);
                    anInt1511 = -1;
                    return true;
                }

                boolean var5;
                String var67;
                String var83;
                if (anInt1511 == 17) {
                    while (aPacket1521.caret < anInt1514) {
                        var103 = aPacket1521.readUnsignedByte() == 1;
                        var83 = aPacket1521.method819();
                        var67 = aPacket1521.method819();
                        var63 = aPacket1521.readUnsignedShort();
                        var68 = aPacket1521.readUnsignedByte();
                        var8 = aPacket1521.readUnsignedByte();
                        boolean var115 = (var8 & 2) != 0;
                        boolean var95 = (var8 & 1) != 0;
                        if (var63 > 0) {
                            aPacket1521.method819();
                            aPacket1521.readUnsignedByte();
                            aPacket1521.method835();
                        }

                        aPacket1521.method819();

                        for (int var32 = 0; var32 < anInt1431; ++var32) {
                            Class27 var17 = aClass27Array1449[var32];
                            if (!var103) {
                                if (var83.equals(var17.aString198)) {
                                    if (var17.anInt200 != var63) {
                                        boolean var113 = true;

                                        for (Class134_Sub1 var105 = (Class134_Sub1) aClass139_1441.method969(); var105 != null; var105 = (Class134_Sub1) aClass139_1441.method968()) {
                                            if (var105.aString253.equals(var83)) {
                                                if (var63 != 0 && var105.aShort252 == 0) {
                                                    var105.method939();
                                                    var113 = false;
                                                } else if (var63 == 0 && var105.aShort252 != 0) {
                                                    var105.method939();
                                                    var113 = false;
                                                }
                                            }
                                        }

                                        if (var113) {
                                            aClass139_1441.method967(new Class134_Sub1(var83, var63));
                                        }

                                        var17.anInt200 = var63;
                                    }

                                    var17.aString203 = var67;
                                    var17.anInt199 = var68;
                                    var17.aBoolean201 = var115;
                                    var17.aBoolean202 = var95;
                                    var83 = null;
                                    break;
                                }
                            } else if (var67.equals(var17.aString198)) {
                                var17.aString198 = var83;
                                var17.aString203 = var67;
                                var83 = null;
                                break;
                            }
                        }

                        if (var83 != null && anInt1431 < 400) {
                            Class27 var96 = new Class27();
                            aClass27Array1449[anInt1431] = var96;
                            var96.aString198 = var83;
                            var96.aString203 = var67;
                            var96.anInt200 = var63;
                            var96.anInt199 = var68;
                            var96.aBoolean201 = var115;
                            var96.aBoolean202 = var95;
                            ++anInt1431;
                        }
                    }

                    friendCount = 2;
                    anInt1660 = anInt1644;
                    var103 = false;
                    var3 = anInt1431;

                    while (var3 > 0) {
                        var103 = true;
                        --var3;

                        for (var62 = 0; var62 < var3; ++var62) {
                            var5 = false;
                            Class27 var81 = aClass27Array1449[var62];
                            Class27 var92 = aClass27Array1449[var62 + 1];
                            if (var81.anInt200 != currentWorld && currentWorld == var92.anInt200) {
                                var5 = true;
                            }

                            if (!var5 && var81.anInt200 == 0 && var92.anInt200 != 0) {
                                var5 = true;
                            }

                            if (!var5 && !var81.aBoolean201 && var92.aBoolean201) {
                                var5 = true;
                            }

                            if (!var5 && !var81.aBoolean202 && var92.aBoolean202) {
                                var5 = true;
                            }

                            if (var5) {
                                Class27 var97 = aClass27Array1449[var62];
                                aClass27Array1449[var62] = aClass27Array1449[var62 + 1];
                                aClass27Array1449[var62 + 1] = var97;
                                var103 = false;
                            }
                        }

                        if (var103) {
                            break;
                        }
                    }

                    anInt1511 = -1;
                    return true;
                }

                InterfaceComponent var78;
                if (anInt1511 == 127) {
                    var2 = aPacket1521.method852();
                    var78 = Class161.method1016(var2);
                    var78.modelType = 3;
                    var78.modelId = player.appearance.method1036();
                    ItemTable.method284(var78);
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 31) {
                    var11 = aPacket1521.method819();
                    var3 = aPacket1521.method848();
                    var6 = Class161.method1016(var3);
                    if (!var11.equals(var6.text)) {
                        var6.text = var11;
                        ItemTable.method284(var6);
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 224) {
                    var2 = aPacket1521.method848();
                    var3 = aPacket1521.method849();
                    Varps.anIntArray2000[var3] = var2;
                    if (Varps.values[var3] != var2) {
                        Varps.values[var3] = var2;
                    }

                    Class14.method129(var3);
                    anIntArray1666[++anInt1654 - 1 & 31] = var3;
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 2) {
                    anInt1689 = aPacket1521.readUnsignedByte();
                    anInt1687 = aPacket1521.readUnsignedByte();
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 98 || anInt1511 == 66 || anInt1511 == 173 || anInt1511 == 137 || anInt1511 == 165 || anInt1511 == 111 || anInt1511 == 4 || anInt1511 == 209 || anInt1511 == 37 || anInt1511 == 190) {
                    Class13.method103();
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 113) {
                    anInt1466 = aPacket1521.method840() * 30;
                    anInt1658 = anInt1644;
                    anInt1511 = -1;
                    return true;
                }

                String var112;
                if (anInt1511 == 13) {
                    var11 = aPacket1521.method819();
                    Class147.aString1808 = var11;

                    try {
                        var83 = Class160.aClient1856.getParameter(Class184.aClass184_2171.aString2176);
                        var67 = Class160.aClient1856.getParameter(Class184.aClass184_2163.aString2176);
                        var112 = var83 + "settings=" + var11 + "; version=1; path=/; domain=" + var67;
                        if (var11.length() == 0) {
                            var112 = var112 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                        } else {
                            var112 = var112 + "; Expires=" + Class94.method615(Class124.method873() + 94608000000L) + "; Max-Age=" + 94608000L;
                        }

                        Client var79 = Class160.aClient1856;
                        var90 = "document.cookie=\"" + var112 + "\"";
                        JSObject.getWindow(var79).eval(var90);
                    } catch (Throwable var53) {
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 158) {
                    var2 = aPacket1521.readUnsignedShort();
                    var3 = aPacket1521.method835();
                    var62 = var2 >> 10 & 31;
                    var63 = var2 >> 5 & 31;
                    var68 = var2 & 31;
                    var8 = (var62 << 19) + (var63 << 11) + (var68 << 3);
                    InterfaceComponent var94 = Class161.method1016(var3);
                    if (var94.textColor != var8) {
                        var94.textColor = var8;
                        ItemTable.method284(var94);
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 15) {
                    var2 = aPacket1521.method840();
                    var3 = aPacket1521.method846();
                    var6 = Class161.method1016(var3);
                    if (var6 != null && var6.type == 0) {
                        if (var2 > var6.viewportHeight - var6.height) {
                            var2 = var6.viewportHeight - var6.height;
                        }

                        if (var2 < 0) {
                            var2 = 0;
                        }

                        if (var6.insetY != var2) {
                            var6.insetY = var2;
                            ItemTable.method284(var6);
                        }
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 141) {
                    var2 = aPacket1521.method835();
                    var3 = aPacket1521.readUnsignedShort();
                    if (var2 < -70000) {
                        var3 += 32768;
                    }

                    if (var2 >= 0) {
                        var6 = Class161.method1016(var2);
                    } else {
                        var6 = null;
                    }

                    if (var6 != null) {
                        for (var63 = 0; var63 < var6.itemIds.length; ++var63) {
                            var6.itemIds[var63] = 0;
                            var6.itemStackSizes[var63] = 0;
                        }
                    }

                    Class30.method204(var3);
                    var63 = aPacket1521.readUnsignedShort();

                    for (var68 = 0; var68 < var63; ++var68) {
                        var8 = aPacket1521.method849();
                        var30 = aPacket1521.method822();
                        if (var30 == 255) {
                            var30 = aPacket1521.method852();
                        }

                        if (var6 != null && var68 < var6.itemIds.length) {
                            var6.itemIds[var68] = var8;
                            var6.itemStackSizes[var68] = var30;
                        }

                        Login.method414(var3, var68, var8 - 1, var30);
                    }

                    if (var6 != null) {
                        ItemTable.method284(var6);
                    }

                    Applet_Sub1.method233();
                    anIntArray1670[++anInt1663 - 1 & 31] = var3 & 32767;
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 167) {
                    var2 = aPacket1521.method834();
                    var83 = aPacket1521.method819();
                    var62 = aPacket1521.method834();
                    if (var2 >= 1 && var2 <= 8) {
                        if (var83.equalsIgnoreCase("null")) {
                            var83 = null;
                        }

                        playerActions[var2 - 1] = var83;
                        aBooleanArray1595[var2 - 1] = var62 == 0;
                    }

                    anInt1511 = -1;
                    return true;
                }

                long var36;
                long var38;
                long var40;
                if (anInt1511 == 1) {
                    var2 = aPacket1521.method835();
                    var3 = aPacket1521.method835();
                    if (Class60.aGarbageCollectorMXBean629 == null || !Class60.aGarbageCollectorMXBean629.isValid()) {
                        try {
                            Iterator var75 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

                            while (var75.hasNext()) {
                                GarbageCollectorMXBean var114 = (GarbageCollectorMXBean) var75.next();
                                if (var114.isValid()) {
                                    Class60.aGarbageCollectorMXBean629 = var114;
                                    aLong1461 = -1L;
                                    aLong1460 = -1L;
                                }
                            }
                        } catch (Throwable var54) {
                        }
                    }

                    long var34 = Class124.method873();
                    var68 = -1;
                    if (Class60.aGarbageCollectorMXBean629 != null) {
                        var36 = Class60.aGarbageCollectorMXBean629.getCollectionTime();
                        if (-1L != aLong1460) {
                            var38 = var36 - aLong1460;
                            var40 = var34 - aLong1461;
                            if (0L != var40) {
                                var68 = (int) (var38 * 100L / var40);
                            }
                        }

                        aLong1460 = var36;
                        aLong1461 = var34;
                    }

                    packet.writeHeader(126);
                    packet.method850(var2);
                    packet.method869(var3);
                    packet.method839(anInt300);
                    packet.method451(var68);
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 238) {
                    var11 = aPacket1521.method819();
                    Packet var72 = aPacket1521;
                    var83 = Class112.method772(var72, 32767);
                    var112 = Node_Sub21_Sub26_Sub3.method1177(Node_Sub21_Sub5.method1011(var83));
                    Class78.method469(6, var11, var112);
                    anInt1511 = -1;
                    return true;
                }

                boolean var66;
                if (anInt1511 == 63) {
                    while (aPacket1521.caret < anInt1514) {
                        var2 = aPacket1521.readUnsignedByte();
                        var66 = (var2 & 1) == 1;
                        var67 = aPacket1521.method819();
                        var112 = aPacket1521.method819();
                        aPacket1521.method819();

                        for (var68 = 0; var68 < anInt1450; ++var68) {
                            IgnoredPlayer var89 = ignoredPlayers[var68];
                            if (var66) {
                                if (var112.equals(var89.aString242)) {
                                    var89.aString242 = var67;
                                    var89.aString243 = var112;
                                    var67 = null;
                                    break;
                                }
                            } else if (var67.equals(var89.aString242)) {
                                var89.aString242 = var67;
                                var89.aString243 = var112;
                                var67 = null;
                                break;
                            }
                        }

                        if (var67 != null && anInt1450 < 400) {
                            IgnoredPlayer var77 = new IgnoredPlayer();
                            ignoredPlayers[anInt1450] = var77;
                            var77.aString242 = var67;
                            var77.aString243 = var112;
                            ++anInt1450;
                        }
                    }

                    anInt1660 = anInt1644;
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 155) {
                    var2 = aPacket1521.readUnsignedShort();
                    Varps.method1046(var2);
                    anIntArray1670[++anInt1663 - 1 & 31] = var2 & 32767;
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 218) {
                    destinationX = aPacket1521.readUnsignedByte();
                    if (destinationX == 255) {
                        destinationX = 0;
                    }

                    destinationY = aPacket1521.readUnsignedByte();
                    if (destinationY == 255) {
                        destinationY = 0;
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 114) {
                    cameraLocked = false;

                    for (var2 = 0; var2 < 5; ++var2) {
                        aBooleanArray1427[var2] = false;
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 139) {
                    var2 = aPacket1521.method849();
                    anInt1632 = var2;
                    this.method896(false);
                    Class21.method144(var2);
                    Class35.method261(anInt1632);

                    for (var3 = 0; var3 < 100; ++var3) {
                        aBooleanArray1656[var3] = true;
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 103) {
                    for (var2 = 0; var2 < players.length; ++var2) {
                        if (players[var2] != null) {
                            players[var2].animation = -1;
                        }
                    }

                    for (var2 = 0; var2 < npcs.length; ++var2) {
                        if (npcs[var2] != null) {
                            npcs[var2].animation = -1;
                        }
                    }

                    anInt1511 = -1;
                    return true;
                }

                boolean var7;
                if (anInt1511 == 140) {
                    anInt1657 = anInt1644;
                    if (anInt1514 == 0) {
                        clanChatOwner = null;
                        clanChatName = null;
                        GrandExchangeOffer.anInt738 = 0;
                        Class126.aClanMateArray1370 = null;
                        anInt1511 = -1;
                        return true;
                    }

                    clanChatName = aPacket1521.method819();
                    long var42 = aPacket1521.method837();
                    clanChatOwner = Class128.method881(var42);
                    Class6_Sub2.aByte826 = aPacket1521.method870();
                    var62 = aPacket1521.readUnsignedByte();
                    if (var62 == 255) {
                        anInt1511 = -1;
                        return true;
                    }

                    GrandExchangeOffer.anInt738 = var62;
                    ClanMate[] var111 = new ClanMate[100];

                    for (var68 = 0; var68 < GrandExchangeOffer.anInt738; ++var68) {
                        var111[var68] = new ClanMate();
                        var111[var68].aString227 = aPacket1521.method819();
                        var111[var68].name = Class84.method484(var111[var68].aString227, Class2.aClass188_13);
                        var111[var68].world = aPacket1521.readUnsignedShort();
                        var111[var68].rank = aPacket1521.method870();
                        aPacket1521.method819();
                        if (var111[var68].aString227.equals(player.name)) {
                            Class150.aByte1826 = var111[var68].rank;
                        }
                    }

                    var7 = false;
                    var30 = GrandExchangeOffer.anInt738;

                    while (var30 > 0) {
                        var7 = true;
                        --var30;

                        for (var14 = 0; var14 < var30; ++var14) {
                            if (var111[var14].name.compareTo(var111[var14 + 1].name) > 0) {
                                ClanMate var87 = var111[var14];
                                var111[var14] = var111[var14 + 1];
                                var111[var14 + 1] = var87;
                                var7 = false;
                            }
                        }

                        if (var7) {
                            break;
                        }
                    }

                    Class126.aClanMateArray1370 = var111;
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 207) {
                    var2 = aPacket1521.method835();
                    InterfaceNode var82 = interfaceNodes.lookup((long) var2);
                    if (var82 != null) {
                        Class134_Sub1.method216(var82, true);
                    }

                    if (anInterfaceComponent1627 != null) {
                        ItemTable.method284(anInterfaceComponent1627);
                        anInterfaceComponent1627 = null;
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 64) {
                    var2 = aPacket1521.method856();
                    var3 = aPacket1521.method846();
                    var6 = Class161.method1016(var3);
                    if (var6.modelType != 1 || var6.modelId != var2) {
                        var6.modelType = 1;
                        var6.modelId = var2;
                        ItemTable.method284(var6);
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 93) {
                    Class50.method317();

                    for (var2 = 0; var2 < 2048; ++var2) {
                        players[var2] = null;
                    }

                    Class36.method263(aPacket1521);
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 107) {
                    cameraLocked = true;
                    Class5.anInt37 = aPacket1521.readUnsignedByte();
                    Class51.anInt381 = aPacket1521.readUnsignedByte();
                    Class23.anInt156 = aPacket1521.readUnsignedShort();
                    GrandExchangeOffer.anInt736 = aPacket1521.readUnsignedByte();
                    TileDecor.anInt1035 = aPacket1521.readUnsignedByte();
                    if (TileDecor.anInt1035 >= 100) {
                        Class53.cameraX = Class5.anInt37 * 128 + 64;
                        Class34.cameraY = Class51.anInt381 * 128 + 64;
                        Class85.cameraZ = Class25.method175(Class53.cameraX, Class34.cameraY, Player.floorLevel) - Class23.anInt156;
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 247) {
                    Applet_Sub1.method233();
                    var2 = aPacket1521.method822();
                    var3 = aPacket1521.method848();
                    var62 = aPacket1521.method822();
                    experiences[var62] = var3;
                    currentLevels[var62] = var2;
                    levels[var62] = 1;

                    for (var63 = 0; var63 < 98; ++var63) {
                        if (var3 >= Class154.anIntArray1834[var63]) {
                            levels[var62] = var63 + 2;
                        }
                    }

                    anIntArray1659[++anInt1662 - 1 & 31] = var62;
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 240) {
                    aPacket1521.caret += 28;
                    if (aPacket1521.method827()) {
                        Class26.method177(aPacket1521, aPacket1521.caret - 28);
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 164) {
                    var2 = aPacket1521.readUnsignedShort();
                    if (var2 == 65535) {
                        var2 = -1;
                    }

                    if (var2 == -1 && !aBoolean1707) {
                        Class133.aNode_Sub10_Sub3_1723.method916();
                        Class133.anInt1725 = 1;
                        Class133.aReferenceTable1727 = null;
                    } else if (var2 != -1 && var2 != anInt1703 && anInt1694 != 0 && !aBoolean1707) {
                        CacheReferenceTable var80 = Class100.aCacheReferenceTable1119;
                        var62 = anInt1694;
                        Class133.anInt1725 = 1;
                        Class133.aReferenceTable1727 = var80;
                        Class133.anInt1728 = var2;
                        Class5.anInt38 = 0;
                        Class141.anInt1784 = var62;
                        Class46.aBoolean371 = false;
                        CollisionMap.anInt1323 = 2;
                    }

                    anInt1703 = var2;
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 80) {
                    var2 = aPacket1521.method840();
                    if (var2 == 65535) {
                        var2 = -1;
                    }

                    var3 = aPacket1521.method868();
                    Applet_Sub1.method226(var2, var3);
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 210) {
                    var2 = aPacket1521.method835();
                    var66 = aPacket1521.method834() == 1;
                    var6 = Class161.method1016(var2);
                    if (var6.explicitlyHidden != var66) {
                        var6.explicitlyHidden = var66;
                        ItemTable.method284(var6);
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 239) {
                    TextureProviderImpl.method499();
                    anInt1511 = -1;
                    return false;
                }

                if (anInt1511 == 120) {
                    var2 = aPacket1521.readUnsignedShort();
                    if (var2 == 65535) {
                        var2 = -1;
                    }

                    var3 = aPacket1521.method835();
                    var62 = aPacket1521.method848();
                    var31 = Class161.method1016(var3);
                    ItemDefinition var73;
                    if (!var31.aBoolean1173) {
                        if (var2 == -1) {
                            var31.modelType = 0;
                            anInt1511 = -1;
                            return true;
                        }

                        var73 = Class149.method1001(var2);
                        var31.modelType = 4;
                        var31.modelId = var2;
                        var31.xRotation = var73.anInt668;
                        var31.zRotation = var73.anInt236;
                        var31.modelZoom = var73.anInt219 * 100 / var62;
                        ItemTable.method284(var31);
                    } else {
                        var31.itemId = var2;
                        var31.itemStackSize = var62;
                        var73 = Class149.method1001(var2);
                        var31.xRotation = var73.anInt668;
                        var31.zRotation = var73.anInt236;
                        var31.yRotation = var73.anInt213;
                        var31.modelOffsetX = var73.anInt818;
                        var31.modelOffsetY = var73.anInt233;
                        var31.modelZoom = var73.anInt219;
                        if (var73.stackable == 1) {
                            var31.anInt777 = 1;
                        } else {
                            var31.anInt777 = 2;
                        }

                        if (var31.anInt772 > 0) {
                            var31.modelZoom = var31.modelZoom * 32 / var31.anInt772;
                        } else if (var31.anInt749 > 0) {
                            var31.modelZoom = var31.modelZoom * 32 / var31.anInt749;
                        }

                        ItemTable.method284(var31);
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 225) {
                    var2 = aPacket1521.readUnsignedShort();
                    byte var69 = aPacket1521.method833();
                    Varps.anIntArray2000[var2] = var69;
                    if (var69 != Varps.values[var2]) {
                        Varps.values[var2] = var69;
                    }

                    Class14.method129(var2);
                    anIntArray1666[++anInt1654 - 1 & 31] = var2;
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 157) {
                    Class5.anInt35 = aPacket1521.method818();
                    Class23.anInt153 = aPacket1521.readUnsignedByte();

                    for (var2 = Class23.anInt153; var2 < Class23.anInt153 + 8; ++var2) {
                        for (var3 = Class5.anInt35; var3 < Class5.anInt35 + 8; ++var3) {
                            if (pickableNodes[Player.floorLevel][var2][var3] != null) {
                                pickableNodes[Player.floorLevel][var2][var3] = null;
                                Class22.method146(var2, var3);
                            }
                        }
                    }

                    for (PendingSpawn var91 = pendingSpawns.method995(); var91 != null; var91 = pendingSpawns.next()) {
                        if (var91.sceneX >= Class23.anInt153 && var91.sceneX < Class23.anInt153 + 8 && var91.sceneY >= Class5.anInt35 && var91.sceneY < Class5.anInt35 + 8 && var91.level == Player.floorLevel) {
                            var91.hitpoints = 0;
                        }
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 119) {
                    var2 = aPacket1521.method541();
                    var66 = aPacket1521.readUnsignedByte() == 1;
                    var67 = "";
                    var5 = false;
                    if (var66) {
                        var67 = aPacket1521.method819();
                        if (Class61.method372(var67)) {
                            var5 = true;
                        }
                    }

                    String var71 = aPacket1521.method819();
                    if (!var5) {
                        Class78.method469(var2, var67, var71);
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 59) {
                    var2 = aPacket1521.method852();
                    var78 = Class161.method1016(var2);

                    for (var62 = 0; var62 < var78.itemIds.length; ++var62) {
                        var78.itemIds[var62] = -1;
                        var78.itemIds[var62] = 0;
                    }

                    ItemTable.method284(var78);
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 204) {
                    anInt1485 = aPacket1521.readUnsignedByte();
                    if (anInt1485 == 1) {
                        hintArrowNpcIndex = aPacket1521.readUnsignedShort();
                    }

                    if (anInt1485 >= 2 && anInt1485 <= 6) {
                        if (anInt1485 == 2) {
                            anInt1494 = 64;
                            anInt1488 = 64;
                        }

                        if (anInt1485 == 3) {
                            anInt1494 = 0;
                            anInt1488 = 64;
                        }

                        if (anInt1485 == 4) {
                            anInt1494 = 128;
                            anInt1488 = 64;
                        }

                        if (anInt1485 == 5) {
                            anInt1494 = 64;
                            anInt1488 = 0;
                        }

                        if (anInt1485 == 6) {
                            anInt1494 = 64;
                            anInt1488 = 128;
                        }

                        anInt1485 = 2;
                        hintArrowX = aPacket1521.readUnsignedShort();
                        hintArrowY = aPacket1521.readUnsignedShort();
                        hintArrowType = aPacket1521.readUnsignedByte();
                    }

                    if (anInt1485 == 10) {
                        anInt1472 = aPacket1521.readUnsignedShort();
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 249) {
                    cameraLocked = true;
                    PickableNode.anInt671 = aPacket1521.readUnsignedByte();
                    Class70.anInt714 = aPacket1521.readUnsignedByte();
                    RuntimeException_Sub1.anInt1284 = aPacket1521.readUnsignedShort();
                    Node_Sub21_Sub1.anInt210 = aPacket1521.readUnsignedByte();
                    Class77.anInt832 = aPacket1521.readUnsignedByte();
                    if (Class77.anInt832 >= 100) {
                        var2 = PickableNode.anInt671 * 128 + 64;
                        var3 = Class70.anInt714 * 128 + 64;
                        var62 = Class25.method175(var2, var3, Player.floorLevel) - RuntimeException_Sub1.anInt1284;
                        var63 = var2 - Class53.cameraX;
                        var68 = var62 - Class85.cameraZ;
                        var8 = var3 - Class34.cameraY;
                        var30 = (int) Math.sqrt((double) (var8 * var8 + var63 * var63));
                        Class133.cameraPitch = (int) (Math.atan2((double) var68, (double) var30) * 325.949D) & 2047;
                        Class43.cameraYaw = (int) (Math.atan2((double) var63, (double) var8) * -325.949D) & 2047;
                        if (Class133.cameraPitch < 128) {
                            Class133.cameraPitch = 128;
                        }

                        if (Class133.cameraPitch > 383) {
                            Class133.cameraPitch = 383;
                        }
                    }

                    anInt1511 = -1;
                    return true;
                }

                String var22;
                long var44;
                long var46;
                if (anInt1511 == 122) {
                    var11 = aPacket1521.method819();
                    var44 = aPacket1521.method837();
                    var46 = (long) aPacket1521.readUnsignedShort();
                    var36 = (long) aPacket1521.method868();
                    Class158[] var116 = new Class158[]{Class158.aClass158_1849, Class158.aClass158_1855, Class158.aClass158_1845, Class158.aClass158_1853, Class158.aClass158_1848, Class158.aClass158_1851};
                    Class158 var15 = (Class158) Canvas.method185(var116, aPacket1521.readUnsignedByte());
                    var40 = var36 + (var46 << 32);
                    boolean var19 = false;

                    for (var20 = 0; var20 < 100; ++var20) {
                        if (aLongArray1683[var20] == var40) {
                            var19 = true;
                            break;
                        }
                    }

                    if (var15.aBoolean1846 && Class61.method372(var11)) {
                        var19 = true;
                    }

                    if (!var19 && anInt1589 == 0) {
                        aLongArray1683[anInt1685] = var40;
                        anInt1685 = (anInt1685 + 1) % 100;
                        Packet var23 = aPacket1521;
                        var22 = Class112.method772(var23, 32767);
                        String var24 = Node_Sub21_Sub26_Sub3.method1177(Node_Sub21_Sub5.method1011(var22));
                        if (var15.anInt1852 != -1) {
                            Class75.method447(9, Canvas.method187(var15.anInt1852) + var11, var24, Class166.method1062(var44));
                        } else {
                            Class75.method447(9, var11, var24, Class166.method1062(var44));
                        }
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 188) {
                    var11 = aPacket1521.method819();
                    var44 = (long) aPacket1521.readUnsignedShort();
                    var46 = (long) aPacket1521.method868();
                    Class158[] var85 = new Class158[]{Class158.aClass158_1849, Class158.aClass158_1855, Class158.aClass158_1845, Class158.aClass158_1853, Class158.aClass158_1848, Class158.aClass158_1851};
                    Class158 var93 = (Class158) Canvas.method185(var85, aPacket1521.readUnsignedByte());
                    var38 = var46 + (var44 << 32);
                    boolean var16 = false;

                    for (int var33 = 0; var33 < 100; ++var33) {
                        if (aLongArray1683[var33] == var38) {
                            var16 = true;
                            break;
                        }
                    }

                    if (Class61.method372(var11)) {
                        var16 = true;
                    }

                    if (!var16 && anInt1589 == 0) {
                        aLongArray1683[anInt1685] = var38;
                        anInt1685 = (anInt1685 + 1) % 100;
                        Packet var21 = aPacket1521;
                        String var18 = Class112.method772(var21, 32767);
                        var22 = Node_Sub21_Sub26_Sub3.method1177(Node_Sub21_Sub5.method1011(var18));
                        byte var49;
                        if (var93.aBoolean1850) {
                            var49 = 7;
                        } else {
                            var49 = 3;
                        }

                        if (var93.anInt1852 != -1) {
                            Class78.method469(var49, Canvas.method187(var93.anInt1852) + var11, var22);
                        } else {
                            Class78.method469(var49, var11, var22);
                        }
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 35) {
                    Class45.method305(false);
                    aPacket1521.method784();
                    var2 = aPacket1521.readUnsignedShort();
                    var76 = aPacket1521;
                    var62 = var76.caret;
                    Class71.anInt724 = 0;
                    var63 = 0;
                    var76.method790();

                    for (var68 = 0; var68 < Class71.anInt729; ++var68) {
                        var8 = Class71.anIntArray723[var68];
                        if ((Class71.aByteArray719[var8] & 1) == 0) {
                            if (var63 > 0) {
                                --var63;
                                Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                            } else {
                                var30 = var76.method788(1);
                                if (var30 == 0) {
                                    var63 = World.method329(var76);
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                } else {
                                    Class51.method321(var76, var8);
                                }
                            }
                        }
                    }

                    var76.method789();
                    if (var63 != 0) {
                        throw new RuntimeException();
                    }

                    var76.method790();

                    for (var68 = 0; var68 < Class71.anInt729; ++var68) {
                        var8 = Class71.anIntArray723[var68];
                        if ((Class71.aByteArray719[var8] & 1) != 0) {
                            if (var63 > 0) {
                                --var63;
                                Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                            } else {
                                var30 = var76.method788(1);
                                if (var30 == 0) {
                                    var63 = World.method329(var76);
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                } else {
                                    Class51.method321(var76, var8);
                                }
                            }
                        }
                    }

                    var76.method789();
                    if (var63 != 0) {
                        throw new RuntimeException();
                    }

                    var76.method790();

                    for (var68 = 0; var68 < Class71.anInt722; ++var68) {
                        var8 = Class71.anIntArray720[var68];
                        if ((Class71.aByteArray719[var8] & 1) != 0) {
                            if (var63 > 0) {
                                --var63;
                                Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                            } else {
                                var30 = var76.method788(1);
                                if (var30 == 0) {
                                    var63 = World.method329(var76);
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                } else if (Class5.method18(var76, var8)) {
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                }
                            }
                        }
                    }

                    var76.method789();
                    if (var63 != 0) {
                        throw new RuntimeException();
                    }

                    var76.method790();

                    for (var68 = 0; var68 < Class71.anInt722; ++var68) {
                        var8 = Class71.anIntArray720[var68];
                        if ((Class71.aByteArray719[var8] & 1) == 0) {
                            if (var63 > 0) {
                                --var63;
                                Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                            } else {
                                var30 = var76.method788(1);
                                if (var30 == 0) {
                                    var63 = World.method329(var76);
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                } else if (Class5.method18(var76, var8)) {
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                }
                            }
                        }
                    }

                    var76.method789();
                    if (var63 != 0) {
                        throw new RuntimeException();
                    }

                    Class71.anInt729 = 0;
                    Class71.anInt722 = 0;

                    for (var68 = 1; var68 < 2048; ++var68) {
                        Class71.aByteArray719[var68] = (byte) (Class71.aByteArray719[var68] >> 1);
                        var12 = players[var68];
                        if (var12 != null) {
                            Class71.anIntArray723[++Class71.anInt729 - 1] = var68;
                        } else {
                            Class71.anIntArray720[++Class71.anInt722 - 1] = var68;
                        }
                    }

                    PickableNode.method395(var76);
                    if (var2 != var76.caret - var62) {
                        throw new RuntimeException(var76.caret - var62 + " " + var2);
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 84) {
                    Class64.method382(false);
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 219) {
                    var2 = aPacket1521.caret + anInt1514;
                    var3 = aPacket1521.readUnsignedShort();
                    var62 = aPacket1521.readUnsignedShort();
                    if (var3 != anInt1632) {
                        anInt1632 = var3;
                        this.method896(false);
                        Class21.method144(anInt1632);
                        Class35.method261(anInt1632);

                        for (var63 = 0; var63 < 100; ++var63) {
                            aBooleanArray1656[var63] = true;
                        }
                    }

                    InterfaceNode var13;
                    for (; var62-- > 0; var13.aBoolean316 = true) {
                        var63 = aPacket1521.method835();
                        var68 = aPacket1521.readUnsignedShort();
                        var8 = aPacket1521.readUnsignedByte();
                        var13 = interfaceNodes.lookup((long) var63);
                        if (var13 != null && var13.id != var68) {
                            Class134_Sub1.method216(var13, true);
                            var13 = null;
                        }

                        if (var13 == null) {
                            var13 = Class134_Sub1.method214(var63, var68, var8);
                        }
                    }

                    for (var110 = interfaceNodes.first(); var110 != null; var110 = interfaceNodes.next()) {
                        if (var110.aBoolean316) {
                            var110.aBoolean316 = false;
                        } else {
                            Class134_Sub1.method216(var110, true);
                        }
                    }

                    interfaceConfigs = new NodeTable(512);

                    while (aPacket1521.caret < var2) {
                        var63 = aPacket1521.method835();
                        var68 = aPacket1521.readUnsignedShort();
                        var8 = aPacket1521.readUnsignedShort();
                        var30 = aPacket1521.method835();

                        for (var14 = var68; var14 <= var8; ++var14) {
                            long var50 = (long) var14 + ((long) var63 << 32);
                            interfaceConfigs.put(new IntegerNode(var30), var50);
                        }
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 148) {
                    var86 = aPacket1521;
                    var3 = anInt1514;
                    var62 = var86.caret;
                    Class71.anInt724 = 0;
                    var63 = 0;
                    var86.method790();

                    for (var68 = 0; var68 < Class71.anInt729; ++var68) {
                        var8 = Class71.anIntArray723[var68];
                        if ((Class71.aByteArray719[var8] & 1) == 0) {
                            if (var63 > 0) {
                                --var63;
                                Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                            } else {
                                var30 = var86.method788(1);
                                if (var30 == 0) {
                                    var63 = World.method329(var86);
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                } else {
                                    Class51.method321(var86, var8);
                                }
                            }
                        }
                    }

                    var86.method789();
                    if (var63 != 0) {
                        throw new RuntimeException();
                    }

                    var86.method790();

                    for (var68 = 0; var68 < Class71.anInt729; ++var68) {
                        var8 = Class71.anIntArray723[var68];
                        if ((Class71.aByteArray719[var8] & 1) != 0) {
                            if (var63 > 0) {
                                --var63;
                                Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                            } else {
                                var30 = var86.method788(1);
                                if (var30 == 0) {
                                    var63 = World.method329(var86);
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                } else {
                                    Class51.method321(var86, var8);
                                }
                            }
                        }
                    }

                    var86.method789();
                    if (var63 != 0) {
                        throw new RuntimeException();
                    }

                    var86.method790();

                    for (var68 = 0; var68 < Class71.anInt722; ++var68) {
                        var8 = Class71.anIntArray720[var68];
                        if ((Class71.aByteArray719[var8] & 1) != 0) {
                            if (var63 > 0) {
                                --var63;
                                Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                            } else {
                                var30 = var86.method788(1);
                                if (var30 == 0) {
                                    var63 = World.method329(var86);
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                } else if (Class5.method18(var86, var8)) {
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                }
                            }
                        }
                    }

                    var86.method789();
                    if (var63 != 0) {
                        throw new RuntimeException();
                    }

                    var86.method790();

                    for (var68 = 0; var68 < Class71.anInt722; ++var68) {
                        var8 = Class71.anIntArray720[var68];
                        if ((Class71.aByteArray719[var8] & 1) == 0) {
                            if (var63 > 0) {
                                --var63;
                                Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                            } else {
                                var30 = var86.method788(1);
                                if (var30 == 0) {
                                    var63 = World.method329(var86);
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                } else if (Class5.method18(var86, var8)) {
                                    Class71.aByteArray719[var8] = (byte) (Class71.aByteArray719[var8] | 2);
                                }
                            }
                        }
                    }

                    var86.method789();
                    if (var63 != 0) {
                        throw new RuntimeException();
                    }

                    Class71.anInt729 = 0;
                    Class71.anInt722 = 0;

                    for (var68 = 1; var68 < 2048; ++var68) {
                        Class71.aByteArray719[var68] = (byte) (Class71.aByteArray719[var68] >> 1);
                        var12 = players[var68];
                        if (var12 != null) {
                            Class71.anIntArray723[++Class71.anInt729 - 1] = var68;
                        } else {
                            Class71.anIntArray720[++Class71.anInt722 - 1] = var68;
                        }
                    }

                    PickableNode.method395(var86);
                    if (var3 != var86.caret - var62) {
                        throw new RuntimeException(var86.caret - var62 + " " + var3);
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 244) {
                    var11 = aPacket1521.method819();
                    Object[] var74 = new Object[var11.length() + 1];

                    for (var62 = var11.length() - 1; var62 >= 0; --var62) {
                        if (var11.charAt(var62) == 's') {
                            var74[var62 + 1] = aPacket1521.method819();
                        } else {
                            var74[var62 + 1] = new Integer(aPacket1521.method835());
                        }
                    }

                    var74[0] = new Integer(aPacket1521.method835());
                    ScriptEvent var65 = new ScriptEvent();
                    var65.args = var74;
                    Class25.method174(var65);
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 172) {
                    Applet_Sub1.method233();
                    energy = aPacket1521.readUnsignedByte();
                    anInt1658 = anInt1644;
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 160) {
                    for (var2 = 0; var2 < Node_Sub21_Sub20.anInt209; ++var2) {
                        Node_Sub21_Sub20 var10 = Class74.method436(var2);
                        if (var10 != null) {
                            Varps.anIntArray2000[var2] = 0;
                            Varps.values[var2] = 0;
                        }
                    }

                    Applet_Sub1.method233();
                    anInt1654 += 32;
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 121) {
                    var2 = aPacket1521.method835();
                    var3 = aPacket1521.method846();
                    InterfaceNode var64 = interfaceNodes.lookup((long) var3);
                    var110 = interfaceNodes.lookup((long) var2);
                    if (var110 != null) {
                        Class134_Sub1.method216(var110, var64 == null || var64.id != var110.id);
                    }

                    if (var64 != null) {
                        var64.unlink();
                        interfaceNodes.put(var64, (long) var2);
                    }

                    var70 = Class161.method1016(var3);
                    if (var70 != null) {
                        ItemTable.method284(var70);
                    }

                    var70 = Class161.method1016(var2);
                    if (var70 != null) {
                        ItemTable.method284(var70);
                        Class44.method303(InterfaceComponent.interfaces[var70.uid >>> 16], var70, true);
                    }

                    if (anInt1632 != -1) {
                        Class76.method452(anInt1632, 1);
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 208) {
                    var2 = aPacket1521.method848();
                    var3 = aPacket1521.method852();
                    var62 = aPacket1521.method856();
                    if (var62 == 65535) {
                        var62 = -1;
                    }

                    var63 = aPacket1521.readUnsignedShort();
                    if (var63 == 65535) {
                        var63 = -1;
                    }

                    for (var68 = var62; var68 <= var63; ++var68) {
                        var36 = (long) var68 + ((long) var2 << 32);
                        Node var48 = interfaceConfigs.lookup(var36);
                        if (var48 != null) {
                            var48.unlink();
                        }

                        interfaceConfigs.put(new IntegerNode(var3), var36);
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 86) {
                    var2 = aPacket1521.method852();
                    var3 = aPacket1521.method840();
                    var6 = Class161.method1016(var2);
                    if (var6.modelType != 2 || var3 != var6.modelId) {
                        var6.modelType = 2;
                        var6.modelId = var3;
                        ItemTable.method284(var6);
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 76) {
                    World var84 = new World();
                    var84.domain = aPacket1521.method819();
                    var84.id = aPacket1521.readUnsignedShort();
                    var3 = aPacket1521.method835();
                    var84.mask = var3;
                    Class45.method304(45);
                    InterfaceNode.aSocket317.method882();
                    InterfaceNode.aSocket317 = null;
                    Class51.method320(var84);
                    anInt1511 = -1;
                    return false;
                }

                if (anInt1511 == 62) {
                    var2 = aPacket1521.method841();
                    var3 = aPacket1521.method835();
                    var6 = Class161.method1016(var3);
                    if (var2 != var6.anInt784 || var2 == -1) {
                        var6.anInt784 = var2;
                        var6.anInt1932 = 0;
                        var6.anInt1929 = 0;
                        ItemTable.method284(var6);
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 151) {
                    var2 = aPacket1521.method851();
                    var3 = aPacket1521.method846();
                    var62 = aPacket1521.method847();
                    var31 = Class161.method1016(var3);
                    if (var31.anInt234 != var62 || var31.anInt765 != var2 || var31.anInt236 != 0 || var31.anInt213 != 0) {
                        var31.anInt234 = var62;
                        var31.anInt765 = var2;
                        var31.anInt236 = 0;
                        var31.anInt213 = 0;
                        ItemTable.method284(var31);
                        this.method900(var31);
                        if (var31.type == 0) {
                            Class44.method303(InterfaceComponent.interfaces[var3 >> 16], var31, false);
                        }
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 179) {
                    var2 = aPacket1521.readUnsignedShort();
                    var3 = aPacket1521.readUnsignedByte();
                    var62 = aPacket1521.readUnsignedShort();
                    if (anInt1704 != 0 && var3 != 0 && anInt1430 < 50) {
                        anIntArray1709[anInt1430] = var2;
                        anIntArray1713[anInt1430] = var3;
                        anIntArray1712[anInt1430] = var62;
                        audioEffects[anInt1430] = null;
                        anIntArray1429[anInt1430] = 0;
                        ++anInt1430;
                    }

                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 36) {
                    var2 = aPacket1521.readUnsignedByte();
                    if (aPacket1521.readUnsignedByte() == 0) {
                        grandExchangeOffers[var2] = new GrandExchangeOffer();
                        aPacket1521.caret += 18;
                    } else {
                        --aPacket1521.caret;
                        grandExchangeOffers[var2] = new GrandExchangeOffer(aPacket1521, false);
                    }

                    anInt1667 = anInt1644;
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 161) {
                    var11 = aPacket1521.method819();
                    var3 = aPacket1521.readUnsignedShort();
                    byte var4 = aPacket1521.method870();
                   var5 = var4 == -128;

                    if (var5) {
                        if (GrandExchangeOffer.anInt738 == 0) {
                            anInt1511 = -1;
                            return true;
                        }

                        var7 = false;

                        for (var68 = 0; var68 < GrandExchangeOffer.anInt738 && (!Class126.aClanMateArray1370[var68].aString227.equals(var11) || var3 != Class126.aClanMateArray1370[var68].world); ++var68) {
                        }

                        if (var68 < GrandExchangeOffer.anInt738) {
                            while (var68 < GrandExchangeOffer.anInt738 - 1) {
                                Class126.aClanMateArray1370[var68] = Class126.aClanMateArray1370[var68 + 1];
                                ++var68;
                            }

                            --GrandExchangeOffer.anInt738;
                            Class126.aClanMateArray1370[GrandExchangeOffer.anInt738] = null;
                        }
                    } else {
                        aPacket1521.method819();
                        ClanMate var9 = new ClanMate();
                        var9.aString227 = var11;
                        var9.name = Class84.method484(var9.aString227, Class2.aClass188_13);
                        var9.world = var3;
                        var9.rank = var4;

                        for (var8 = GrandExchangeOffer.anInt738 - 1; var8 >= 0; --var8) {
                            var30 = Class126.aClanMateArray1370[var8].name.compareTo(var9.name);
                            if (var30 == 0) {
                                Class126.aClanMateArray1370[var8].world = var3;
                                Class126.aClanMateArray1370[var8].rank = var4;
                                if (var11.equals(player.name)) {
                                    Class150.aByte1826 = var4;
                                }

                                anInt1657 = anInt1644;
                                anInt1511 = -1;
                                return true;
                            }

                            if (var30 < 0) {
                                break;
                            }
                        }

                        if (GrandExchangeOffer.anInt738 >= Class126.aClanMateArray1370.length) {
                            anInt1511 = -1;
                            return true;
                        }

                        for (var30 = GrandExchangeOffer.anInt738 - 1; var30 > var8; --var30) {
                            Class126.aClanMateArray1370[var30 + 1] = Class126.aClanMateArray1370[var30];
                        }

                        if (GrandExchangeOffer.anInt738 == 0) {
                            Class126.aClanMateArray1370 = new ClanMate[100];
                        }

                        Class126.aClanMateArray1370[var8 + 1] = var9;
                        ++GrandExchangeOffer.anInt738;
                        if (var11.equals(player.name)) {
                            Class150.aByte1826 = var4;
                        }
                    }

                    anInt1657 = anInt1644;
                    anInt1511 = -1;
                    return true;
                }

                if (anInt1511 == 70) {
                    Class5.anInt35 = aPacket1521.method834();
                    Class23.anInt153 = aPacket1521.method822();
                    anInt1511 = -1;
                    return true;
                }

                method332("" + anInt1511 + "," + anInt1516 + "," + anInt1517 + "," + anInt1514, null);
                TextureProviderImpl.method499();
            } catch (IOException var60) {
                if (specialScript > 0) {
                    TextureProviderImpl.method499();
                } else {
                    Class45.method304(40);
                    Class154.aSocket1833 = InterfaceNode.aSocket317;
                    InterfaceNode.aSocket317 = null;
                }
            } catch (Exception var61) {
                var11 = "" + anInt1511 + "," + anInt1516 + "," + anInt1517 + "," + anInt1514 + "," + (player.anIntArray800[0] + Class62.anInt636) + "," + (Class49.anInt377 + player.anIntArray804[0]) + ",";

                for (var3 = 0; var3 < anInt1514 && var3 < 50; ++var3) {
                    var11 = var11 + aPacket1521.payload[var3] + ",";
                }

                method332(var11, var61);
                TextureProviderImpl.method499();
            }

            return true;
        }
    }

    final void method895() {
        int var1;
        if (anInt1632 != -1) {
            var1 = anInt1632;
            if (Class33.method220(var1)) {
                Class102.method657(InterfaceComponent.interfaces[var1], -1);
            }
        }

        for (var1 = 0; var1 < anInt1673; ++var1) {
            if (aBooleanArray1656[var1]) {
                aBooleanArray1674[var1] = true;
            }

            aBooleanArray1665[var1] = aBooleanArray1656[var1];
            aBooleanArray1656[var1] = false;
        }

        anInt1655 = engineCycle;
        anInt1618 = -1;
        anInt1617 = -1;
        Projectile.anInterfaceComponent809 = null;
        if (anInt1632 != -1) {
            anInt1673 = 0;
            Class122.method810(anInt1632, 0, 0, AxisAlignedBoundingBox.appletWidth, Class64.appletHeight, 0, 0, -1);
        }

        Node_Sub21_Sub26.method1206();
        int var2;
        int var3;
        if (!menuOpen) {
            if (anInt1618 != -1) {
                var1 = anInt1618;
                var2 = anInt1617;
                if (menuRowCount >= 2 || itemSelectionState != 0 || spellSelected) {
                    var3 = Class158.method1013();
                    String var4;
                    if (itemSelectionState == 1 && menuRowCount < 2) {
                        var4 = "Use" + " " + latestSelectedItemName + " " + "->";
                    } else if (spellSelected && menuRowCount < 2) {
                        var4 = aString1623 + " " + aString1616 + " " + "->";
                    } else {
                        String var5;
                        if (var3 < 0) {
                            var5 = "";
                        } else if (menuTargets[var3].length() > 0) {
                            var5 = menuActions[var3] + " " + menuTargets[var3];
                        } else {
                            var5 = menuActions[var3];
                        }

                        var4 = var5;
                    }

                    if (menuRowCount > 2) {
                        var4 = var4 + Class75.method449(16777215) + " " + '/' + " " + (menuRowCount - 2) + " more options";
                    }

                    Class35.aFont313.method1165(var4, var1 + 4, var2 + 15, 16777215, 0, engineCycle / 1000);
                }
            }
        } else {
            Class25.method176();
        }

        if (redrawMode == 3) {
            for (var1 = 0; var1 < anInt1673; ++var1) {
                if (aBooleanArray1665[var1]) {
                    Node_Sub21_Sub26.method1212(interfacePositionsX[var1], interfacePositionsY[var1], interfaceWidths[var1], interfaceHeights[var1], 16711935, 128);
                } else if (aBooleanArray1674[var1]) {
                    Node_Sub21_Sub26.method1212(interfacePositionsX[var1], interfacePositionsY[var1], interfaceWidths[var1], interfaceHeights[var1], 16711680, 128);
                }
            }
        }

        var1 = Player.floorLevel;
        var2 = player.strictX;
        var3 = player.strictY;
        int var6 = anInt1544;

        for (Node_Sub7 var14 = Node_Sub7.aNodeDeque403.method995(); var14 != null; var14 = Node_Sub7.aNodeDeque403.next()) {
            if (var14.anInt220 != -1 || var14.anIntArray404 != null) {
                int var7 = 0;
                if (var2 > var14.anInt327) {
                    var7 += var2 - var14.anInt327;
                } else if (var2 < var14.anInt206) {
                    var7 += var14.anInt206 - var2;
                }

                if (var3 > var14.anInt328) {
                    var7 += var3 - var14.anInt328;
                } else if (var3 < var14.anInt232) {
                    var7 += var14.anInt232 - var3;
                }

                if (var7 - 64 <= var14.anInt221 && anInt1699 != 0 && var14.anInt209 == var1) {
                    var7 -= 64;
                    if (var7 < 0) {
                        var7 = 0;
                    }

                    int var8 = (var14.anInt221 - var7) * anInt1699 / var14.anInt221;
                    Object var10000;
                    if (var14.aNode_Sub10_Sub2_401 == null) {
                        if (var14.anInt220 >= 0) {
                            var10000 = null;
                            AudioEffect var9 = AudioEffect.method606(Class34.aCacheReferenceTable274, var14.anInt220, 0);
                            if (var9 != null) {
                                Node_Sub11_Sub1 var10 = var9.method609().method473(Class33.aClass94_254);
                                Node_Sub10_Sub2 var11 = Node_Sub10_Sub2.method535(var10, 100, var8);
                                var11.method546(-1);
                                Class15.aNode_Sub10_Sub1_123.method430(var11);
                                var14.aNode_Sub10_Sub2_401 = var11;
                            }
                        }
                    } else {
                        var14.aNode_Sub10_Sub2_401.method424(var8);
                    }

                    if (var14.aNode_Sub10_Sub2_400 == null) {
                        if (var14.anIntArray404 != null && (var14.anInt225 -= var6) <= 0) {
                            int var12 = (int) (Math.random() * (double) var14.anIntArray404.length);
                            var10000 = null;
                            AudioEffect var15 = AudioEffect.method606(Class34.aCacheReferenceTable274, var14.anIntArray404[var12], 0);
                            if (var15 != null) {
                                Node_Sub11_Sub1 var16 = var15.method609().method473(Class33.aClass94_254);
                                Node_Sub10_Sub2 var13 = Node_Sub10_Sub2.method535(var16, 100, var8);
                                var13.method546(0);
                                Class15.aNode_Sub10_Sub1_123.method430(var13);
                                var14.aNode_Sub10_Sub2_400 = var13;
                                var14.anInt225 = var14.anInt214 + (int) (Math.random() * (double) (var14.anInt226 - var14.anInt214));
                            }
                        }
                    } else {
                        var14.aNode_Sub10_Sub2_400.method424(var8);
                        if (!var14.aNode_Sub10_Sub2_400.isLinked()) {
                            var14.aNode_Sub10_Sub2_400 = null;
                        }
                    }
                } else {
                    if (var14.aNode_Sub10_Sub2_401 != null) {
                        Class15.aNode_Sub10_Sub1_123.method427(var14.aNode_Sub10_Sub2_401);
                        var14.aNode_Sub10_Sub2_401 = null;
                    }

                    if (var14.aNode_Sub10_Sub2_400 != null) {
                        Class15.aNode_Sub10_Sub1_123.method427(var14.aNode_Sub10_Sub2_400);
                        var14.aNode_Sub10_Sub2_400 = null;
                    }
                }
            }
        }

        anInt1544 = 0;
    }

    protected final void method259() {
        aLong1691 = Class124.method873() + 500L;
        this.method903();
        if (anInt1632 != -1) {
            this.method896(true);
        }

    }
}
