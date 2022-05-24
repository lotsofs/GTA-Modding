//-------------MAIN---------------
script_name 'MAIN' 
fade 0 0 
set_wb_check_to 0 
042C: set_total_missions_to 88 
030D: set_total_mission_points_to 154 
01F0: set_max_wanted_level_to 4 
02ED: set_total_hidden_packages_to 100 
0180: set_on_mission_flag_to $ONMISSION 

00C0: set_current_time 22 0 
04E4: request_collision_at 83.0 -849.8 
Camera.SetAtPos(83.0, -849.8, 9.3)
Player.Create($PLAYER_CHAR, #NULL, 83.0, -849.8, 9.3)
Actor.EmulateFromPlayer($PLAYER_ACTOR, $PLAYER_CHAR)
start_mission 0  // Initial

// =========================== create world objects =========================== 
// stadium stuff
Object.Init($ARENA_DOOR_1, #DTN_STADDOORA, -1109.615, 1330.097, 20.372) //door 1
Object.RemoveFromMissionCleanupList($ARENA_DOOR_1)
Object.Init($ARENA_DOOR_2, #DTN_STADDOORB, -1109.615, 1331.932, 20.372) //door 2
Object.RemoveFromMissionCleanupList($ARENA_DOOR_2)
Object.Init($6, #DTHOTRING_A, -1037.08, 1340.258, 36.552) //poster
Object.RemoveFromMissionCleanupList($6)
// film studio stuff
Object.Init($FILM_STUDIO_FRONT_GATE_CLOSED, #CI_GATESCLOSED, 11.697, 963.176, 12.258)
Object.RemoveFromMissionCleanupList($FILM_STUDIO_FRONT_GATE_CLOSED)
Object.Init($FILM_STUDIO_BACK_GATE_CLOSED, #CI_BACKGATECLOSE, -11.853, 884.06, 13.542)
Object.RemoveFromMissionCleanupList($FILM_STUDIO_BACK_GATE_CLOSED)
// Cortez's yacht
049C: $722 = scripted_path_file 0 width 90.0
Object.Init($714, #YT_MAIN_BODY, -375.499, -1322.31, 9.81124)
Object.Init($715, #YT_MAIN_BODY2, -375.499, -1322.31, 9.81124)
Object.Init($717, #YT_DOORS14, -375.499, -1322.31, 9.81124)
Object.Init($718, #YT_TMP_BOAT, -375.499, -1322.31, 9.81124)
Object.Init($719, #LODMAIN_BODY, -375.499, -1322.31, 9.81124)
Object.RemoveFromMissionCleanupList($714)
Object.RemoveFromMissionCleanupList($715)
Object.RemoveFromMissionCleanupList($717)
Object.RemoveFromMissionCleanupList($718)
Object.RemoveFromMissionCleanupList($719)
049D: attach_scripted_file $722 with_object $714 
049D: attach_scripted_file $722 with_object $715 
049D: attach_scripted_file $722 with_object $717 
049D: attach_scripted_file $722 with_object $718 
049D: attach_scripted_file $722 with_object $719 
049E: set_scripted_file $722 speed_to 0.0 
Object.Init($721, #YACHT_CHUNK_KB, $448, $449, $450)
Object.RemoveFromMissionCleanupList($721)
Object.Init($720, #YT_GANGPLNK_TMP, $448, $449, $450)
Object.RemoveFromMissionCleanupList($720)

// =========================== create pickups ===========================
// cop bribes
Pickup.Create($110, #BRIBE, 15, 393.9, -60.2, 11.5) //Not far from Construction Site behind some houses
Pickup.Create($111, #BRIBE, 15, 116.0, -1313.1, 4.4) //Through Underground Shopping mall (washinton)
Pickup.Create($112, #BRIBE, 15, 393.7, -660.6, 10.7) //Middle of alleyways at back of Ocean Drive
Pickup.Create($113, #BRIBE, 15, 470.7, 70.1, 10.8) //Just down from Pizza Hut in Vice Point
Pickup.Create($114, #BRIBE, 15, 382.7, 364.1, 10.8) //In Alleyway in centre of Vice Point
Pickup.Create($115, #BRIBE, 15, 422.4, 971.2, 12.1) //Near garages at Big Mall
Pickup.Create($116, #BRIBE, 15, 89.1, 887.4, 10.5) //Down Unused street on Prawn Island
Pickup.Create($117, #BRIBE, 15, -822.7, 1304.5, 11.7) //Between shortcut in downtown
Pickup.Create($118, #BRIBE, 15, -900.69, 251.4, 17.1) //over jump at top of Little Hiati into Move Over Miami Sign
Pickup.Create($119, #BRIBE, 15, -973.7, 61.0, 10.4) //in little haiti close by auntie poulets hut
Pickup.Create($120, #BRIBE, 15, -937.9, -114.1, 17.0) //Over little aquaduct in little hiati
Pickup.Create($121, #BRIBE, 15, -1015.9, -627.9, 11.2) //Through alleyway in little havana
Pickup.Create($122, #BRIBE, 15, -906.3, -834.0, 15.7) //Over jump from main drag into car yard

Pickup.Create($670, #INFO, 3, 493.5, 703.1, 12.1)
Pickup.Create($671, #INFO, 3, -108.3, -974.4, 10.4)
Pickup.Create($672, #INFO, 3, 508.9, 506.8, 11.3)
Pickup.Create($673, #INFO, 3, 398.8, -469.7, 11.7)

// =========================== mission stuff ===========================
// coordinates for mission markers
$453 = 209.5 // An Old Friend
$454 = -1288.9
$455 = 12.4
$465 = 257.1 // Avery
$466 = -231.7
$467 = 10.0
$459 = -246.6 // Cortez
$460 = -1360.5
$461 = 7.3
$489 = -1003.1 // Kaufman Cabs
$490 = 207.0
$491 = 10.0
$462 = -378.5 // Diaz
$463 = -551.3
$464 = 18.2
$468 = 463.9 // Malibu
$469 = -58.5
$470 = 10.5
$492 = -1101.1 // Phil
$493 = 343.2
$494 = 10.2
$471 = -69.4 // Film Studio
$472 = 932.7
$473 = 9.9
$474 = -1062.6 // Print Works
$475 = -278.8
$476 = 11.0
$456 = 119.2 // Lawyer
$457 = -826.9
$458 = 9.7
$477 = -597.3 // Biker
$478 = 652.9
$479 = 10.0
$486 = -875.5 // Love Fist
$487 = 1159.3
$488 = 10.2
$480 = -1170.0 // Umberto
$481 = -606.9
$482 = 10.6
$483 = -962.4 // Auntie Poulet
$484 = 143.0
$485 = 8.2
$495 = -865.9 // Distribution
$496 = -571.9
$497 = 11.0

// originally from Mission 0
$510 = -244.6 // Rub Out
$511 = -491.3 
$512 = 10.6 

// get payphones
024A: $292 = get_phone_at 36.90385 -1023.3 
024A: $293 = get_phone_at 482.453 244.221 
024A: $294 = get_phone_at 38.341 -1023.3 
024A: $295 = get_phone_at -1482.801 -825.2587 
024A: $296 = get_phone_at -976.7705 -530.5467 
$516 = 36.798 // Payphone 1
$517 = -1024.404 
$518 = 9.451 
$519 = 482.5293 // Payphone 2
$520 = 244.276 
$521 = 10.09 
$522 = 38.244 // Payphone 3
$523 = -1024.251 
$524 = 9.451 
$525 = -1481.872 // Payphone 4
$526 = -825.3049 
$527 = 13.8777 
$528 = -978.0145 // Payphone 5
$529 = -530.7043 
$530 = 9.9513 

// misc coords
$513 = 488.6 // Malibu Club Main Door (used in Back Alley Brawl)
$514 = -75.4
$515 = 10.4

// Blip Types
04AE: $421 = 4 // A
04AE: $432 = 22 // Kaufman
04AE: $417 = 9 // L
04AE: $418 = 8 // K
04AE: $419 = 6 // C
04AE: $420 = 7 // D
04AE: $422 = 13 // Malibu
04AE: $423 = 10 // P
04AE: $424 = 15 // Film
04AE: $425 = 29 // V
04AE: $426 = 24 // Printworks
04AE: $427 = 11 // Bikers
04AE: $428 = 23 // LoveFist
04AE: $429 = 14 // Cubans
04AE: $430 = 17 // Haitians
04AE: $431 = 30 // Phone

// =========================== Savehouses ===========================
$HOUSE0_X = -560.1 // skumole shack purchase
$HOUSE0_Y = 703.6
$HOUSE0_Z = 20.5
$HOUSE1_X = 531.4 // 3321 vice point purchase
$HOUSE1_Y = 1273.7
$HOUSE1_Z = 17.6
$HOUSE2_X = 88.5 // 1102 washington street purchase
$HOUSE2_Y = -804.7
$HOUSE2_Z = 11.2
$HOUSE3_X = 14.0 // ocean heights apartment purchase
$HOUSE3_Y = -1500.7
$HOUSE3_Z = 12.7
$HOUSE4_X = -834.8 // hyman condo purchase
$HOUSE4_Y = 1306.9
$HOUSE4_Z = 11.0
$HOUSE5_X = 428.4 // El Swanko Casa Purchase
$HOUSE5_Y = 605.9
$HOUSE5_Z = 12.2
$HOUSE6_X = 304.5 // links view apartment purchase
$HOUSE6_Y = 376.3
$HOUSE6_Z = 12.7
$HOUSE7_X = -1247.045 // junkyard
$HOUSE7_Y = 87.9088 
$HOUSE7_Z = 11.4567
$HOUSE0_COST = 1000 // Skumole Shack Cost
$HOUSE1_COST = 2500 // 3321 Vice Point Cost
$HOUSE2_COST = 3000 // 1102 Washington Street Cost
$HOUSE3_COST = 7000 // Ocean Heighs Apt Cost
$HOUSE4_COST = 14000 // Hyman Condo Cost
$HOUSE5_COST = 8000 // El Swanko Casa Cost
$HOUSE6_COST = 6000 // Links View Apt Cost
$HOUSE7_COST = 2000 // Junkyard
0518: $HOUSE0_PICKUP = create_available_asset_pickup 'SKUM_L' at $HOUSE0_X $HOUSE0_Y $HOUSE0_Z price $HOUSE0_COST  // Press the ~h~~k~~PED_ANSWER_PHONE~ ~w~button to purchase Skumole Shack for $~1~
0518: $HOUSE1_PICKUP = create_available_asset_pickup 'VCPT_L' at $HOUSE1_X $HOUSE1_Y $HOUSE1_Z price $HOUSE1_COST  // Press the ~h~~k~~PED_ANSWER_PHONE~ ~w~button to purchase 3321 Vice Point for $~1~
0518: $HOUSE2_PICKUP = create_available_asset_pickup 'WASH_L' at $HOUSE2_X $HOUSE2_Y $HOUSE2_Z price $HOUSE2_COST  // Press the ~h~~k~~PED_ANSWER_PHONE~ ~w~button to purchase 1102 Washington Street for $~1~
0518: $HOUSE3_PICKUP = create_available_asset_pickup 'OCHE_L' at $HOUSE3_X $HOUSE3_Y $HOUSE3_Z price $HOUSE3_COST  // Press the ~h~~k~~PED_ANSWER_PHONE~ ~w~button to purchase Ocean Heights Apartment for $~1~
0518: $HOUSE4_PICKUP = create_available_asset_pickup 'HYCO_L' at $HOUSE4_X $HOUSE4_Y $HOUSE4_Z price $HOUSE4_COST  // Press the ~h~~k~~PED_ANSWER_PHONE~ ~w~button to purchase Hyman Condo for $~1~
0518: $HOUSE5_PICKUP = create_available_asset_pickup 'NBMN_L' at $HOUSE5_X $HOUSE5_Y $HOUSE5_Z price $HOUSE5_COST  // Press the ~h~~k~~PED_ANSWER_PHONE~ ~w~button to purchase El Swanko Casa for $~1~
0518: $HOUSE6_PICKUP = create_available_asset_pickup 'LNKV_L' at $HOUSE6_X $HOUSE6_Y $HOUSE6_Z price $HOUSE6_COST  // Press the ~h~~k~~PED_ANSWER_PHONE~ ~w~button to purchase Links View Apartment for $~1~
0518: $HOUSE7_PICKUP = create_available_asset_pickup 'SKUM_L' at $HOUSE7_X $HOUSE7_Y $HOUSE7_Z price $HOUSE7_COST  // Press the ~h~~k~~PED_ANSWER_PHONE~ ~w~button to purchase Links View Apartment for $~1~

// =========================== Assets: ===========================
// coordinates for asset purchase markers
$561 = -1011.7 // Kaufman Cabs Purchase
$562 = 203.9
$563 = 11.2
$567 = -685.8 // Boatyard Purchase
$568 = -1495.6
$569 = 12.5
$564 = 487.2 // Malibu Purchase
$565 = -81.5
$566 = 11.4
$549 = -1059.6 // Print Works Purchase
$550 = -274.5
$551 = 11.4
$552 = -1007.3 // Sunshine Autos Purchase
$553 = -869.9
$554 = 12.8
$555 = 15.2 // Film Studios Purchase
$556 = 962.6
$557 = 10.9
$558 = -864.3 // Cherry Poppers Purchase
$559 = -576.6
$560 = 11.0
$570 = 99.5 // Pole Position Purchase 
$571 = -1468.5
$572 = 9.9

// money generator pickup coordinates
$576 = -1.9 // Film Studio Money Generator
$577 = 959.9
$578 = 10.9
$579 = -640.8 // Boatyard Money Generator
$580 = -1491.8
$581 = 13.7
$582 = -997.1 // Kaufman Cabs Money Generator
$583 = 189.8
$584 = 11.4

$605 = 2000 // Boatyard Revenue
$607 = 0 // Boatyard Completion Bool
$610 = 3000 // Cherry Poppers Revenue
$612 = 0 //  Cherry Poppers Completion Bool
$617 = 4000 // Pole Position Revenue
$618 = 0 // Pole Position Completion Bool
$621 = 5000 // Kaufman Revenue
$623 = 0 // Kaufman Completion Bool
$626 = 1500 // SSA Revenue
$628 = 0 // SSA Completion Bool (1st list)
$631 = 7000 // Film Studio Revenue
$633 = 0 // Film Studio Completion Bool
$636 = 8000 // PW Revenue
$640 = 10000 // Malibu Revenue
$642 = 0 // Malibu Completion Bool

// Asset Costs
$604 = 10000 // Boatyard Cost
$609 = 20000 // Cherry Poppers Cost
$614 = 30000 // Pole Position Cost
$620 = 40000 // Kaufman Cost
$625 = 50000 // SSA Cost
$630 = 60000 // Film Studio Cost
$635 = 70000 // PW Cost
$639 = 120000 // Malibu Cost

0517: $PRINT_WORKS_ASSET = create_unavailable_asset_pickup 'PRNT_NO' at $549 $550 $551  // You cannot buy the Print Works at this time, come back later.
0517: $CAR_SHOWROOM_ASSET = create_unavailable_asset_pickup 'CAR_NO' at $552 $553 $554  // You cannot buy the Car Showroom at this time, come back later.
0517: $FILM_STUDIO_ASSET = create_unavailable_asset_pickup 'PORN_NO' at $555 $556 $557  // You cannot buy the Film Studio at this time, come back later.
0517: $ICE_CREAM_FACTORY_ASSET = create_unavailable_asset_pickup 'ICE_NO' at $558 $559 $560  // You cannot buy the Ice Cream Factory at this time, come back later.
0517: $678 = create_unavailable_asset_pickup 'TAXI_NO' at $561 $562 $563  // You cannot buy the Taxi Company at this time, come back later.
0517: $679 = create_unavailable_asset_pickup 'BANK_NO' at $564 $565 $566  // You cannot buy The Malibu at this time, come back later.
0517: $680 = create_unavailable_asset_pickup 'BOAT_NO' at $567 $568 $569  // You cannot buy the Boatyard at this time, come back later.
0517: $615 = create_unavailable_asset_pickup 'STRP_NO' at $570 $571 $572  // You cannot buy the Stripclub at this time, come back later.

// =========================== Garages ===========================
0219: $681 = create_garage_type 5 door -914.129 -1263.54 10.706 to -906.3 -1266.9 14.421 depth -907.137 -1246.626          // pay n spray
0219: $682 = create_garage_type 5 door -1014.341 -857.732 6.325 to -1014.341 -841.532 10.885 depth -1001.315 -857.732      // pay n spray
03BB: set_garage $682 door_type_to_swing_open 
0219: $683 = create_garage_type 5 door -886.157 -115.158 9.992 to -876.7 -119.83 15.58 depth -882.699 -108.312             // pay n spray
0219: $684 = create_garage_type 5 door 323.9 427.4 10.0 to 313.9 430.53 15.7 depth 326.3 434.5                             // pay n spray
0219: $685 = create_garage_type 5 door -7.55 -1253.77 9.322 to 2.64 -1253.7 14.4 depth -7.55 -1261.2                       // pay n spray
0219: $688 = create_garage_type 1 door -1056.05 -469.668 10.053 to -1038.966 -467.675 14.753 depth -1054.074 -486.611       // sir yes sir win
03BB: set_garage $688 door_type_to_swing_open 
0219: $689 = create_garage_type 23 door -823.448 -1488.083 10.852 to -842.0 -1481.0 16.165 depth -834.686 -1515.899        // sir yes sir fail
03DA: set_garage $689 camera_follows_player 
03BB: set_garage $689 door_type_to_swing_open 
0219: $687 = create_garage_type 1 door -966.016 -861.529 5.761 to -966.016 -841.683 11.273 depth -978.454 -861.529          // SSA exports
03DA: set_garage $687 camera_follows_player 
03BB: set_garage $687 door_type_to_swing_open 
0219: $690 = create_garage_type 19 door 449.137 340.002 10.794 to 465.43 326.187 14.7 depth 465.42 340.002                  // cop land
03BB: set_garage $690 door_type_to_swing_open 
0219: $691 = create_garage_type 4 door -1163.248 -1407.282 10.157 to -1159.338 -1397.813 16.989 depth -1178.292 -1400.939   // bomb shop
0219: $655 = create_garage_type 1 door 303.998 400.718 12.025 to 301.281 410.584 16.044 depth 298.697 402.389               // safehouse vice view
03DA: set_garage $655 camera_follows_player 
03BB: set_garage $655 door_type_to_swing_open 
057A: set_garage $655 max_cars_to 1 
0219: $667 = create_garage_type 1 door -848.225 1303.119 10.421 to -836.832 1307.033 15.816 depth -853.657 1318.901         // hyman condo 1 (westmost)
03DA: set_garage $667 camera_follows_player 
057A: set_garage $667 max_cars_to 4 
0219: $668 = create_garage_type 1 door -825.466 1311.499 10.537 to -817.159 1314.355 15.061 depth -828.66 1320.791          // hyman condo 2 (middle)
03DA: set_garage $668 camera_follows_player 
057A: set_garage $668 max_cars_to 2 
0219: $669 = create_garage_type 1 door -816.37 1314.69 10.582 to -819.54 1324.01 15.061 depth -808.09 1317.46               // hyman condo 3 (eastmost)
03DA: set_garage $669 camera_follows_player 
057A: set_garage $669 max_cars_to 2 
0219: $659 = create_garage_type 1 door 27.143 -1483.954 9.423 to 21.365 -1490.59 12.994 depth 22.611 -1483.384              // ocean heights apt
03BB: set_garage $659 door_type_to_swing_open 
03DA: set_garage $659 camera_follows_player 
057A: set_garage $659 max_cars_to 1 
0219: $663 = create_garage_type 1 door 450.136 641.029 10.112 to 457.977 641.029 13.092 depth 450.136 635.726               // el swanko casa
03BB: set_garage $663 door_type_to_swing_open 
03DA: set_garage $663 camera_follows_player 
057A: set_garage $663 max_cars_to 1 
0219: $692 = create_garage_type 1 door -981.654 -802.265 6.325 to -981.654 -821.865 10.73 depth -991.127 -802.265           // SSA 1 (eastmost)
03BB: set_garage $692 door_type_to_swing_open 
03DA: set_garage $692 camera_follows_player 
057A: set_garage $692 max_cars_to 2 
0219: $693 = create_garage_type 1 door -992.416 -802.265 6.325 to -992.416 -821.865 10.73 depth -1001.889 -802.265          // SSA 2
03BB: set_garage $693 door_type_to_swing_open 
03DA: set_garage $693 camera_follows_player 
057A: set_garage $693 max_cars_to 2 
0219: $694 = create_garage_type 1 door -1003.771 -802.265 6.325 to -1003.771 -821.865 10.73 depth -1013.244 -802.265        // SSA 3
03BB: set_garage $694 door_type_to_swing_open 
03DA: set_garage $694 camera_follows_player 
057A: set_garage $694 max_cars_to 2 
0219: $695 = create_garage_type 1 door -1015.436 -802.265 6.325 to -1015.436 -821.865 10.73 depth -1024.909 -802.265        // SSA 4 (westmost)
03BB: set_garage $695 door_type_to_swing_open 
03DA: set_garage $695 camera_follows_player 
057A: set_garage $695 max_cars_to 2 
0219: $686 = create_garage_type 1 door -362.12 -550.214 11.722 to -353.12 -550.214 15.16 depth -362.12 -539.484             // Vercetti garage
03BB: set_garage $686 door_type_to_swing_open 
03DA: set_garage $686 camera_follows_player 
057A: set_garage $686 max_cars_to 2 

// =========================== Start Missions and scripts ===========================
wait 0 
wait 0 // Game crashes upon restart without these
start_mission 1  // Intro
start_new_script @O4X4_1 
start_new_script @TAXI_L 
start_new_script @FIRE 
start_new_script @AMBULA 
start_new_script @COP 
start_new_script @PIZZ 
start_new_script @BMXLOOP 
start_new_script @RCHELY1 
start_new_script @RC_RACE 
start_new_script @RC_PLNE 
start_new_script @MULTI 
start_new_script @PSAVE1 
start_new_script @HELP 
start_new_script @HELI1 
start_new_script @HELI2 
start_new_script @HELI3 
start_new_script @HELI4 
start_new_script @STADIUM 
start_new_script @ARMYBAS 
start_new_script @HOUSEBY
// start_new_script @NBMNBUY 
// start_new_script @LNKVBY 
// start_new_script @HYCOBY 
// start_new_script @OCHEBY 
// start_new_script @WASHBY 
// start_new_script @SKUMBY 
// start_new_script @VCPTBY 
create_thread_wb @HJ 
create_thread_wb @USJ 
create_thread_wb @AMMU 
create_thread_wb @SECURE 
create_thread_wb @INTERIO 
create_thread_wb @IMPORT 
create_thread_wb @CELLFON 
create_thread_wb @BUS 
create_thread_wb @CARGEN 
create_thread_wb @PICKUPS 
create_thread_wb @JUNKFUD 
create_thread_wb @RAMPAGE 
create_thread_wb @SHOPS 
create_thread_wb @AUDIO 
wait 0 

// =========================== Stuff ===========================
// Set the player skin etc
if 
   Player.Defined($PLAYER_CHAR)
jf @MAIN_checkavery3 
  set_weather 0 
  if 
    not Actor.Dead($PLAYER_ACTOR)
  jf @MAIN_startstory 
    0352: set_actor $PLAYER_ACTOR skin_to 'PLAYER' 
    038B: load_requested_models 
    if 
      not Actor.Dead($PLAYER_ACTOR)
    jf @MAIN_startstory 
      0353: refresh_actor $PLAYER_ACTOR   

  :MAIN_startstory
  fade 1 1000 
  start_new_script @HOT // starts the An Old Friend mission start script
  01B7: release_weather 
  if 
    Player.Defined($PLAYER_CHAR)
  jf @MAIN_checkavery3 
  select_interior 0 
  Player.CanMove($PLAYER_CHAR, True)

:MAIN_checkavery3
wait 1000 
if 
   Player.Defined($PLAYER_CHAR)
jf @MAIN_continue 
if and
  $ONMISSION == 0 
  $62 == 0 // marker doesnt exist yet
  $245 == 1 // Avery 2 passed
  $PASSED_COK2_PHNOM_PENH_86 == 1 
jf @MAIN_checkpercentcompletion 
start_new_script @SER3 // Avery 3 script
Marker.Disable($243)
02A7: $243 = create_icon_marker_and_sphere $421 at $465 $466 $467 
$62 = 1

:MAIN_checkpercentcompletion
if 
  100.0 > $102 // float > $ 
jf @MAIN_reward100percentrewards 
058C: $102 = percentage_completed 
jump @MAIN_checkrobberies 

:MAIN_reward100percentrewards
if 
  $91 == 0 // rewards not yet given already 
jf @MAIN_checkrobberies 
055B: $1352 = create_clothes_pickup 12 at -382.6 -585.9 25.3 
03E5: text_box 'CUNTY'  // New clothes delivered to the Vercetti Estate!
055E: set_player $PLAYER_CHAR max_health += 50 
055F: set_player $PLAYER_CHAR max_armour += 50 
035E: set_player $PLAYER_CHAR armour_to 200 
0222: set_player $PLAYER_CHAR health_to 200 
wait 5000 
03E5: text_box 'HELP61'  // You now have limitless ammo and double health on all vehicles.
$91 = 1 // $ = int 

:MAIN_checkrobberies
if 
  $1531 == 15 // $ == int 
jf @MAIN_continue 
030C: progress_made += 1 
$1531 = -1 // $ = int 

:MAIN_continue
// Cheats for testing
Player.Money($PLAYER_CHAR) += 100
jump @MAIN_checkavery3 

//-------------ENDMAIN---------------