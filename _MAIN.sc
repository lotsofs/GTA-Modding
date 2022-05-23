//-------------MAIN---------------
script_name 'MAIN' 
fade 0 0 
042C: set_total_missions_to 88 
030D: set_total_mission_points_to 154 
01F0: set_max_wanted_level_to 4 
02ED: set_total_hidden_packages_to 100 
set_wb_check_to 0 
00C0: set_current_time 22 0 
04E4: request_collision_at 83.0 -849.8 
Camera.SetAtPos(83.0, -849.8, 9.3)
Player.Create($PLAYER_CHAR, #NULL, 83.0, -849.8, 9.3)
Actor.EmulateFromPlayer($PLAYER_ACTOR, $PLAYER_CHAR)
start_mission 0  // Initial
Object.Init($ARENA_DOOR_1, #DTN_STADDOORA, -1109.615, 1330.097, 20.372)
Object.RemoveFromMissionCleanupList($ARENA_DOOR_1)
Object.Init($ARENA_DOOR_2, #DTN_STADDOORB, -1109.615, 1331.932, 20.372)
Object.RemoveFromMissionCleanupList($ARENA_DOOR_2)
Object.Init($6, #DTHOTRING_A, -1037.08, 1340.258, 36.552)
Object.RemoveFromMissionCleanupList($6)
$67 = 0 // $ = int 
Pickup.Create($110, #BRIBE, 15, 393.9, -60.2, 11.5)
Pickup.Create($111, #BRIBE, 15, 116.0, -1313.1, 4.4)
Pickup.Create($112, #BRIBE, 15, 393.7, -660.6, 10.7)
Pickup.Create($113, #BRIBE, 15, 470.7, 70.1, 10.8)
Pickup.Create($114, #BRIBE, 15, 382.7, 364.1, 10.8)
Pickup.Create($115, #BRIBE, 15, 422.4, 971.2, 12.1)
Pickup.Create($116, #BRIBE, 15, 89.1, 887.4, 10.5)
Pickup.Create($117, #BRIBE, 15, -822.7, 1304.5, 11.7)
Pickup.Create($118, #BRIBE, 15, -900.69, 251.4, 17.1)
Pickup.Create($119, #BRIBE, 15, -973.7, 61.0, 10.4)
Pickup.Create($120, #BRIBE, 15, -937.9, -114.1, 17.0)
Pickup.Create($121, #BRIBE, 15, -1015.9, -627.9, 11.2)
Pickup.Create($122, #BRIBE, 15, -906.3, -834.0, 15.7)
014B: $87 = init_car_generator #DELUXO -1 -1 force_spawn 1 alarm 0 door_lock 0 min_delay 0 max_delay 10000 at -1022.6 -868.6 12.2 angle 175.0 
014C: set_parked_car_generator $87 cars_to_generate_to 0 
014B: $88 = init_car_generator #SABRETUR -1 -1 force_spawn 1 alarm 0 door_lock 0 min_delay 0 max_delay 10000 at -1014.1 -869.4 12.2 angle 188.0 
014C: set_parked_car_generator $88 cars_to_generate_to 0 
014B: $89 = init_car_generator #SANDKING -1 -1 force_spawn 1 alarm 0 door_lock 0 min_delay 0 max_delay 10000 at -1014.3 -868.8 17.9 angle 195.0 
014C: set_parked_car_generator $89 cars_to_generate_to 0 
014B: $90 = init_car_generator #HOTRING -1 -1 force_spawn 1 alarm 0 door_lock 0 min_delay 0 max_delay 10000 at -1023.2 -868.1 17.9 angle 172.0 
014C: set_parked_car_generator $90 cars_to_generate_to 0 
014B: $1977 = init_car_generator #SEASPAR -1 -1 force_spawn 0 alarm 0 door_lock 0 min_delay 0 max_delay 10000 at -379.0 -632.1 10.2 angle 187.2 
014C: set_parked_car_generator $1977 cars_to_generate_to 0 
014B: $1978 = init_car_generator #RHINO -1 -1 force_spawn 0 alarm 0 door_lock 0 min_delay 0 max_delay 10000 at -1720.3 -239.6 14.8 angle 92.0 
014C: set_parked_car_generator $1978 cars_to_generate_to 0 
014B: $1979 = init_car_generator #HUNTER -1 -1 force_spawn 0 alarm 0 door_lock 0 min_delay 0 max_delay 10000 at -1681.2 -103.7 14.7 angle 180.0 
014C: set_parked_car_generator $1979 cars_to_generate_to 0 
014B: $2098 = init_car_generator #HUNTER -1 -1 force_spawn 0 alarm 0 door_lock 0 min_delay 0 max_delay 10000 at -72.4 -1607.9 12.7 angle 0.0 
014C: set_parked_car_generator $2098 cars_to_generate_to 0 
Object.Init($FILM_STUDIO_FRONT_GATE_CLOSED, #CI_GATESCLOSED, 11.697, 963.176, 12.258)
Object.RemoveFromMissionCleanupList($FILM_STUDIO_FRONT_GATE_CLOSED)
Object.Init($FILM_STUDIO_BACK_GATE_CLOSED, #CI_BACKGATECLOSE, -11.853, 884.06, 13.542)
Object.RemoveFromMissionCleanupList($FILM_STUDIO_BACK_GATE_CLOSED)
024A: $292 = get_phone_at 36.90385 -1023.3 
024A: $293 = get_phone_at 482.453 244.221 
024A: $294 = get_phone_at 38.341 -1023.3 
024A: $295 = get_phone_at -1482.801 -825.2587 
024A: $296 = get_phone_at -976.7705 -530.5467 
0180: set_on_mission_flag_to $ONMISSION 
$585 = 304.5 // $ = float 
$586 = 376.3 // $ = float 
$587 = 12.7 // $ = float 
$588 = -834.8 // $ = float 
$589 = 1306.9 // $ = float 
$590 = 11.0 // $ = float 
$591 = 14.0 // $ = float 
$592 = -1500.7 // $ = float 
$593 = 12.7 // $ = float 
$594 = 88.5 // $ = float 
$595 = -804.7 // $ = float 
$596 = 11.2 // $ = float 
$597 = 531.4 // $ = float 
$598 = 1273.7 // $ = float 
$599 = 17.6 // $ = float 
$600 = -560.1 // $ = float 
$601 = 703.6 // $ = float 
$602 = 20.5 // $ = float 
$453 = 209.5 // $ = float 
$454 = -1288.9 // $ = float 
$455 = 12.4 // $ = float 
$465 = 257.1 // $ = float 
$466 = -231.7 // $ = float 
$467 = 10.0 // $ = float 
$549 = -1059.6 // $ = float 
$550 = -274.5 // $ = float 
$551 = 11.4 // $ = float 
$552 = -1007.3 // $ = float 
$553 = -869.9 // $ = float 
$554 = 12.8 // $ = float 
$555 = 15.2 // $ = float 
$556 = 962.6 // $ = float 
$557 = 10.9 // $ = float 
$558 = -864.3 // $ = float 
$559 = -576.6 // $ = float 
$560 = 11.0 // $ = float 
$561 = -1011.7 // $ = float 
$562 = 203.9 // $ = float 
$563 = 11.2 // $ = float 
$564 = 487.2 // $ = float 
$565 = -81.5 // $ = float 
$566 = 11.4 // $ = float 
$567 = -685.8 // $ = float 
$568 = -1495.6 // $ = float 
$569 = 12.5 // $ = float 
$489 = -1003.1 // $ = float 
$490 = 207.0 // $ = float 
$491 = 10.0 // $ = float 
$459 = -246.6 // $ = float 
$460 = -1360.5 // $ = float 
$461 = 7.3 // $ = float 
$462 = -378.5 // $ = float 
$463 = -551.3 // $ = float 
$464 = 18.2 // $ = float 
$468 = 463.9 // $ = float 
$469 = -58.5 // $ = float 
$470 = 10.5 // $ = float 
$492 = -1101.1 // $ = float 
$493 = 343.2 // $ = float 
$494 = 10.2 // $ = float 
$471 = -69.4 // $ = float 
$472 = 932.7 // $ = float 
$473 = 9.9 // $ = float 
$474 = -1062.6 // $ = float 
$475 = -278.8 // $ = float 
$476 = 11.0 // $ = float 
$456 = 119.2 // $ = float 
$457 = -826.9 // $ = float 
$458 = 9.7 // $ = float 
$513 = 488.6 // $ = float 
$514 = -75.4 // $ = float 
$515 = 10.4 // $ = float 
$477 = -597.3 // $ = float 
$478 = 652.9 // $ = float 
$479 = 10.0 // $ = float 
$486 = -875.5 // $ = float 
$487 = 1159.3 // $ = float 
$488 = 10.2 // $ = float 
$480 = -1170.0 // $ = float 
$481 = -606.9 // $ = float 
$482 = 10.6 // $ = float 
$483 = -962.4 // $ = float 
$484 = 143.0 // $ = float 
$485 = 8.2 // $ = float 
$570 = 99.5 // $ = float 
$571 = -1468.5 // $ = float 
$572 = 9.9 // $ = float 
$573 = 428.4 // $ = float 
$574 = 605.9 // $ = float 
$575 = 12.2 // $ = float 
$495 = -865.9 // $ = float 
$496 = -571.9 // $ = float 
$497 = 11.0 // $ = float 
$576 = -1.9 // $ = float 
$577 = 959.9 // $ = float 
$578 = 10.9 // $ = float 
$579 = -640.8 // $ = float 
$580 = -1491.8 // $ = float 
$581 = 13.7 // $ = float 
$582 = -997.1 // $ = float 
$583 = 189.8 // $ = float 
$584 = 11.4 // $ = float 
04AE: $421 = 4 // = constant 
04AE: $432 = 22 // = constant 
04AE: $417 = 9 // = constant 
04AE: $418 = 8 // = constant 
04AE: $419 = 6 // = constant 
04AE: $420 = 7 // = constant 
04AE: $422 = 13 // = constant 
04AE: $423 = 10 // = constant 
04AE: $424 = 15 // = constant 
04AE: $425 = 29 // = constant 
04AE: $426 = 24 // = constant 
04AE: $427 = 11 // = constant 
04AE: $428 = 23 // = constant 
04AE: $429 = 14 // = constant 
04AE: $430 = 17 // = constant 
04AE: $431 = 30 // = constant 
02A7: $223 = create_icon_marker_and_sphere $417 at $456 $457 $458 
Marker.Disable($223)
02A7: $241 = create_icon_marker_and_sphere $418 at 491.0 -77.7 10.4 
Marker.Disable($241)
02A7: $274 = create_icon_marker_and_sphere $427 at $477 $478 $479 
Marker.Disable($274)
02A7: $287 = create_icon_marker_and_sphere $428 at $486 $487 $488 
Marker.Disable($287)
02A7: $278 = create_icon_marker_and_sphere $429 at $480 $481 $482 
Marker.Disable($278)
02A7: $283 = create_icon_marker_and_sphere $430 at $483 $484 $485 
Marker.Disable($283)
02A7: $297 = create_icon_marker_and_sphere $431 at -853.0 -302.0 10.0 
Marker.Disable($297)
02A7: $247 = create_icon_marker_and_sphere $422 at $468 $469 $470 
Marker.Disable($247)
02A7: $253 = create_icon_marker_and_sphere $423 at $492 $493 $494 
Marker.Disable($253)
02A7: $256 = create_icon_marker_and_sphere $424 at $471 $472 $473 
Marker.Disable($256)
02A7: $265 = create_icon_marker_and_sphere $425 at $462 $463 $464 
Marker.Disable($265)
02A7: $271 = create_icon_marker_and_sphere $426 at $474 $475 $476 
Marker.Disable($271)
02A7: $234 = create_icon_marker_and_sphere $420 at $462 $463 $464 
Marker.Disable($234)
02A7: $243 = create_icon_marker_and_sphere $421 at $465 $466 $467 
Marker.Disable($243)
02A7: $306 = create_icon_marker_and_sphere $432 at $489 $490 $491 
Marker.Disable($306)
02A7: $228 = create_icon_marker_and_sphere $419 at $459 $460 $461 
Marker.Disable($228)
$604 = 10000 // $ = int 
$605 = 2000 // $ = int 
$607 = 0 // $ = int 
$609 = 20000 // $ = int 
$610 = 3000 // $ = int 
$612 = 0 // $ = int 
$614 = 30000 // $ = int 
$617 = 4000 // $ = int 
$618 = 0 // $ = int 
$620 = 40000 // $ = int 
$621 = 5000 // $ = int 
$623 = 0 // $ = int 
$625 = 50000 // $ = int 
$626 = 1500 // $ = int 
$628 = 0 // $ = int 
$630 = 60000 // $ = int 
$631 = 7000 // $ = int 
$633 = 0 // $ = int 
$635 = 70000 // $ = int 
$636 = 8000 // $ = int 
$639 = 120000 // $ = int 
$640 = 10000 // $ = int 
$642 = 0 // $ = int 
$644 = 1000 // $ = int 
$647 = 2500 // $ = int 
$650 = 3000 // $ = int 
$653 = 6000 // $ = int 
$657 = 7000 // $ = int 
$661 = 8000 // $ = int 
$665 = 14000 // $ = int 
Pickup.Create($670, #INFO, 3, 493.5, 703.1, 12.1)
Pickup.Create($671, #INFO, 3, -108.3, -974.4, 10.4)
Pickup.Create($672, #INFO, 3, 508.9, 506.8, 11.3)
Pickup.Create($673, #INFO, 3, 398.8, -469.7, 11.7)
0517: $PRINT_WORKS_ASSET = create_unavailable_asset_pickup 'PRNT_NO' at $549 $550 $551  // You cannot buy the Print Works at this time, come back later.
0517: $CAR_SHOWROOM_ASSET = create_unavailable_asset_pickup 'CAR_NO' at $552 $553 $554  // You cannot buy the Car Showroom at this time, come back later.
0517: $FILM_STUDIO_ASSET = create_unavailable_asset_pickup 'PORN_NO' at $555 $556 $557  // You cannot buy the Film Studio at this time, come back later.
0517: $ICE_CREAM_FACTORY_ASSET = create_unavailable_asset_pickup 'ICE_NO' at $558 $559 $560  // You cannot buy the Ice Cream Factory at this time, come back later.
0517: $678 = create_unavailable_asset_pickup 'TAXI_NO' at $561 $562 $563  // You cannot buy the Taxi Company at this time, come back later.
0517: $679 = create_unavailable_asset_pickup 'BANK_NO' at $564 $565 $566  // You cannot buy The Malibu at this time, come back later.
0517: $680 = create_unavailable_asset_pickup 'BOAT_NO' at $567 $568 $569  // You cannot buy the Boatyard at this time, come back later.
0517: $615 = create_unavailable_asset_pickup 'STRP_NO' at $570 $571 $572  // You cannot buy the Stripclub at this time, come back later.
0518: $662 = create_available_asset_pickup 'NBMN_L' at $573 $574 $575 price $661  // Press the ~h~~k~~PED_ANSWER_PHONE~ ~w~button to purchase El Swanko Casa for $~1~
0570: $660 = create_asset_radar_marker_with_icon 25 at $573 $574 $575 
Marker.Disable($660)
0518: $654 = create_available_asset_pickup 'LNKV_L' at $585 $586 $587 price $653  // Press the ~h~~k~~PED_ANSWER_PHONE~ ~w~button to purchase Links View Apartment for $~1~
0570: $652 = create_asset_radar_marker_with_icon 25 at $585 $586 $587 
Marker.Disable($652)
0518: $666 = create_available_asset_pickup 'HYCO_L' at $588 $589 $590 price $665  // Press the ~h~~k~~PED_ANSWER_PHONE~ ~w~button to purchase Hyman Condo for $~1~
0570: $664 = create_asset_radar_marker_with_icon 25 at $588 $589 $590 
Marker.Disable($664)
0518: $658 = create_available_asset_pickup 'OCHE_L' at $591 $592 $593 price $657  // Press the ~h~~k~~PED_ANSWER_PHONE~ ~w~button to purchase Ocean Heights Apartment for $~1~
0570: $656 = create_asset_radar_marker_with_icon 25 at $591 $592 $593 
Marker.Disable($656)
0518: $651 = create_available_asset_pickup 'WASH_L' at $594 $595 $596 price $650  // Press the ~h~~k~~PED_ANSWER_PHONE~ ~w~button to purchase 1102 Washington Street for $~1~
0570: $649 = create_asset_radar_marker_with_icon 25 at $594 $595 $596 
Marker.Disable($649)
0518: $648 = create_available_asset_pickup 'VCPT_L' at $597 $598 $599 price $647  // Press the ~h~~k~~PED_ANSWER_PHONE~ ~w~button to purchase 3321 Vice Point for $~1~
0570: $646 = create_asset_radar_marker_with_icon 25 at $597 $598 $599 
Marker.Disable($646)
0518: $645 = create_available_asset_pickup 'SKUM_L' at $600 $601 $602 price $644  // Press the ~h~~k~~PED_ANSWER_PHONE~ ~w~button to purchase Skumole Shack for $~1~
0570: $643 = create_asset_radar_marker_with_icon 25 at $600 $601 $602 
Marker.Disable($643)
0219: $681 = create_garage_type 5 door -914.129 -1263.54 10.706 to -906.3 -1266.9 14.421 depth -907.137 -1246.626 
0219: $682 = create_garage_type 5 door -1014.341 -857.732 6.325 to -1014.341 -841.532 10.885 depth -1001.315 -857.732 
03BB: set_garage $682 door_type_to_swing_open 
0219: $683 = create_garage_type 5 door -886.157 -115.158 9.992 to -876.7 -119.83 15.58 depth -882.699 -108.312 
0219: $684 = create_garage_type 5 door 323.9 427.4 10.0 to 313.9 430.53 15.7 depth 326.3 434.5 
0219: $685 = create_garage_type 5 door -7.55 -1253.77 9.322 to 2.64 -1253.7 14.4 depth -7.55 -1261.2 
0219: $688 = create_garage_type 1 door -1056.05 -469.668 10.053 to -1038.966 -467.675 14.753 depth -1054.074 -486.611 
03BB: set_garage $688 door_type_to_swing_open 
0219: $689 = create_garage_type 23 door -823.448 -1488.083 10.852 to -842.0 -1481.0 16.165 depth -834.686 -1515.899 
03DA: set_garage $689 camera_follows_player 
03BB: set_garage $689 door_type_to_swing_open 
0219: $687 = create_garage_type 1 door -966.016 -861.529 5.761 to -966.016 -841.683 11.273 depth -978.454 -861.529 
03DA: set_garage $687 camera_follows_player 
03BB: set_garage $687 door_type_to_swing_open 
0219: $690 = create_garage_type 19 door 449.137 340.002 10.794 to 465.43 326.187 14.7 depth 465.42 340.002 
03BB: set_garage $690 door_type_to_swing_open 
0219: $691 = create_garage_type 4 door -1163.248 -1407.282 10.157 to -1159.338 -1397.813 16.989 depth -1178.292 -1400.939 
0219: $655 = create_garage_type 1 door 303.998 400.718 12.025 to 301.281 410.584 16.044 depth 298.697 402.389 
03DA: set_garage $655 camera_follows_player 
03BB: set_garage $655 door_type_to_swing_open 
057A: set_garage $655 max_cars_to 1 
0219: $667 = create_garage_type 1 door -848.225 1303.119 10.421 to -836.832 1307.033 15.816 depth -853.657 1318.901 
03DA: set_garage $667 camera_follows_player 
057A: set_garage $667 max_cars_to 4 
0219: $668 = create_garage_type 1 door -825.466 1311.499 10.537 to -817.159 1314.355 15.061 depth -828.66 1320.791 
03DA: set_garage $668 camera_follows_player 
057A: set_garage $668 max_cars_to 2 
0219: $669 = create_garage_type 1 door -816.37 1314.69 10.582 to -819.54 1324.01 15.061 depth -808.09 1317.46 
03DA: set_garage $669 camera_follows_player 
057A: set_garage $669 max_cars_to 2 
0219: $659 = create_garage_type 1 door 27.143 -1483.954 9.423 to 21.365 -1490.59 12.994 depth 22.611 -1483.384 
03BB: set_garage $659 door_type_to_swing_open 
03DA: set_garage $659 camera_follows_player 
057A: set_garage $659 max_cars_to 1 
0219: $663 = create_garage_type 1 door 450.136 641.029 10.112 to 457.977 641.029 13.092 depth 450.136 635.726 
03BB: set_garage $663 door_type_to_swing_open 
03DA: set_garage $663 camera_follows_player 
057A: set_garage $663 max_cars_to 1 
0219: $692 = create_garage_type 1 door -981.654 -802.265 6.325 to -981.654 -821.865 10.73 depth -991.127 -802.265 
03BB: set_garage $692 door_type_to_swing_open 
03DA: set_garage $692 camera_follows_player 
057A: set_garage $692 max_cars_to 2 
0219: $693 = create_garage_type 1 door -992.416 -802.265 6.325 to -992.416 -821.865 10.73 depth -1001.889 -802.265 
03BB: set_garage $693 door_type_to_swing_open 
03DA: set_garage $693 camera_follows_player 
057A: set_garage $693 max_cars_to 2 
0219: $694 = create_garage_type 1 door -1003.771 -802.265 6.325 to -1003.771 -821.865 10.73 depth -1013.244 -802.265 
03BB: set_garage $694 door_type_to_swing_open 
03DA: set_garage $694 camera_follows_player 
057A: set_garage $694 max_cars_to 2 
0219: $695 = create_garage_type 1 door -1015.436 -802.265 6.325 to -1015.436 -821.865 10.73 depth -1024.909 -802.265 
03BB: set_garage $695 door_type_to_swing_open 
03DA: set_garage $695 camera_follows_player 
057A: set_garage $695 max_cars_to 2 
0219: $686 = create_garage_type 1 door -362.12 -550.214 11.722 to -353.12 -550.214 15.16 depth -362.12 -539.484 
03BB: set_garage $686 door_type_to_swing_open 
03DA: set_garage $686 camera_follows_player 
057A: set_garage $686 max_cars_to 2 
02A8: $374 = create_marker 27 at $705 $706 $707 
Marker.Disable($374)
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
wait 0 
wait 0 
Object.Init($721, #YACHT_CHUNK_KB, $448, $449, $450)
Object.RemoveFromMissionCleanupList($721)
Object.Init($720, #YT_GANGPLNK_TMP, $448, $449, $450)
Object.RemoveFromMissionCleanupList($720)
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
start_new_script @NBMNBUY 
start_new_script @LNKVBY 
start_new_script @HYCOBY 
start_new_script @OCHEBY 
start_new_script @WASHBY 
start_new_script @SKUMBY 
start_new_script @VCPTBY 
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
if 
   Player.Defined($PLAYER_CHAR)
jf @MAIN_5272 
set_weather 0 
if 
   not Actor.Dead($PLAYER_ACTOR)
jf @MAIN_5221 
0352: set_actor $PLAYER_ACTOR skin_to 'PLAYER' 
038B: load_requested_models 
if 
   not Actor.Dead($PLAYER_ACTOR)
jf @MAIN_5221 
0353: refresh_actor $PLAYER_ACTOR 

:MAIN_5221
fade 1 1000 
start_new_script @HOT 
if 
   Player.Defined($PLAYER_CHAR)
jf @MAIN_5263 
select_interior 0 
Player.CanMove($PLAYER_CHAR, True)

:MAIN_5263
01B7: release_weather 
jump @MAIN_5272 

:MAIN_5272
wait 1000 
if 
   Player.Defined($PLAYER_CHAR)
jf @MAIN_5555 
if 
  $ONMISSION == 0 // $ == int 
jf @MAIN_5391 
if 
  $62 == 0 // $ == int 
jf @MAIN_5391 
if and
  $245 == 1 // $ == int 
  $PASSED_COK2_PHNOM_PENH_86 == 1 // $ == int 
jf @MAIN_5391 
start_new_script @SER3 
Marker.Disable($243)
02A7: $243 = create_icon_marker_and_sphere $421 at $465 $466 $467 
$62 = 1 // $ = int 

:MAIN_5391
if 
  100.0 > $102 // float > $ 
jf @MAIN_5424 
058C: $102 = percentage_completed 
jump @MAIN_5526 

:MAIN_5424
if 
  $91 == 0 // $ == int 
jf @MAIN_5526 
055B: $1352 = create_clothes_pickup 12 at -382.6 -585.9 25.3 
03E5: text_box 'CUNTY'  // New clothes delivered to the Vercetti Estate!
055E: set_player $PLAYER_CHAR max_health += 50 
055F: set_player $PLAYER_CHAR max_armour += 50 
035E: set_player $PLAYER_CHAR armour_to 200 
0222: set_player $PLAYER_CHAR health_to 200 
wait 5000 
03E5: text_box 'HELP61'  // You now have limitless ammo and double health on all vehicles.
$91 = 1 // $ = int 

:MAIN_5526
if 
  $1531 == 15 // $ == int 
jf @MAIN_5555 
030C: progress_made += 1 
$1531 = -1 // $ = int 

:MAIN_5555
jump @MAIN_5272 