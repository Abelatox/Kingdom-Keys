package wehavecookies56.kk.core.handlers;

import java.io.File;
import java.util.logging.Level;

import net.minecraftforge.common.ConfigCategory;
import net.minecraftforge.common.Configuration;
import wehavecookies56.kk.lib.ConfigBooleans;
import wehavecookies56.kk.lib.IDs;
import wehavecookies56.kk.lib.Reference;
import wehavecookies56.kk.lib.Strings;
import wehavecookies56.kk.lib.ints;
import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {
    public static Configuration config;

    public static void preConfig(File file){
        config = new Configuration(file);
        
        try{
            config.load();
            //ITEMS
            //IDs.EternalFlames = config.getItem(Strings.EternalFlames  + " ID", IDs.ETERNALFLAMES_DEFAULT).getInt(IDs.ETERNALFLAMES_DEFAULT);
            IDs.DarkLeather = config.getItem(Strings.DLeather  + " ID", IDs.DARKLEATHER_DEFAULT).getInt(IDs.DARKLEATHER_DEFAULT);
            IDs.PureHeart = config.getItem(Strings.PHeart  + " ID", IDs.PUREHEART_DEFAULT).getInt(IDs.PUREHEART_DEFAULT);
            IDs.DarkHeart = config.getItem(Strings.DHeart  + " ID", IDs.DARKHEART_DEFAULT).getInt(IDs.DARKHEART_DEFAULT);
            IDs.Heart = config.getItem(Strings.Heart  + " ID", IDs.HEART_DEFAULT).getInt(IDs.HEART_DEFAULT);
            IDs.KingdomHearts = config.getItem(Strings.KHearts  + " ID", IDs.KINGDOMHEARTS_DEFAULT).getInt(IDs.KINGDOMHEARTS_DEFAULT);
            IDs.HP = config.getItem(Strings.HP  + " ID", IDs.HP_DEFAULT).getInt(IDs.HP_DEFAULT);
            IDs.Munny = config.getItem(Strings.Munny  + " ID", IDs.MUNNY_DEFAULT).getInt(IDs.MUNNY_DEFAULT);
            IDs.Munny5 = config.getItem(Strings.Munny5  + " ID", IDs.MUNNY5_DEFAULT).getInt(IDs.MUNNY5_DEFAULT);
            IDs.Munny1 = config.getItem(Strings.Munny1  + " ID", IDs.MUNNY1_DEFAULT).getInt(IDs.MUNNY1_DEFAULT);
            IDs.Munny10 = config.getItem(Strings.Munny10  + " ID", IDs.MUNNY10_DEFAULT).getInt(IDs.MUNNY10_DEFAULT);
            IDs.Munny50 = config.getItem(Strings.Munny50  + " ID", IDs.MUNNY50_DEFAULT).getInt(IDs.MUNNY50_DEFAULT);
            IDs.Munny100 = config.getItem(Strings.Munny100  + " ID", IDs.MUNNY100_DEFAULT).getInt(IDs.MUNNY100_DEFAULT);
            IDs.Munny200 = config.getItem(Strings.Munny200  + " ID", IDs.MUNNY200_DEFAULT).getInt(IDs.MUNNY200_DEFAULT);
            IDs.Munny500 = config.getItem(Strings.Munny500  + " ID", IDs.MUNNY500_DEFAULT).getInt(IDs.MUNNY500_DEFAULT);
            IDs.Munny800 = config.getItem(Strings.Munny800  + " ID", IDs.MUNNY800_DEFAULT).getInt(IDs.MUNNY800_DEFAULT);
            IDs.Munny1000 = config.getItem(Strings.Munny1000  + " ID", IDs.MUNNY1000_DEFAULT).getInt(IDs.MUNNY1000_DEFAULT);
            IDs.Munny1200 = config.getItem(Strings.Munny1200  + " ID", IDs.MUNNY1200_DEFAULT).getInt(IDs.MUNNY1200_DEFAULT);
            IDs.Munny1500 = config.getItem(Strings.Munny1500  + " ID", IDs.MUNNY1500_DEFAULT).getInt(IDs.MUNNY1500_DEFAULT);
            IDs.Munny1800 = config.getItem(Strings.Munny1800  + " ID", IDs.MUNNY1800_DEFAULT).getInt(IDs.MUNNY1800_DEFAULT);
            IDs.Munny2000 = config.getItem(Strings.Munny2000  + " ID", IDs.MUNNY2000_DEFAULT).getInt(IDs.MUNNY2000_DEFAULT);
            IDs.Munny3000 = config.getItem(Strings.Munny3000  + " ID", IDs.MUNNY3000_DEFAULT).getInt(IDs.MUNNY3000_DEFAULT);
            IDs.Munny4000 = config.getItem(Strings.Munny4000  + " ID", IDs.MUNNY4000_DEFAULT).getInt(IDs.MUNNY4000_DEFAULT);
            IDs.Munny5000 = config.getItem(Strings.Munny5000  + " ID", IDs.MUNNY5000_DEFAULT).getInt(IDs.MUNNY5000_DEFAULT);
            IDs.Munny6000 = config.getItem(Strings.Munny6000  + " ID", IDs.MUNNY6000_DEFAULT).getInt(IDs.MUNNY6000_DEFAULT);
            IDs.Potion = config.getItem(Strings.Potion  + " ID", IDs.POTION_DEFAULT).getInt(IDs.POTION_DEFAULT);
            //Music discs
            IDs.Disc1 = config.getItem(Strings.Disc1  + " ID", IDs.DISC1_DEFAULT).getInt(IDs.DISC1_DEFAULT);
            IDs.Disc2 = config.getItem(Strings.Disc2  + " ID", IDs.DISC2_DEFAULT).getInt(IDs.DISC2_DEFAULT);
            IDs.Disc3 = config.getItem(Strings.Disc3  + " ID", IDs.DISC3_DEFAULT).getInt(IDs.DISC3_DEFAULT);
            IDs.Disc4 = config.getItem(Strings.Disc4  + " ID", IDs.DISC4_DEFAULT).getInt(IDs.DISC4_DEFAULT);
            IDs.Disc5 = config.getItem(Strings.Disc5  + " ID", IDs.DISC5_DEFAULT).getInt(IDs.DISC5_DEFAULT);
            IDs.Disc6 = config.getItem(Strings.Disc6  + " ID", IDs.DISC6_DEFAULT).getInt(IDs.DISC6_DEFAULT);
            IDs.Disc7 = config.getItem(Strings.Disc7  + " ID", IDs.DISC7_DEFAULT).getInt(IDs.DISC7_DEFAULT);
            IDs.Disc8 = config.getItem(Strings.Disc8  + " ID", IDs.DISC8_DEFAULT).getInt(IDs.DISC8_DEFAULT);
            IDs.Disc9 = config.getItem(Strings.Disc9  + " ID", IDs.DISC9_DEFAULT).getInt(IDs.DISC9_DEFAULT);
            //Armour
            //Aqua
            IDs.KABoots = config.getItem(Strings.KABoots  + " ID", IDs.KABOOTS_DEFAULT).getInt(IDs.KEBOOTS_DEFAULT);
            IDs.KAHelm = config.getItem(Strings.KAHelm  + " ID", IDs.KAHELM_DEFAULT).getInt(IDs.KEHELM_DEFAULT);
            IDs.KAChest = config.getItem(Strings.KAChest  + " ID", IDs.KACHEST_DEFAULT).getInt(IDs.KECHEST_DEFAULT);
            IDs.KALegs = config.getItem(Strings.KALegs  + " ID", IDs.KALEGS_DEFAULT).getInt(IDs.KELEGS_DEFAULT);
            //Eraqus
            IDs.KEBoots = config.getItem(Strings.KEBoots  + " ID", IDs.KEBOOTS_DEFAULT).getInt(IDs.KEBOOTS_DEFAULT);
            IDs.KEHelm = config.getItem(Strings.KEHelm  + " ID", IDs.KEHELM_DEFAULT).getInt(IDs.KEHELM_DEFAULT);
            IDs.KEChest = config.getItem(Strings.KEChest  + " ID", IDs.KECHEST_DEFAULT).getInt(IDs.KECHEST_DEFAULT);
            IDs.KELegs = config.getItem(Strings.KELegs  + " ID", IDs.KELEGS_DEFAULT).getInt(IDs.KELEGS_DEFAULT);
            //Terra
            IDs.KTBoots = config.getItem(Strings.KTBoots  + " ID", IDs.KTBOOTS_DEFAULT).getInt(IDs.KTBOOTS_DEFAULT);
            IDs.KTHelm = config.getItem(Strings.KTHelm  + " ID", IDs.KTHELM_DEFAULT).getInt(IDs.KTHELM_DEFAULT);
            IDs.KTChest = config.getItem(Strings.KTChest  + " ID", IDs.KTCHEST_DEFAULT).getInt(IDs.KTCHEST_DEFAULT);
            IDs.KTLegs = config.getItem(Strings.KTLegs  + " ID", IDs.KTLEGS_DEFAULT).getInt(IDs.KTLEGS_DEFAULT);
            //Ventus
            IDs.KVBoots = config.getItem(Strings.KVBoots  + " ID", IDs.KVBOOTS_DEFAULT).getInt(IDs.KVBOOTS_DEFAULT);
            IDs.KVHelm = config.getItem(Strings.KVHelm  + " ID", IDs.KVHELM_DEFAULT).getInt(IDs.KVHELM_DEFAULT);
            IDs.KVChest = config.getItem(Strings.KVChest  + " ID", IDs.KVCHEST_DEFAULT).getInt(IDs.KVCHEST_DEFAULT);
            IDs.KVLegs = config.getItem(Strings.KVLegs  + " ID", IDs.KVLEGS_DEFAULT).getInt(IDs.KVLEGS_DEFAULT);
            //Dark Robe
            IDs.OBoots = config.getItem(Strings.OBoots  + " ID", IDs.OBOOTS_DEFAULT).getInt(IDs.OBOOTS_DEFAULT);
            IDs.OHelm = config.getItem(Strings.OHood  + " ID", IDs.OHELM_DEFAULT).getInt(IDs.OHELM_DEFAULT);
            IDs.OChest = config.getItem(Strings.OCoat  + " ID", IDs.OCHEST_DEFAULT).getInt(IDs.OCHEST_DEFAULT);
            IDs.OLegs = config.getItem(Strings.OLegs  + " ID", IDs.OLEGS_DEFAULT).getInt(IDs.OLEGS_DEFAULT);
            //Keyblades
            IDs.Vulpeus = config.getItem(Strings.Vulpeus  + " ID", IDs.VULPEUS_DEFAULT).getInt(IDs.VULPEUS_DEFAULT);
            IDs.Ursus = config.getItem(Strings.Ursus  + " ID", IDs.URSUS_DEFAULT).getInt(IDs.URSUS_DEFAULT);
            IDs.Unicornis = config.getItem(Strings.Unicornis  + " ID", IDs.UNICORNIS_DEFAULT).getInt(IDs.UNICORNIS_DEFAULT);
            IDs.K4 = config.getItem(Strings.Leopardos  + " ID", IDs.LEOPARDOS_DEFAULT).getInt(IDs.LEOPARDOS_DEFAULT);
            IDs.K5 = config.getItem(Strings.Anguis  + " ID", IDs.ANGUIS_DEFAULT).getInt(IDs.ANGUIS_DEFAULT);
            IDs.K6 = config.getItem(Strings.Leaskeyblade  + " ID", IDs.LEASKEYBLADE_DEFAULT).getInt(IDs.LEASKEYBLADE_DEFAULT);
            IDs.K7 = config.getItem(Strings.Youngxehanortskeyblade  + " ID", IDs.YOUNGXEHANORTSKEYBLADE_DEFAULT).getInt(IDs.YOUNGXEHANORTSKEYBLADE_DEFAULT);
            IDs.K8 = config.getItem(Strings.Oceanrage  + " ID", IDs.OCEANRAGE_DEFAULT).getInt(IDs.OCEANRAGE_DEFAULT);
            IDs.K9 = config.getItem(Strings.Endofpain  + " ID", IDs.ENDOFPAIN_DEFAULT).getInt(IDs.ENDOFPAIN_DEFAULT);
            IDs.K10 = config.getItem(Strings.Unbound  + " ID", IDs.UNBOUND_DEFAULT).getInt(IDs.UNBOUND_DEFAULT);
            IDs.K11 = config.getItem(Strings.Sweetdreams  + " ID", IDs.SWEETDREAMS_DEFAULT).getInt(IDs.SWEETDREAMS_DEFAULT);
            IDs.K12 = config.getItem(Strings.Divewing  + " ID", IDs.DIVEWING_DEFAULT).getInt(IDs.DIVEWING_DEFAULT);
            IDs.K13 = config.getItem(Strings.Counterpoint  + " ID", IDs.COUNTERPOINT_DEFAULT).getInt(IDs.COUNTERPOINT_DEFAULT);
            IDs.K14 = config.getItem(Strings.Allforone  + " ID", IDs.ALLFORONE_DEFAULT).getInt(IDs.ALLFORONE_DEFAULT);
            IDs.K15 = config.getItem(Strings.Knockoutpunch  + " ID", IDs.KNOCKOUTPUNCH_DEFAULT).getInt(IDs.KNOCKOUTPUNCH_DEFAULT);
            IDs.K16 = config.getItem(Strings.Ferrisgear  + " ID", IDs.FERRISGEAR_DEFAULT).getInt(IDs.FERRISGEAR_DEFAULT);
            IDs.K17 = config.getItem(Strings.Dualdisc  + " ID", IDs.DUALDISC_DEFAULT).getInt(IDs.DUALDISC_DEFAULT);
            IDs.K18 = config.getItem(Strings.Guardianbell  + " ID", IDs.GUARDIANBELL_DEFAULT).getInt(IDs.GUARDIANBELL_DEFAULT);
            IDs.K19 = config.getItem(Strings.Skullnoise  + " ID", IDs.SKULLNOISE_DEFAULT).getInt(IDs.SKULLNOISE_DEFAULT);
            IDs.K20 = config.getItem(Strings.Woodenkeyblade  + " ID", IDs.WOODENKEYBLADE_DEFAULT).getInt(IDs.WOODENKEYBLADE_DEFAULT);
            IDs.K21 = config.getItem(Strings.Kyebladebroken  + " ID", IDs.KYEBLADEBROKEN_DEFAULT).getInt(IDs.KYEBLADEBROKEN_DEFAULT);
            IDs.K22 = config.getItem(Strings.Kyeblade  + " ID", IDs.KYEBLADE_DEFAULT).getInt(IDs.KYEBLADE_DEFAULT);
            IDs.K23 = config.getItem(Strings.Lightseeker  + " ID", IDs.LIGHTSEEKER_DEFAULT).getInt(IDs.LIGHTSEEKER_DEFAULT);
            IDs.K24 = config.getItem(Strings.Lostmemory  + " ID", IDs.LOSTMEMORY_DEFAULT).getInt(IDs.LOSTMEMORY_DEFAULT);
            IDs.K25 = config.getItem(Strings.Frolicflame  + " ID", IDs.FROLICFLAME_DEFAULT).getInt(IDs.FROLICFLAME_DEFAULT);
            IDs.K26 = config.getItem(Strings.Masterkeeper  + " ID", IDs.MASTERKEEPER_DEFAULT).getInt(IDs.MASTERKEEPER_DEFAULT);
            IDs.K27 = config.getItem(Strings.Brigthcrest  + " ID", IDs.BRIGTHCREST_DEFAULT).getInt(IDs.BRIGTHCREST_DEFAULT);
            IDs.K28 = config.getItem(Strings.Crownunlimit  + " ID", IDs.CROWNUNLIMIT_DEFAULT).getInt(IDs.CROWNUNLIMIT_DEFAULT);
            IDs.K29 = config.getItem(Strings.Noname  + " ID", IDs.NONAME_DEFAULT).getInt(IDs.NONAME_DEFAULT);
            IDs.K30 = config.getItem(Strings.Voidgear  + " ID", IDs.VOIDGEAR_DEFAULT).getInt(IDs.VOIDGEAR_DEFAULT);
            IDs.K31 = config.getItem(Strings.Sweetstack  + " ID", IDs.SWEETSTACK_DEFAULT).getInt(IDs.SWEETSTACK_DEFAULT);
            IDs.K32 = config.getItem(Strings.Pixiepetal  + " ID", IDs.PIXIEPETAL_DEFAULT).getInt(IDs.PIXIEPETAL_DEFAULT);
            IDs.K33 = config.getItem(Strings.Hyperdrive  + " ID", IDs.HYPERDRIVE_DEFAULT).getInt(IDs.HYPERDRIVE_DEFAULT);
            IDs.K34 = config.getItem(Strings.Markofahero  + " ID", IDs.MARKOFAHERO_DEFAULT).getInt(IDs.MARKOFAHERO_DEFAULT);
            IDs.K35 = config.getItem(Strings.Victoryline  + " ID", IDs.VICTORYLINE_DEFAULT).getInt(IDs.VICTORYLINE_DEFAULT);
            IDs.K36 = config.getItem(Strings.Fairystars  + " ID", IDs.FAIRYSTARS_DEFAULT).getInt(IDs.FAIRYSTARS_DEFAULT);
            IDs.K37 = config.getItem(Strings.Strokeofmidnight  + " ID", IDs.STROKEOFMIDNIGHT_DEFAULT).getInt(IDs.STROKEOFMIDNIGHT_DEFAULT);
            IDs.K38 = config.getItem(Strings.Chaosripper  + " ID", IDs.CHAOSRIPPER_DEFAULT).getInt(IDs.CHAOSRIPPER_DEFAULT);
            IDs.K39 = config.getItem(Strings.Xehanortskeyblade  + " ID", IDs.XEHANORTSKEYBLADE_DEFAULT).getInt(IDs.XEHANORTSKEYBLADE_DEFAULT);
            IDs.K40 = config.getItem(Strings.Darkgnaw  + " ID", IDs.DARKGNAW_DEFAULT).getInt(IDs.DARKGNAW_DEFAULT);
            IDs.K41 = config.getItem(Strings.Zeroone  + " ID", IDs.ZEROONE_DEFAULT).getInt(IDs.ZEROONE_DEFAULT);
            IDs.K42 = config.getItem(Strings.Dreamsword  + " ID", IDs.DREAMSWORD_DEFAULT).getInt(IDs.DREAMSWORD_DEFAULT);
            IDs.K43 = config.getItem(Strings.Aubade  + " ID", IDs.AUBLADE_DEFAULT).getInt(IDs.AUBLADE_DEFAULT);
            IDs.K44 = config.getItem(Strings.Umbrella  + " ID", IDs.UMBRELLA_DEFAULT).getInt(IDs.UMBRELLA_DEFAULT);
            IDs.K45 = config.getItem(Strings.Omegaweapon  + " ID", IDs.OMEGAWEAPON_DEFAULT).getInt(IDs.OMEGAWEAPON_DEFAULT);
            IDs.K46 = config.getItem(Strings.Twilightblaze  + " ID", IDs.TWILIGHTBLAZE_DEFAULT).getInt(IDs.TWILIGHTBLAZE_DEFAULT);
            IDs.K47 = config.getItem(Strings.Maverickflare  + " ID", IDs.MAVERICKFLARE_DEFAULT).getInt(IDs.MAVERICKFLARE_DEFAULT);
            IDs.K48 = config.getItem(Strings.Astralblast  + " ID", IDs.ASTRALBLAST_DEFAULT).getInt(IDs.ASTRALBLAST_DEFAULT);
            IDs.K49 = config.getItem(Strings.Darkerthandark  + " ID", IDs.DARKERTHANDARK_DEFAULT).getInt(IDs.DARKERTHANDARK_DEFAULT);
            IDs.K50 = config.getItem(Strings.Lunareclipse  + " ID", IDs.LUNARECLIPSE_DEFAULT).getInt(IDs.LUNARECLIPSE_DEFAULT);
            IDs.K51 = config.getItem(Strings.Silentdirge  + " ID", IDs.SILENTDIRGE_DEFAULT).getInt(IDs.SILENTDIRGE_DEFAULT);
            IDs.K52 = config.getItem(Strings.Totaleclipse  + " ID", IDs.TOTALECLIPSE_DEFAULT).getInt(IDs.TOTALECLIPSE_DEFAULT);
            IDs.K53 = config.getItem(Strings.Glimpseofdarkness  + " ID", IDs.GLIMPSEOFDARKNESS_DEFAULT).getInt(IDs.GLIMPSEOFDARKNESS_DEFAULT);
            IDs.K54 = config.getItem(Strings.Midnightroar  + " ID", IDs.MIDNIGHTROAR_DEFAULT).getInt(IDs.MIDNIGHTROAR_DEFAULT);
            IDs.K55 = config.getItem(Strings.Rejectionoffate  + " ID", IDs.REJECTIONOFFATE_DEFAULT).getInt(IDs.REJECTIONOFFATE_DEFAULT);
            IDs.K56 = config.getItem(Strings.Truelightsflight  + " ID", IDs.TRUELIGHTSFLIGHT_DEFAULT).getInt(IDs.TRUELIGHTSFLIGHT_DEFAULT);
            IDs.K57 = config.getItem(Strings.Leviathan  + " ID", IDs.LEVIATHAN_DEFAULT).getInt(IDs.LEVIATHAN_DEFAULT);
            IDs.K58 = config.getItem(Strings.Abyssaltide  + " ID", IDs.ABYSSALTIDE_DEFAULT).getInt(IDs.ABYSSALTIDE_DEFAULT);
            IDs.K59 = config.getItem(Strings.Crownofguilt  + " ID", IDs.CROWNOFGUILT_DEFAULT).getInt(IDs.CROWNOFGUILT_DEFAULT);
            IDs.K60 = config.getItem(Strings.Signofinnocence  + " ID", IDs.SIGNOFINNOCENCE_DEFAULT).getInt(IDs.SIGNOFINNOCENCE_DEFAULT);
            IDs.K61 = config.getItem(Strings.Painofsolitude  + " ID", IDs.PAINOFSOLITUDE_DEFAULT).getInt(IDs.PAINOFSOLITUDE_DEFAULT);
            IDs.K62 = config.getItem(Strings.Abbadonplasma  + " ID", IDs.ABBADONPLASMA_DEFAULT).getInt(IDs.ABBADONPLASMA_DEFAULT);
            IDs.K63 = config.getItem(Strings.Ominousblight  + " ID", IDs.OMINOUSBLIGHT_DEFAULT).getInt(IDs.OMINOUSBLIGHT_DEFAULT);
            IDs.K64 = config.getItem(Strings.Missingache  + " ID", IDs.MISSINGACHE_DEFAULT).getInt(IDs.MISSINGACHE_DEFAULT);
            IDs.K65 = config.getItem(Strings.Winnersproof  + " ID", IDs.WINNERSPROOF_DEFAULT).getInt(IDs.WINNERSPROOF_DEFAULT);
            IDs.K66 = config.getItem(Strings.Fatalcrest  + " ID", IDs.FATALCREST_DEFAULT).getInt(IDs.FATALCREST_DEFAULT);
            IDs.K67 = config.getItem(Strings.Twobecomesone  + " ID", IDs.TWOBECOMESONE_DEFAULT).getInt(IDs.TWOBECOMESONE_DEFAULT);
            IDs.K68 = config.getItem(Strings.Bondofflame  + " ID", IDs.BONDOFFLAME_DEFAULT).getInt(IDs.BONDOFFLAME_DEFAULT);
            IDs.K69 = config.getItem(Strings.Fenrir  + " ID", IDs.FENRIR_DEFAULT).getInt(IDs.FENRIR_DEFAULT);
            IDs.K70 = config.getItem(Strings.Sleepinglion  + " ID", IDs.SLEEPINGLION_DEFAULT).getInt(IDs.SLEEPINGLION_DEFAULT);
            IDs.K71 = config.getItem(Strings.Guardiansoul  + " ID", IDs.GUARDIANSOUL_DEFAULT).getInt(IDs.GUARDIANSOUL_DEFAULT);
            IDs.K72 = config.getItem(Strings.Gullwing  + " ID", IDs.GULLWING_DEFAULT).getInt(IDs.GULLWING_DEFAULT);
            IDs.K73 = config.getItem(Strings.Photondebugger  + " ID", IDs.PHOTONDEBUGGER_DEFAULT).getInt(IDs.PHOTONDEBUGGER_DEFAULT);
            IDs.K74 = config.getItem(Strings.Sweetmemories  + " ID", IDs.SWEETMEMORIES_DEFAULT).getInt(IDs.SWEETMEMORIES_DEFAULT);
            IDs.K75 = config.getItem(Strings.Circleoflife  + " ID", IDs.CIRCLEOFLIFE_DEFAULT).getInt(IDs.CIRCLEOFLIFE_DEFAULT);
            IDs.K76 = config.getItem(Strings.Decisivepumpkin  + " ID", IDs.DECISIVEPUMPKIN_DEFAULT).getInt(IDs.DECISIVEPUMPKIN_DEFAULT);
            IDs.K77 = config.getItem(Strings.Wishinglamp  + " ID", IDs.WISHINGLAMP_DEFAULT).getInt(IDs.WISHINGLAMP_DEFAULT);
            IDs.K78 = config.getItem(Strings.Followthewind  + " ID", IDs.FOLLOWTHEWIND_DEFAULT).getInt(IDs.FOLLOWTHEWIND_DEFAULT);
            IDs.K79 = config.getItem(Strings.Mysteriousabyss  + " ID", IDs.MYSTERIOUSABYSS_DEFAULT).getInt(IDs.MYSTERIOUSABYSS_DEFAULT);
            IDs.K80 = config.getItem(Strings.Monochrome  + " ID", IDs.MONOCHROME_DEFAULT).getInt(IDs.MONOCHROME_DEFAULT);
            IDs.K81 = config.getItem(Strings.Heroscrest  + " ID", IDs.HEROSCREST_DEFAULT).getInt(IDs.HEROSCREST_DEFAULT);
            IDs.K82 = config.getItem(Strings.Rumblingrose  + " ID", IDs.RUMBLINGROSE_DEFAULT).getInt(IDs.RUMBLINGROSE_DEFAULT);
            IDs.K83 = config.getItem(Strings.Hiddendragon  + " ID", IDs.HIDDENDRAGON_DEFAULT).getInt(IDs.HIDDENDRAGON_DEFAULT);
            IDs.K84 = config.getItem(Strings.Endsofearth  + " ID", IDs.ENDSOFEARTH_DEFAULT).getInt(IDs.ENDSOFEARTH_DEFAULT);
            IDs.K85 = config.getItem(Strings.Stormfall  + " ID", IDs.STORMFALL_DEFAULT).getInt(IDs.STORMFALL_DEFAULT);
            IDs.K86 = config.getItem(Strings.Destinysembrace  + " ID", IDs.DESTINYSEMBRACE_DEFAULT).getInt(IDs.DESTINYSEMBRACE_DEFAULT);
            IDs.K87 = config.getItem(Strings.Waytodawn  + " ID", IDs.WAYTODAWN_DEFAULT).getInt(IDs.WAYTODAWN_DEFAULT);
            IDs.K88 = config.getItem(Strings.Onewingedangel  + " ID", IDs.ONEWINGEDANGEL_DEFAULT).getInt(IDs.ONEWINGEDANGEL_DEFAULT);
            IDs.K89 = config.getItem(Strings.Diamonddust  + " ID", IDs.DIAMONDDUST_DEFAULT).getInt(IDs.DIAMONDDUST_DEFAULT);
            IDs.K90 = config.getItem(Strings.Lionheart  + " ID", IDs.LIONHEART_DEFAULT).getInt(IDs.LIONHEART_DEFAULT);
            IDs.K91 = config.getItem(Strings.Metalchocobo  + " ID", IDs.METALCHOCOBO_DEFAULT).getInt(IDs.METALCHOCOBO_DEFAULT);
            IDs.K92 = config.getItem(Strings.Spellbinder  + " ID", IDs.SPELLBINDER_DEFAULT).getInt(IDs.SPELLBINDER_DEFAULT);
            IDs.K93 = config.getItem(Strings.Divinerose  + " ID", IDs.DIVINEROSE_DEFAULT).getInt(IDs.DIVINEROSE_DEFAULT);
            IDs.K94 = config.getItem(Strings.Fairyharp  + " ID", IDs.FAIRYHARP_DEFAULT).getInt(IDs.FAIRYHARP_DEFAULT);
            IDs.K95 = config.getItem(Strings.Crabclaw  + " ID", IDs.CRABCLAW_DEFAULT).getInt(IDs.CRABCLAW_DEFAULT);
            IDs.K96 = config.getItem(Strings.Wishingstar  + " ID", IDs.WISHINGSTAR_DEFAULT).getInt(IDs.WISHINGSTAR_DEFAULT);
            IDs.K97 = config.getItem(Strings.Pumpkinhead  + " ID", IDs.PUMPKINHEAD_DEFAULT).getInt(IDs.PUMPKINHEAD_DEFAULT);
            IDs.K98 = config.getItem(Strings.Threewishes  + " ID", IDs.THRREWISHES_DEFAULT).getInt(IDs.THRREWISHES_DEFAULT);
            IDs.K99 = config.getItem(Strings.Jungleking  + " ID", IDs.JUNGLEKING_DEFAULT).getInt(IDs.JUNGLEKING_DEFAULT);
            IDs.K100 = config.getItem(Strings.Olympia  + " ID", IDs.OLYMPIA_DEFAULT).getInt(IDs.OLYMPIA_DEFAULT);
            IDs.K101 = config.getItem(Strings.Ladyluck  + " ID", IDs.LADYLUCK_DEFAULT).getInt(IDs.LADYLUCK_DEFAULT);
            IDs.K102 = config.getItem(Strings.Peopleshearts  + " ID", IDs.PEOPLESHEARTS_DEFAULT).getInt(IDs.PEOPLESHEARTS_DEFAULT);
            IDs.K103 = config.getItem(Strings.Ultimaweapon  + " ID", IDs.ULTIMAWEAPON_DEFAULT).getInt(IDs.ULTIMAWEAPON_DEFAULT);
            IDs.K104 = config.getItem(Strings.Treasuretrove  + " ID", IDs.TREASURETROVE_DEFAULT).getInt(IDs.TREASURETROVE_DEFAULT);
            IDs.K105 = config.getItem(Strings.Starseeker  + " ID", IDs.STARSEEKER_DEFAULT).getInt(IDs.STARSEEKER_DEFAULT);
            IDs.K106 = config.getItem(Strings.Souleater  + " ID", IDs.SOULEATER_DEFAULT).getInt(IDs.SOULEATER_DEFAULT); 
            IDs.K107 = config.getItem(Strings.Starlight  + " ID", IDs.STARLIGHT_DEFAULT).getInt(IDs.STARLIGHT_DEFAULT);
            IDs.K108 = config.getItem(Strings.Rainfell  + " ID", IDs.RAINFELL_DEFAULT).getInt(IDs.RAINFELL_DEFAULT);
            IDs.K109 = config.getItem(Strings.Earthshaker  + " ID", IDs.EARTHSHAKER_DEFAULT).getInt(IDs.EARTHSHAKER_DEFAULT);
            IDs.K110 = config.getItem(Strings.Waywardwind  + " ID", IDs.WAYWARDWIND_DEFAULT).getInt(IDs.WAYWARDWIND_DEFAULT);
            IDs.K111 = config.getItem(Strings.KingdomKey  + " ID", IDs.KINGDOMKEY_DEFAULT).getInt(IDs.KINGDOMKEY_DEFAULT);
            IDs.K112 = config.getItem(Strings.Oathkeeper  + " ID", IDs.OATHKEEPER_DEFAULT).getInt(IDs.OATHKEEPER_DEFAULT);
            IDs.K113 = config.getItem(Strings.KingdomKeyD  + " ID", IDs.KINGDOMKEYD_DEFAULT).getInt(IDs.KINGDOMKEYD_DEFAULT);
            IDs.K114 = config.getItem(Strings.Oblivion  + " ID", IDs.OBLIVION_DEFAULT).getInt(IDs.OBLIVION_DEFAULT);
            //Keychains
            IDs.K1c = config.getItem(Strings.VulpeusChain  + " ID", IDs.VULPEUSCHAIN_DEFAULT).getInt(IDs.VULPEUSCHAIN_DEFAULT);
            IDs.K2c = config.getItem(Strings.UrsusChain  + " ID", IDs.URSUSCHAIN_DEFAULT).getInt(IDs.URSUSCHAIN_DEFAULT);
            IDs.K3c = config.getItem(Strings.UnicornisChain  + " ID", IDs.UNICORNISCHAIN_DEFAULT).getInt(IDs.UNICORNISCHAIN_DEFAULT);
            IDs.K4c = config.getItem(Strings.LeopardosChain  + " ID", IDs.LEOPARDOSCHAIN_DEFAULT).getInt(IDs.LEOPARDOSCHAIN_DEFAULT);
            IDs.K5c = config.getItem(Strings.AnguisChain  + " ID", IDs.ANGUISCHAIN_DEFAULT).getInt(IDs.ANGUISCHAIN_DEFAULT);
            IDs.K6c = config.getItem(Strings.LeaskeybladeChain  + " ID", IDs.LEASKEYBLADECHAIN_DEFAULT).getInt(IDs.LEASKEYBLADECHAIN_DEFAULT);
            IDs.K7c = config.getItem(Strings.YoungxehanortskeybladeChain  + " ID", IDs.YOUNGXEHANORTSKEYBLADECHAIN_DEFAULT).getInt(IDs.YOUNGXEHANORTSKEYBLADECHAIN_DEFAULT);
            IDs.K8c = config.getItem(Strings.OceanrageChain  + " ID", IDs.OCEANRAGECHAIN_DEFAULT).getInt(IDs.OCEANRAGECHAIN_DEFAULT);
            IDs.K9c = config.getItem(Strings.EndofpainChain  + " ID", IDs.ENDOFPAINCHAIN_DEFAULT).getInt(IDs.ENDOFPAINCHAIN_DEFAULT);
            IDs.K10c = config.getItem(Strings.UnboundChain  + " ID", IDs.UNBOUNDCHAIN_DEFAULT).getInt(IDs.UNBOUNDCHAIN_DEFAULT);
            IDs.K11c = config.getItem(Strings.SweetdreamsChain  + " ID", IDs.SWEETDREAMSCHAIN_DEFAULT).getInt(IDs.SWEETDREAMSCHAIN_DEFAULT);
            IDs.K12c = config.getItem(Strings.DivewingChain  + " ID", IDs.DIVEWINGCHAIN_DEFAULT).getInt(IDs.DIVEWINGCHAIN_DEFAULT);
            IDs.K13c = config.getItem(Strings.CounterpointChain  + " ID", IDs.COUNTERPOINTCHAIN_DEFAULT).getInt(IDs.COUNTERPOINTCHAIN_DEFAULT);
            IDs.K14c = config.getItem(Strings.AllforoneChain  + " ID", IDs.ALLFORONECHAIN_DEFAULT).getInt(IDs.ALLFORONECHAIN_DEFAULT);
            IDs.K15c = config.getItem(Strings.KnockoutpunchChain  + " ID", IDs.KNOCKOUTPUNCHCHAIN_DEFAULT).getInt(IDs.KNOCKOUTPUNCHCHAIN_DEFAULT);
            IDs.K16c = config.getItem(Strings.FerrisgearChain  + " ID", IDs.FERRISGEARCHAIN_DEFAULT).getInt(IDs.FERRISGEARCHAIN_DEFAULT);
            IDs.K17c = config.getItem(Strings.DualdiscChain  + " ID", IDs.DUALDISCCHAIN_DEFAULT).getInt(IDs.DUALDISCCHAIN_DEFAULT);
            IDs.K18c = config.getItem(Strings.GuardianbellChain  + " ID", IDs.GUARDIANBELLCHAIN_DEFAULT).getInt(IDs.GUARDIANBELLCHAIN_DEFAULT);
            IDs.K19c = config.getItem(Strings.SkullnoiseChain  + " ID", IDs.SKULLNOISECHAIN_DEFAULT).getInt(IDs.SKULLNOISECHAIN_DEFAULT);
            IDs.K20c = config.getItem(Strings.WoodenkeybladeChain  + " ID", IDs.WOODENKEYBLADECHAIN_DEFAULT).getInt(IDs.WOODENKEYBLADECHAIN_DEFAULT);
            IDs.K21c = config.getItem(Strings.KyebladebrokenChain  + " ID", IDs.KYEBLADEBROKENCHAIN_DEFAULT).getInt(IDs.KYEBLADEBROKENCHAIN_DEFAULT);
            IDs.K22c = config.getItem(Strings.KyebladeChain  + " ID", IDs.KYEBLADECHAIN_DEFAULT).getInt(IDs.KYEBLADECHAIN_DEFAULT);
            IDs.K23c = config.getItem(Strings.LightseekerChain  + " ID", IDs.LIGHTSEEKERCHAIN_DEFAULT).getInt(IDs.LIGHTSEEKERCHAIN_DEFAULT);
            IDs.K24c = config.getItem(Strings.LostmemoryChain  + " ID", IDs.LOSTMEMORYCHAIN_DEFAULT).getInt(IDs.LOSTMEMORYCHAIN_DEFAULT);
            IDs.K25c = config.getItem(Strings.FrolicflameChain  + " ID", IDs.FROLICFLAMECHAIN_DEFAULT).getInt(IDs.FROLICFLAMECHAIN_DEFAULT);
            IDs.K26c = config.getItem(Strings.MasterkeeperChain  + " ID", IDs.MASTERKEEPERCHAIN_DEFAULT).getInt(IDs.MASTERKEEPERCHAIN_DEFAULT);
            IDs.K27c = config.getItem(Strings.BrigthcrestChain  + " ID", IDs.BRIGTHCRESTCHAIN_DEFAULT).getInt(IDs.BRIGTHCRESTCHAIN_DEFAULT);
            IDs.K28c = config.getItem(Strings.CrownunlimitChain  + " ID", IDs.CROWNUNLIMITCHAIN_DEFAULT).getInt(IDs.CROWNUNLIMITCHAIN_DEFAULT);
            IDs.K29c = config.getItem(Strings.NonameChain  + " ID", IDs.NONAMECHAIN_DEFAULT).getInt(IDs.NONAMECHAIN_DEFAULT);
            IDs.K30c= config.getItem(Strings.VoidgearChain  + " ID", IDs.VOIDGEARCHAIN_DEFAULT).getInt(IDs.VOIDGEARCHAIN_DEFAULT);
            IDs.K31c = config.getItem(Strings.SweetstackChain  + " ID", IDs.SWEETSTACKCHAIN_DEFAULT).getInt(IDs.SWEETSTACKCHAIN_DEFAULT);
            IDs.K32c = config.getItem(Strings.PixiepetalChain  + " ID", IDs.PIXIEPETALCHAIN_DEFAULT).getInt(IDs.PIXIEPETALCHAIN_DEFAULT);
            IDs.K33c = config.getItem(Strings.HyperdriveChain  + " ID", IDs.HYPERDRIVECHAIN_DEFAULT).getInt(IDs.HYPERDRIVECHAIN_DEFAULT);
            IDs.K34c = config.getItem(Strings.MarkofaheroChain  + " ID", IDs.MARKOFAHEROCHAIN_DEFAULT).getInt(IDs.MARKOFAHEROCHAIN_DEFAULT);
            IDs.K35c = config.getItem(Strings.VictorylineChain  + " ID", IDs.VICTORYLINECHAIN_DEFAULT).getInt(IDs.VICTORYLINECHAIN_DEFAULT);
            IDs.K36c = config.getItem(Strings.FairystarsChain  + " ID", IDs.FAIRYSTARSCHAIN_DEFAULT).getInt(IDs.FAIRYSTARSCHAIN_DEFAULT);
            IDs.K37c = config.getItem(Strings.StrokeofmidnightChain  + " ID", IDs.STROKEOFMIDNIGHTCHAIN_DEFAULT).getInt(IDs.STROKEOFMIDNIGHTCHAIN_DEFAULT);
            IDs.K38c = config.getItem(Strings.ChaosripperChain  + " ID", IDs.CHAOSRIPPERCHAIN_DEFAULT).getInt(IDs.CHAOSRIPPERCHAIN_DEFAULT);
            IDs.K39c = config.getItem(Strings.XehanortskeybladeChain  + " ID", IDs.XEHANORTSKEYBLADECHAIN_DEFAULT).getInt(IDs.XEHANORTSKEYBLADECHAIN_DEFAULT);
            IDs.K40c = config.getItem(Strings.DarkgnawChain  + " ID", IDs.DARKGNAWCHAIN_DEFAULT).getInt(IDs.DARKGNAWCHAIN_DEFAULT);
            IDs.K41c = config.getItem(Strings.ZerooneChain  + " ID", IDs.ZEROONECHAIN_DEFAULT).getInt(IDs.ZEROONECHAIN_DEFAULT);
            IDs.K42c = config.getItem(Strings.DreamswordChain  + " ID", IDs.DREAMSWORDCHAIN_DEFAULT).getInt(IDs.DREAMSWORDCHAIN_DEFAULT);
            IDs.K43c = config.getItem(Strings.AubadeChain  + " ID", IDs.AUBLADECHAIN_DEFAULT).getInt(IDs.AUBLADECHAIN_DEFAULT);
            IDs.K44c = config.getItem(Strings.UmbrellaChain  + " ID", IDs.UMBRELLACHAIN_DEFAULT).getInt(IDs.UMBRELLACHAIN_DEFAULT);
            IDs.K45c = config.getItem(Strings.OmegaweaponChain  + " ID", IDs.OMEGAWEAPONCHAIN_DEFAULT).getInt(IDs.OMEGAWEAPONCHAIN_DEFAULT);
            IDs.K46c = config.getItem(Strings.TwilightblazeChain  + " ID", IDs.TWILIGHTBLAZECHAIN_DEFAULT).getInt(IDs.TWILIGHTBLAZECHAIN_DEFAULT);
            IDs.K47c = config.getItem(Strings.MaverickflareChain  + " ID", IDs.MAVERICKFLARECHAIN_DEFAULT).getInt(IDs.MAVERICKFLARECHAIN_DEFAULT);
            IDs.K48c = config.getItem(Strings.AstralblastChain  + " ID", IDs.ASTRALBLASTCHAIN_DEFAULT).getInt(IDs.ASTRALBLASTCHAIN_DEFAULT);
            IDs.K49c = config.getItem(Strings.DarkerthandarkChain  + " ID", IDs.DARKERTHANDARKCHAIN_DEFAULT).getInt(IDs.DARKERTHANDARKCHAIN_DEFAULT);
            IDs.K50c = config.getItem(Strings.LunareclipseChain  + " ID", IDs.LUNARECLIPSECHAIN_DEFAULT).getInt(IDs.LUNARECLIPSECHAIN_DEFAULT);
            IDs.K51c = config.getItem(Strings.SilentdirgeChain  + " ID", IDs.SILENTDIRGECHAIN_DEFAULT).getInt(IDs.SILENTDIRGECHAIN_DEFAULT);
            IDs.K52c = config.getItem(Strings.TotaleclipseChain  + " ID", IDs.TOTALECLIPSECHAIN_DEFAULT).getInt(IDs.TOTALECLIPSECHAIN_DEFAULT);
            IDs.K53c = config.getItem(Strings.GlimpseofdarknessChain  + " ID", IDs.GLIMPSEOFDARKNESSCHAIN_DEFAULT).getInt(IDs.GLIMPSEOFDARKNESSCHAIN_DEFAULT);
            IDs.K54c = config.getItem(Strings.MidnightroarChain  + " ID", IDs.MIDNIGHTROARCHAIN_DEFAULT).getInt(IDs.MIDNIGHTROARCHAIN_DEFAULT);
            IDs.K55c = config.getItem(Strings.RejectionoffateChain  + " ID", IDs.REJECTIONOFFATECHAIN_DEFAULT).getInt(IDs.REJECTIONOFFATECHAIN_DEFAULT);
            IDs.K56c = config.getItem(Strings.TruelightsflightChain  + " ID", IDs.TRUELIGHTSFLIGHTCHAIN_DEFAULT).getInt(IDs.TRUELIGHTSFLIGHTCHAIN_DEFAULT);
            IDs.K57c = config.getItem(Strings.LeviathanChain  + " ID", IDs.LEVIATHANCHAIN_DEFAULT).getInt(IDs.LEVIATHANCHAIN_DEFAULT);
            IDs.K58c = config.getItem(Strings.AbyssaltideChain  + " ID", IDs.ABYSSALTIDECHAIN_DEFAULT).getInt(IDs.ABYSSALTIDECHAIN_DEFAULT);
            IDs.K59c = config.getItem(Strings.CrownofguiltChain  + " ID", IDs.CROWNOFGUILTCHAIN_DEFAULT).getInt(IDs.CROWNOFGUILTCHAIN_DEFAULT);
            IDs.K60c = config.getItem(Strings.SignofinnocenceChain  + " ID", IDs.SIGNOFINNOCENCECHAIN_DEFAULT).getInt(IDs.SIGNOFINNOCENCECHAIN_DEFAULT);
            IDs.K61c = config.getItem(Strings.PainofsolitudeChain  + " ID", IDs.PAINOFSOLITUDECHAIN_DEFAULT).getInt(IDs.PAINOFSOLITUDECHAIN_DEFAULT);
            IDs.K62c = config.getItem(Strings.AbbadonplasmaChain  + " ID", IDs.ABBADONPLASMACHAIN_DEFAULT).getInt(IDs.ABBADONPLASMACHAIN_DEFAULT);
            IDs.K63c = config.getItem(Strings.OminousblightChain  + " ID", IDs.OMINOUSBLIGHTCHAIN_DEFAULT).getInt(IDs.OMINOUSBLIGHTCHAIN_DEFAULT);
            IDs.K64c = config.getItem(Strings.MissingacheChain + " ID", IDs.MISSINGACHECHAIN_DEFAULT).getInt(IDs.MISSINGACHECHAIN_DEFAULT);
            IDs.K65c = config.getItem(Strings.WinnersproofChain  + " ID", IDs.WINNERSPROOFCHAIN_DEFAULT).getInt(IDs.WINNERSPROOFCHAIN_DEFAULT);
            IDs.K66c = config.getItem(Strings.FatalcrestChain  + " ID", IDs.FATALCRESTCHAIN_DEFAULT).getInt(IDs.FATALCRESTCHAIN_DEFAULT);
            IDs.K67c = config.getItem(Strings.TwobecomesoneChain  + " ID", IDs.TWOBECOMESONECHAIN_DEFAULT).getInt(IDs.TWOBECOMESONECHAIN_DEFAULT);
            IDs.K68c = config.getItem(Strings.BondofflameChain  + " ID", IDs.BONDOFFLAMECHAIN_DEFAULT).getInt(IDs.BONDOFFLAMECHAIN_DEFAULT);
            IDs.K69c = config.getItem(Strings.FenrirChain  + " ID", IDs.FENRIRCHAIN_DEFAULT).getInt(IDs.FENRIRCHAIN_DEFAULT);
            IDs.K70c = config.getItem(Strings.SleepinglionChain  + " ID", IDs.SLEEPINGLIONCHAIN_DEFAULT).getInt(IDs.SLEEPINGLIONCHAIN_DEFAULT);
            IDs.K71c = config.getItem(Strings.GuardiansoulChain  + " ID", IDs.GUARDIANSOULCHAIN_DEFAULT).getInt(IDs.GUARDIANSOULCHAIN_DEFAULT);
            IDs.K72c = config.getItem(Strings.GullwingChain  + " ID", IDs.GULLWINGCHAIN_DEFAULT).getInt(IDs.GULLWINGCHAIN_DEFAULT);
            IDs.K73c = config.getItem(Strings.PhotondebuggerChain  + " ID", IDs.PHOTONDEBUGGERCHAIN_DEFAULT).getInt(IDs.PHOTONDEBUGGERCHAIN_DEFAULT);
            IDs.K74c = config.getItem(Strings.SweetmemoriesChain  + " ID", IDs.SWEETMEMORIESCHAIN_DEFAULT).getInt(IDs.SWEETMEMORIESCHAIN_DEFAULT);
            IDs.K75c = config.getItem(Strings.CircleoflifeChain  + " ID", IDs.CIRCLEOFLIFECHAIN_DEFAULT).getInt(IDs.CIRCLEOFLIFECHAIN_DEFAULT);
            IDs.K76c = config.getItem(Strings.DecisivepumpkinChain  + " ID", IDs.DECISIVEPUMPKINCHAIN_DEFAULT).getInt(IDs.DECISIVEPUMPKINCHAIN_DEFAULT);
            IDs.K77c = config.getItem(Strings.WishinglampChain  + " ID", IDs.WISHINGLAMPCHAIN_DEFAULT).getInt(IDs.WISHINGLAMPCHAIN_DEFAULT);
            IDs.K78c = config.getItem(Strings.FollowthewindChain  + " ID", IDs.FOLLOWTHEWINDCHAIN_DEFAULT).getInt(IDs.FOLLOWTHEWINDCHAIN_DEFAULT);
            IDs.K79c = config.getItem(Strings.MysteriousabyssChain  + " ID", IDs.MYSTERIOUSABYSSCHAIN_DEFAULT).getInt(IDs.MYSTERIOUSABYSSCHAIN_DEFAULT);
            IDs.K80c = config.getItem(Strings.MonochromeChain  + " ID", IDs.MONOCHROMECHAIN_DEFAULT).getInt(IDs.MONOCHROMECHAIN_DEFAULT);
            IDs.K81c = config.getItem(Strings.HeroscrestChain  + " ID", IDs.HEROSCRESTCHAIN_DEFAULT).getInt(IDs.HEROSCRESTCHAIN_DEFAULT);
            IDs.K82c = config.getItem(Strings.RumblingroseChain  + " ID", IDs.RUMBLINGROSECHAIN_DEFAULT).getInt(IDs.RUMBLINGROSECHAIN_DEFAULT);
            IDs.K83c = config.getItem(Strings.HiddendragonChain  + " ID", IDs.HIDDENDRAGONCHAIN_DEFAULT).getInt(IDs.HIDDENDRAGONCHAIN_DEFAULT);
            IDs.K84c = config.getItem(Strings.EndsofearthChain  + " ID", IDs.ENDSOFEARTHCHAIN_DEFAULT).getInt(IDs.ENDSOFEARTHCHAIN_DEFAULT);
            IDs.K85c = config.getItem(Strings.StormfallChain  + " ID", IDs.STORMFALLCHAIN_DEFAULT).getInt(IDs.STORMFALLCHAIN_DEFAULT);
            IDs.K86c = config.getItem(Strings.DestinysembraceChain  + " ID", IDs.DESTINYSEMBRACECHAIN_DEFAULT).getInt(IDs.DESTINYSEMBRACECHAIN_DEFAULT);
            IDs.K87c = config.getItem(Strings.WaytodawnChain  + " ID", IDs.WAYTODAWNCHAIN_DEFAULT).getInt(IDs.WAYTODAWNCHAIN_DEFAULT);
            IDs.K88c = config.getItem(Strings.OnewingedangelChain  + " ID", IDs.ONEWINGEDANGELCHAIN_DEFAULT).getInt(IDs.ONEWINGEDANGELCHAIN_DEFAULT);
            IDs.K89c = config.getItem(Strings.DiamonddustChain  + " ID", IDs.DIAMONDDUSTCHAIN_DEFAULT).getInt(IDs.DIAMONDDUSTCHAIN_DEFAULT);
            IDs.K90c = config.getItem(Strings.LionheartChain  + " ID", IDs.LIONHEARTCHAIN_DEFAULT).getInt(IDs.LIONHEARTCHAIN_DEFAULT);
            IDs.K91c = config.getItem(Strings.MetalchocoboChain  + " ID", IDs.METALCHOCOBOCHAIN_DEFAULT).getInt(IDs.METALCHOCOBOCHAIN_DEFAULT);
            IDs.K92c = config.getItem(Strings.SpellbinderChain  + " ID", IDs.SPELLBINDERCHAIN_DEFAULT).getInt(IDs.SPELLBINDERCHAIN_DEFAULT);
            IDs.K93c = config.getItem(Strings.DivineroseChain  + " ID", IDs.DIVINEROSECHAIN_DEFAULT).getInt(IDs.DIVINEROSECHAIN_DEFAULT);
            IDs.K94c = config.getItem(Strings.FairyharpChain  + " ID", IDs.FAIRYHARPCHAIN_DEFAULT).getInt(IDs.FAIRYHARPCHAIN_DEFAULT);
            IDs.K95c = config.getItem(Strings.CrabclawChain  + " ID", IDs.CRABCLAWCHAIN_DEFAULT).getInt(IDs.CRABCLAWCHAIN_DEFAULT);
            IDs.K96c = config.getItem(Strings.WishingstarChain  + " ID", IDs.WISHINGSTARCHAIN_DEFAULT).getInt(IDs.WISHINGSTARCHAIN_DEFAULT);
            IDs.K97c = config.getItem(Strings.PumpkinheadChain  + " ID", IDs.PUMPKINHEADCHAIN_DEFAULT).getInt(IDs.PUMPKINHEADCHAIN_DEFAULT);
            IDs.K98c = config.getItem(Strings.ThreewishesChain  + " ID", IDs.THRREWISHESCHAIN_DEFAULT).getInt(IDs.THRREWISHESCHAIN_DEFAULT);
            IDs.K99c = config.getItem(Strings.JunglekingChain  + " ID", IDs.JUNGLEKINGCHAIN_DEFAULT).getInt(IDs.JUNGLEKINGCHAIN_DEFAULT);
            IDs.K100c = config.getItem(Strings.OlympiaChain  + " ID", IDs.OLYMPIACHAIN_DEFAULT).getInt(IDs.OLYMPIACHAIN_DEFAULT);
            IDs.K101c = config.getItem(Strings.LadyluckChain  + " ID", IDs.LADYLUCKCHAIN_DEFAULT).getInt(IDs.LADYLUCKCHAIN_DEFAULT);
            IDs.K102c = config.getItem(Strings.PeoplesheartsChain  + " ID", IDs.PEOPLESHEARTSCHAIN_DEFAULT).getInt(IDs.PEOPLESHEARTSCHAIN_DEFAULT);
            IDs.K103c = config.getItem(Strings.UltimaweaponChain  + " ID", IDs.ULTIMAWEAPONCHAIN_DEFAULT).getInt(IDs.ULTIMAWEAPONCHAIN_DEFAULT);
            IDs.K104c = config.getItem(Strings.TreasuretroveChain  + " ID", IDs.TREASURETROVECHAIN_DEFAULT).getInt(IDs.TREASURETROVECHAIN_DEFAULT);
            IDs.K105c = config.getItem(Strings.StarseekerChain  + " ID", IDs.STARSEEKERCHAIN_DEFAULT).getInt(IDs.STARSEEKERCHAIN_DEFAULT); 
            IDs.K106c = config.getItem(Strings.SouleaterChain  + " ID", IDs.SOULEATERCHAIN_DEFAULT).getInt(IDs.SOULEATERCHAIN_DEFAULT); 
            IDs.K107c = config.getItem(Strings.StarlightChain  + " ID", IDs.STARLIGHTCHAIN_DEFAULT).getInt(IDs.STARLIGHTCHAIN_DEFAULT);
            IDs.K108c = config.getItem(Strings.RainfellChain  + " ID", IDs.RAINFELLCHAIN_DEFAULT).getInt(IDs.RAINFELLCHAIN_DEFAULT);
            IDs.K109c = config.getItem(Strings.EarthshakerChain  + " ID", IDs.EARTHSHAKERCHAIN_DEFAULT).getInt(IDs.EARTHSHAKERCHAIN_DEFAULT);
            IDs.K110c = config.getItem(Strings.WaywardwindChain  + " ID", IDs.WAYWARDWINDCHAIN_DEFAULT).getInt(IDs.WAYWARDWINDCHAIN_DEFAULT);
            IDs.K111c = config.getItem(Strings.KingdomKeyChain  + " ID", IDs.KINGDOMKEYCHAIN_DEFAULT).getInt(IDs.KINGDOMKEYCHAIN_DEFAULT);
            IDs.K112c = config.getItem(Strings.OathkeeperChain  + " ID", IDs.OATHKEEPERCHAIN_DEFAULT).getInt(IDs.OATHKEEPERCHAIN_DEFAULT);
            IDs.K113c = config.getItem(Strings.KingdomKeyDChain  + " ID", IDs.KINGDOMKEYDCHAIN_DEFAULT).getInt(IDs.KINGDOMKEYDCHAIN_DEFAULT);
            IDs.K114c = config.getItem(Strings.OblivionChain  + " ID", IDs.OBLIVIONCHAIN_DEFAULT).getInt(IDs.OBLIVIONCHAIN_DEFAULT);
            
            IDs.BlazingShard = config.getItem(Strings.BlazingShard  + " ID", IDs.BLAZINGSHARD_DEFAULT).getInt(IDs.BLAZINGSHARD_DEFAULT);
            IDs.BlazingStone = config.getItem(Strings.BlazingStone  + " ID", IDs.BLAZINGSTONE_DEFAULT).getInt(IDs.BLAZINGSTONE_DEFAULT);
            IDs.BlazingGem = config.getItem(Strings.BlazingGem  + " ID", IDs.BLAZINGGEM_DEFAULT).getInt(IDs.BLAZINGGEM_DEFAULT);
            IDs.BlazingCrystal = config.getItem(Strings.BlazingCrystal  + " ID", IDs.BLAZINGCRYSTAL_DEFAULT).getInt(IDs.BLAZINGSHARD_DEFAULT);
            
            IDs.FrostShard = config.getItem(Strings.FrostShard  + " ID", IDs.FROSTSHARD_DEFAULT).getInt(IDs.FROSTSHARD_DEFAULT);
            IDs.FrostStone = config.getItem(Strings.FrostStone  + " ID", IDs.FROSTSTONE_DEFAULT).getInt(IDs.FROSTSTONE_DEFAULT);
            IDs.FrostGem = config.getItem(Strings.FrostGem  + " ID", IDs.FROSTGEM_DEFAULT).getInt(IDs.FROSTGEM_DEFAULT);
            IDs.FrostCrystal = config.getItem(Strings.FrostCrystal  + " ID", IDs.FROSTCRYSTAL_DEFAULT).getInt(IDs.FROSTCRYSTAL_DEFAULT);
            
            IDs.LightningShard = config.getItem(Strings.LightningShard  + " ID", IDs.LIGHTNINGSHARD_DEFAULT).getInt(IDs.LIGHTNINGSHARD_DEFAULT);
            IDs.LightningStone = config.getItem(Strings.LightningStone  + " ID", IDs.LIGHTNINGSTONE_DEFAULT).getInt(IDs.LIGHTNINGSTONE_DEFAULT);
            IDs.LightningGem = config.getItem(Strings.LightningGem  + " ID", IDs.LIGHTNINGGEM_DEFAULT).getInt(IDs.LIGHTNINGGEM_DEFAULT);
            IDs.LightningCrystal = config.getItem(Strings.LightningCrystal  + " ID", IDs.LIGHTNINGCRYSTAL_DEFAULT).getInt(IDs.LIGHTNINGCRYSTAL_DEFAULT);
            
            IDs.LucidShard = config.getItem(Strings.LucidShard  + " ID", IDs.LUCIDSHARD_DEFAULT).getInt(IDs.LUCIDSHARD_DEFAULT);
            IDs.LucidStone = config.getItem(Strings.LucidStone  + " ID", IDs.LUCIDSHARD_DEFAULT).getInt(IDs.LUCIDSHARD_DEFAULT);
            IDs.LucidGem = config.getItem(Strings.LucidGem  + " ID", IDs.LUCIDGEM_DEFAULT).getInt(IDs.LUCIDGEM_DEFAULT);
            IDs.LucidCrystal = config.getItem(Strings.LucidCrystal  + " ID", IDs.LUCIDCRYSTAL_DEFAULT).getInt(IDs.LUCIDCRYSTAL_DEFAULT);
            
            IDs.PowerShard = config.getItem(Strings.PowerShard  + " ID", IDs.POWERSHARD_DEFAULT).getInt(IDs.POWERSHARD_DEFAULT);
            IDs.PowerStone = config.getItem(Strings.PowerStone  + " ID", IDs.POWERSHARD_DEFAULT).getInt(IDs.POWERSHARD_DEFAULT);
            IDs.PowerGem = config.getItem(Strings.PowerGem  + " ID", IDs.POWERGEM_DEFAULT).getInt(IDs.POWERGEM_DEFAULT);
            IDs.PowerCrystal = config.getItem(Strings.PowerCrystal  + " ID", IDs.POWERCRYSTAL_DEFAULT).getInt(IDs.POWERCRYSTAL_DEFAULT);
            
            IDs.DarkShard = config.getItem(Strings.DarkShard  + " ID", IDs.DARKSHARD_DEFAULT).getInt(IDs.DARKSHARD_DEFAULT);
            IDs.DarkStone = config.getItem(Strings.DarkStone  + " ID", IDs.DARKSHARD_DEFAULT).getInt(IDs.DARKSHARD_DEFAULT);
            IDs.DarkGem = config.getItem(Strings.DarkGem  + " ID", IDs.DARKGEM_DEFAULT).getInt(IDs.DARKGEM_DEFAULT);
            IDs.DarkCrystal = config.getItem(Strings.DarkCrystal  + " ID", IDs.DARKCRYSTAL_DEFAULT).getInt(IDs.DARKCRYSTAL_DEFAULT);
            IDs.DarkMatter = config.getItem(Strings.DarkMatter  + " ID", IDs.DARKMATTER_DEFAULT).getInt(IDs.DARKMATTER_DEFAULT);
            
            IDs.DenseShard = config.getItem(Strings.DenseShard  + " ID", IDs.DENSESHARD_DEFAULT).getInt(IDs.DENSESHARD_DEFAULT);
            IDs.DenseStone = config.getItem(Strings.DenseStone  + " ID", IDs.DENSESHARD_DEFAULT).getInt(IDs.DENSESHARD_DEFAULT);
            IDs.DenseGem = config.getItem(Strings.DenseGem  + " ID", IDs.DENSEGEM_DEFAULT).getInt(IDs.DENSEGEM_DEFAULT);
            IDs.DenseCrystal = config.getItem(Strings.DenseCrystal  + " ID", IDs.DENSECRYSTAL_DEFAULT).getInt(IDs.DENSECRYSTAL_DEFAULT);
            
            IDs.TwilightShard = config.getItem(Strings.TwilightShard  + " ID", IDs.TWILIGHTSHARD_DEFAULT).getInt(IDs.TWILIGHTSHARD_DEFAULT);
            IDs.TwilightStone = config.getItem(Strings.TwilightStone  + " ID", IDs.TWILIGHTSHARD_DEFAULT).getInt(IDs.TWILIGHTSHARD_DEFAULT);
            IDs.TwilightGem = config.getItem(Strings.TwilightGem  + " ID", IDs.TWILIGHTGEM_DEFAULT).getInt(IDs.TWILIGHTGEM_DEFAULT);
            IDs.TwilightCrystal = config.getItem(Strings.TwilightCrystal  + " ID", IDs.TWILIGHTCRYSTAL_DEFAULT).getInt(IDs.TWILIGHTCRYSTAL_DEFAULT);
            
            IDs.MythrilShard = config.getItem(Strings.MythrilShard  + " ID", IDs.MYTHRILSHARD_DEFAULT).getInt(IDs.MYTHRILSHARD_DEFAULT);
            IDs.MythrilStone = config.getItem(Strings.MythrilStone  + " ID", IDs.MYTHRILSHARD_DEFAULT).getInt(IDs.MYTHRILSHARD_DEFAULT);
            IDs.MythrilGem = config.getItem(Strings.MythrilGem  + " ID", IDs.MYTHRILGEM_DEFAULT).getInt(IDs.MYTHRILGEM_DEFAULT);
            IDs.MythrilCrystal = config.getItem(Strings.MythrilCrystal  + " ID", IDs.MYTHRILCRYSTAL_DEFAULT).getInt(IDs.MYTHRILCRYSTAL_DEFAULT);
            
            IDs.BrightShard = config.getItem(Strings.BrightShard  + " ID", IDs.BRIGHTSHARD_DEFAULT).getInt(IDs.BRIGHTSHARD_DEFAULT);
            IDs.BrightStone = config.getItem(Strings.BrightStone  + " ID", IDs.BRIGHTSHARD_DEFAULT).getInt(IDs.BRIGHTSHARD_DEFAULT);
            IDs.BrightGem = config.getItem(Strings.BrightGem  + " ID", IDs.BRIGHTGEM_DEFAULT).getInt(IDs.BRIGHTGEM_DEFAULT);
            IDs.BrightCrystal = config.getItem(Strings.BrightCrystal  + " ID", IDs.BRIGHTCRYSTAL_DEFAULT).getInt(IDs.BRIGHTCRYSTAL_DEFAULT);
            
            IDs.EnergyShard = config.getItem(Strings.EnergyShard  + " ID", IDs.ENERGYSHARD_DEFAULT).getInt(IDs.ENERGYSHARD_DEFAULT);
            IDs.EnergyStone = config.getItem(Strings.EnergyStone  + " ID", IDs.ENERGYSHARD_DEFAULT).getInt(IDs.ENERGYSHARD_DEFAULT);
            IDs.EnergyGem = config.getItem(Strings.EnergyGem  + " ID", IDs.ENERGYGEM_DEFAULT).getInt(IDs.ENERGYGEM_DEFAULT);
            IDs.EnergyCrystal = config.getItem(Strings.EnergyCrystal  + " ID", IDs.ENERGYCRYSTAL_DEFAULT).getInt(IDs.ENERGYCRYSTAL_DEFAULT);
            
            IDs.SerenityShard = config.getItem(Strings.SerenityShard  + " ID", IDs.SERENITYSHARD_DEFAULT).getInt(IDs.SERENITYSHARD_DEFAULT);
            IDs.SerenityStone = config.getItem(Strings.SerenityStone  + " ID", IDs.SERENITYSHARD_DEFAULT).getInt(IDs.SERENITYSHARD_DEFAULT);
            IDs.SerenityGem = config.getItem(Strings.SerenityGem  + " ID", IDs.SERENITYGEM_DEFAULT).getInt(IDs.SERENITYGEM_DEFAULT);
            IDs.SerenityCrystal = config.getItem(Strings.SerenityCrystal  + " ID", IDs.SERENITYCRYSTAL_DEFAULT).getInt(IDs.SERENITYCRYSTAL_DEFAULT);
            
            IDs.Orichalcum = config.getItem(Strings.Orichalcum  + " ID", IDs.ORICHALCUM_DEFAULT).getInt(IDs.ORICHALCUM_DEFAULT);
            IDs.OrichalcumPlus = config.getItem(Strings.OrichalcumPlus  + " ID", IDs.ORICHALCUMPLUS_DEFAULT).getInt(IDs.ORICHALCUMPLUS_DEFAULT);
            
            IDs.RemembranceShard = config.getItem(Strings.RemembranceShard  + " ID", IDs.REMEMBRANCESHARD_DEFAULT).getInt(IDs.REMEMBRANCESHARD_DEFAULT);
            IDs.RemembranceStone = config.getItem(Strings.RemembranceStone  + " ID", IDs.REMEMBRANCESHARD_DEFAULT).getInt(IDs.REMEMBRANCESHARD_DEFAULT);
            IDs.RemembranceGem = config.getItem(Strings.RemembranceGem  + " ID", IDs.REMEMBRANCEGEM_DEFAULT).getInt(IDs.REMEMBRANCEGEM_DEFAULT);
            IDs.RemembranceCrystal = config.getItem(Strings.RemembranceCrystal  + " ID", IDs.REMEMBRANCECRYSTAL_DEFAULT).getInt(IDs.REMEMBRANCECRYSTAL_DEFAULT);
            
            IDs.TranquilShard = config.getItem(Strings.TranquilShard  + " ID", IDs.TRANQUILSHARD_DEFAULT).getInt(IDs.TRANQUILSHARD_DEFAULT);
            IDs.TranquilStone = config.getItem(Strings.TranquilStone  + " ID", IDs.TRANQUILSHARD_DEFAULT).getInt(IDs.TRANQUILSHARD_DEFAULT);
            IDs.TranquilGem = config.getItem(Strings.TranquilGem  + " ID", IDs.TRANQUILGEM_DEFAULT).getInt(IDs.TRANQUILGEM_DEFAULT);
            IDs.TranquilCrystal = config.getItem(Strings.TranquilCrystal  + " ID", IDs.TRANQUILCRYSTAL_DEFAULT).getInt(IDs.TRANQUILCRYSTAL_DEFAULT);
            
            IDs.ShinyCrystal = config.getItem(Strings.ShinyCrystal  + " ID", IDs.SHINYCRYSTAL_DEFAULT).getInt(IDs.SHINYCRYSTAL_DEFAULT);
            //BLOCKS
            IDs.NBlox = config.getBlock(Strings.NBlox  + " ID", IDs.NORMALBLOX_DEFAULT).getInt(IDs.NORMALBLOX_DEFAULT);
            IDs.HBlox = config.getBlock(Strings.HBlox  + " ID", IDs.HARDBLOX_DEFAULT).getInt(IDs.HARDBLOX_DEFAULT);
            IDs.MBlox = config.getBlock(Strings.MBlox  + " ID", IDs.METALBLOX_DEFAULT).getInt(IDs.METALBLOX_DEFAULT);
            IDs.PBlox = config.getBlock(Strings.PBlox  + " ID", IDs.PRIZEBLOX_DEFAULT).getInt(IDs.PRIZEBLOX_DEFAULT);
            IDs.RPBlox = config.getBlock(Strings.RPBlox  + " ID", IDs.RAREPRIZEBLOX_DEFAULT).getInt(IDs.RAREPRIZEBLOX_DEFAULT);
            IDs.BBlox = config.getBlock(Strings.BBlox  + " ID", IDs.BOUNCEBLOX_DEFAULT).getInt(IDs.BOUNCEBLOX_DEFAULT);
            IDs.DBlox = config.getBlock(Strings.DBlox  + " ID", IDs.DANGERBLOX_DEFAULT).getInt(IDs.DANGERBLOX_DEFAULT);
            IDs.BLBlox = config.getBlock(Strings.BLBlox  + " ID", IDs.BLBLOX_DEFAULT).getInt(IDs.BLBLOX_DEFAULT);
            IDs.Synthesis = config.getBlock(Strings.Synthesiser  + " ID", IDs.SYNTHESIS_DEFAULT).getInt(IDs.SYNTHESIS_DEFAULT);
            IDs.SynthesisMini = config.getBlock(Strings.SynthesiserMini  + " ID", IDs.SYNTHESISMINI_DEFAULT).getInt(IDs.SYNTHESISMINI_DEFAULT);
            IDs.BlazingOre = config.getBlock(Strings.BlazingOre  + " ID", IDs.BLAZINGORE_DEFAULT).getInt(IDs.BLAZINGORE_DEFAULT);
            //IDs.BlazingOreN = config.getBlock(Strings.BlazingOreN  + " ID", IDs.BLAZINGOREN_DEFAULT).getInt(IDs.BLAZINGOREN_DEFAULT);
            IDs.LightningOre = config.getBlock(Strings.LightningOre  + " ID", IDs.LIGHTNINGORE_DEFAULT).getInt(IDs.LIGHTNINGORE_DEFAULT);
            IDs.FrostOre = config.getBlock(Strings.FrostOre  + " ID", IDs.FROSTORE_DEFAULT).getInt(IDs.FROSTORE_DEFAULT);
            IDs.DenseOre = config.getBlock(Strings.DenseOre  + " ID", IDs.DENSEORE_DEFAULT).getInt(IDs.DENSEORE_DEFAULT);
            IDs.PowerOre = config.getBlock(Strings.PowerOre  + " ID", IDs.POWERORE_DEFAULT).getInt(IDs.POWERORE_DEFAULT);
            IDs.PowerOreE = config.getBlock(Strings.PowerOreE  + " ID", IDs.POWEROREE_DEFAULT).getInt(IDs.POWEROREE_DEFAULT);
            IDs.EnergyOre = config.getBlock(Strings.EnergyOre  + " ID", IDs.ENERGYORE_DEFAULT).getInt(IDs.ENERGYORE_DEFAULT);
            //IDs.EnergyOreN = config.getBlock(Strings.EnergyOreN  + " ID", IDs.ENERGYOREN_DEFAULT).getInt(IDs.ENERGYOREN_DEFAULT);
            IDs.RemembranceOre = config.getBlock(Strings.RemembranceOre  + " ID", IDs.REMEMBRANCEORE_DEFAULT).getInt(IDs.REMEMBRANCEORE_DEFAULT);
            //IDs.RemembranceOreN = config.getBlock(Strings.RemembranceOreN  + " ID", IDs.REMEMBRANCEOREN_DEFAULT).getInt(IDs.REMEMBRANCEOREN_DEFAULT);
            IDs.SerenityOre = config.getBlock(Strings.SerenityOre  + " ID", IDs.SERENITYORE_DEFAULT).getInt(IDs.SERENITYORE_DEFAULT);
            IDs.TwilightOre = config.getBlock(Strings.TwilightOre  + " ID", IDs.TWILIGHTORE_DEFAULT).getInt(IDs.TWILIGHTORE_DEFAULT);
            //IDs.TwilightOreN = config.getBlock(Strings.TwilightOreN  + " ID", IDs.TWILIGHTOREN_DEFAULT).getInt(IDs.TWILIGHTOREN_DEFAULT);
            IDs.TranquilOre = config.getBlock(Strings.TranquilOre  + " ID", IDs.TRANQUILORE_DEFAULT).getInt(IDs.TRANQUILORE_DEFAULT);
            IDs.BrightOre = config.getBlock(Strings.BrightOre  + " ID", IDs.BRIGHTORE_DEFAULT).getInt(IDs.BRIGHTORE_DEFAULT);
            IDs.DarkOre = config.getBlock(Strings.DarkOre  + " ID", IDs.DARKORE_DEFAULT).getInt(IDs.DARKORE_DEFAULT);
            //IDs.DarkOreN = config.getBlock(Strings.DarkOreN  + " ID", IDs.DARKOREN_DEFAULT).getInt(IDs.DARKOREN_DEFAULT);
            IDs.DarkOreE = config.getBlock(Strings.DarkOreE + " ID", IDs.DARKOREE_DEFAULT).getInt(IDs.DARKOREE_DEFAULT);
            IDs.LucidOre = config.getBlock(Strings.LucidOre  + " ID", IDs.LUCIDORE_DEFAULT).getInt(IDs.LUCIDORE_DEFAULT);

            //BOOLEANS
            final String WORLDGENERATION = ConfigCategory.getQualifiedName("World Generation", null);
            final String OVERWORLD = WORLDGENERATION + config.CATEGORY_SPLITTER + "Overworld Spawn Chances";
            final String END = WORLDGENERATION + config.CATEGORY_SPLITTER + "End Spawn Chances";
            final String GENERATE = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "World Generation";
            ConfigBooleans.enableGenerate = config.get(GENERATE, ConfigBooleans.enableGenerate_name, ConfigBooleans.enableGenerate_default).getBoolean(ConfigBooleans.enableGenerate_default);
            ConfigBooleans.enableOverworld = config.get(GENERATE, ConfigBooleans.enableOverworld_name, ConfigBooleans.enableOverworld_default).getBoolean(ConfigBooleans.enableOverworld_default);
            final String UPDATECHECK = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "Update Check";
            ConfigBooleans.enableUpdateCheck = config.get(UPDATECHECK, ConfigBooleans.enableUpdateCheck_name, ConfigBooleans.enableUpdateCheck_default).getBoolean(ConfigBooleans.enableUpdateCheck_default);
            final String KEYBLADE = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "Keyblade Config";
            ConfigBooleans.enable3D = config.get(KEYBLADE, ConfigBooleans.enable3D_name, ConfigBooleans.enable3D_default).getBoolean(ConfigBooleans.enable3D_default);
            ConfigBooleans.altWaywardWind = config.get(KEYBLADE, ConfigBooleans.altWaywardWind_name, ConfigBooleans.altWaywardWind_default).getBoolean(ConfigBooleans.altWaywardWind_default);
            final String RECIPE = config.CATEGORY_GENERAL + config.CATEGORY_SPLITTER + "Recipe Config";
            ConfigBooleans.heartRecipe = config.get(RECIPE, ConfigBooleans.heartRecipe_name, ConfigBooleans.heartRecipe_default).getBoolean(ConfigBooleans.heartRecipe_default);
            ConfigBooleans.bloxRecipe = config.get(RECIPE, ConfigBooleans.bloxRecipe_name, ConfigBooleans.bloxRecipe_default).getBoolean(ConfigBooleans.bloxRecipe_default);
            
            //OTHER
            config.addCustomCategoryComment(END, "Higher number = higher spawn chance");
            config.addCustomCategoryComment(OVERWORLD, "Higher number = higher spawn chance");
            ints.LucidOreChance = config.get(OVERWORLD, "Lucid Ore Spawn Chance", ints.LUCIDORECHANCE_DEFAULT).getInt(ints.LUCIDORECHANCE_DEFAULT);
            ints.SerenityOreChance = config.get(OVERWORLD, "Serenity Ore Spawn Chance", ints.SERENITYORECHANCE_DEFAULT).getInt(ints.SERENITYORECHANCE_DEFAULT);
            ints.TranquilOreChance = config.get(OVERWORLD, "Tranquil Ore Spawn Chance", ints.TRANQUILORECHANCE_DEFAULT).getInt(ints.TRANQUILORECHANCE_DEFAULT);
            ints.BrightOreChance = config.get(OVERWORLD, "Bright Ore Spawn Chance", ints.BRIGHTORECHANCE_DEFAULT).getInt(ints.BRIGHTORECHANCE_DEFAULT);
            ints.DarkOreChance = config.get(OVERWORLD, "Dark Ore Spawn Chance", ints.DARKORECHANCE_DEFAULT).getInt(ints.DARKORECHANCE_DEFAULT);
            ints.DenseOreChance = config.get(OVERWORLD, "Dense Ore Spawn Chance", ints.DENSEORECHANCE_DEFAULT).getInt(ints.DENSEORECHANCE_DEFAULT);
            ints.LightningOreChance = config.get(OVERWORLD, "Lightning Ore Spawn Chance", ints.LIGHTNINGORECHANCE_DEFAULT).getInt(ints.LIGHTNINGORECHANCE_DEFAULT);
            ints.BlazingOreChance = config.get(OVERWORLD, "Blazing Ore Spawn Chance", ints.BLAZINGORECHANCE_DEFAULT).getInt(ints.BLAZINGORECHANCE_DEFAULT);
            ints.PrizeBloxChance = config.get(OVERWORLD, "Prize Blox Spawn Chance", ints.PRIZEBLOXCHANCE_DEFAULT).getInt(ints.PRIZEBLOXCHANCE_DEFAULT);
            ints.RarePrizeBloxChance = config.get(OVERWORLD, "Rare Prize Blox Spawn Chance", ints.RAREPRIZEBLOXCHANCE_DEFAULT).getInt(ints.RAREPRIZEBLOXCHANCE_DEFAULT);
            ints.FrostOreChance = config.get(OVERWORLD, "Frost Ore Spawn Chance", ints.FROSTORECHANCE_DEFAULT).getInt(ints.FROSTORECHANCE_DEFAULT);
            ints.EnergyOreChance = config.get(OVERWORLD, "Energy Ore Spawn Chance", ints.ENERGYORECHANCE_DEFAULT).getInt(ints.ENERGYORECHANCE_DEFAULT);
            ints.RemembranceOreChance = config.get(OVERWORLD, "Remembrance Ore Spawn Chance", ints.REMEMBRANCEORECHANCE_DEFAULT).getInt(ints.REMEMBRANCEORECHANCE_DEFAULT);
            ints.TwilightOreChance = config.get(OVERWORLD, "Twilight Ore Spawn Chance", ints.TWILIGHTORECHANCE_DEFAULT).getInt(ints.TWILIGHTORECHANCE_DEFAULT);
            ints.PowerOreEChance = config.get(END, "Power Ore Spawn Chance", ints.POWEROREECHANCE_DEFAULT).getInt(ints.POWEROREECHANCE_DEFAULT);
            ints.DarkOreEChance = config.get(END, "Dark Ore Spawn Chance", ints.DARKOREECHANCE_DEFAULT).getInt(ints.DARKOREECHANCE_DEFAULT);
        }
        catch(Exception e){
            FMLLog.log(Level.SEVERE, e, Reference.MOD_ID + "Has a problem loading the config file");
        }
        finally{
            config.save();
        }
    }
}