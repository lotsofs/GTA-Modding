:HOUSBUY
script_name 'HOUSBUY' 
$ONMISSION = 1
wait 0 
030C: progress_made += 1 
$HOUSESBOUGHT += 1
0169: set_fade_color 0 0 1 
fade 0 500 
Player.CanMove($PLAYER_CHAR, False)
03BF: set_player $PLAYER_CHAR ignored_by_everyone_to 1 
03F4: set_all_vehicles_apply_damage_rules 0 

:HOUSBUY_ishouse0
if
   $HOUSETOBUY == 0	// Skumole Shack
jf @HOUSBUY_ishouse1
$CAMERAPOSX = -570.4593
$CAMERAPOSY = 708.1309
$CAMERAPOSZ = 24.3593
$CAMERATARGETX = -569.6928
$CAMERATARGETY = 707.5626
$CAMERATARGETZ = 24.0599
$PLAYERPUTATX = -559.9
$PLAYERPUTATY = 705.4
$PLAYERPUTATZ = 19.8
$PLAYERPUTATA = 243.0
$HOUSEHASGARAGE = 0
0084: $HOUSECOST = $644
// Marker.Disable($HOUSE0_MARKER)
0570: $HOUSE0_MARKER = create_asset_radar_marker_with_icon 19 at $600 $601 $602 
018B: set_marker $HOUSE0_MARKER display 2 
0542: add_property 13 to_property_own_stats 
$HOUSE0BOUGHT = 1
// start_new_script @SAVE7 
jump @HOUSBUY_fadeout

:HOUSBUY_ishouse1
if
   $HOUSETOBUY == 1	// 3321 Vice Point
jf @HOUSBUY_ishouse2
$CAMERAPOSX = 468.3571
$CAMERAPOSY = 1259.458
$CAMERAPOSZ = 21.8848
$CAMERATARGETX = 469.2978
$CAMERATARGETY = 1259.797
$CAMERATARGETZ = 21.8834
$PLAYERPUTATX = 529.6626
$PLAYERPUTATY = 1272.155
$PLAYERPUTATZ = 16.822
$PLAYERPUTATA = 131.5277
$HOUSEHASGARAGE = 0
0084: $HOUSECOST = $647
// Marker.Disable($646)
0570: $646 = create_asset_radar_marker_with_icon 19 at $597 $598 $599 
018B: set_marker $646 display 2 
0542: add_property 8 to_property_own_stats 
$HOUSE1BOUGHT = 1
// start_new_script @SAVE7 
jump @HOUSBUY_fadeout

:HOUSBUY_ishouse2
if
   $HOUSETOBUY == 2	// 1102 Washington Street
jf @HOUSBUY_ishouse3
$CAMERAPOSX = 57.5999
$CAMERAPOSY = -681.8762
$CAMERAPOSZ = 10.4095
$CAMERATARGETX = 57.8653
$CAMERATARGETY = -682.802
$CAMERATARGETZ = 10.6787
$PLAYERPUTATX = 90.781
$PLAYERPUTATY = -806.1213
$PLAYERPUTATZ = 10.3349
$PLAYERPUTATA = 238.8605
$HOUSEHASGARAGE = 0
0084: $HOUSECOST = $650
// Marker.Disable($649)
0570: $649 = create_asset_radar_marker_with_icon 19 at $594 $595 $596
018B: set_marker $649 display 2 
0542: add_property 11 to_property_own_stats 
$HOUSE2BOUGHT = 1
// start_new_script @SAVE7 
jump @HOUSBUY_fadeout

:HOUSBUY_ishouse3
if
   $HOUSETOBUY == 3	// Ocean Heights Apartment
jf @HOUSBUY_ishouse4
$CAMERAPOSX = -9.9202
$CAMERAPOSY = -1467.05
$CAMERAPOSZ = 10.114
$CAMERATARGETX = -9.376
$CAMERATARGETY = -1467.813
$CAMERATARGETZ = 10.4639
$PLAYERPUTATX = 14.4571 
$PLAYERPUTATY = -1498.594 
$PLAYERPUTATZ = 12.1974 
$PLAYERPUTATA = 353.8286 
$HOUSEHASGARAGE = 1
$GARAGECAMERAPOSX = 17.7346 
$GARAGECAMERAPOSY = -1467.674 
$GARAGECAMERAPOSZ = 18.6329
$GARAGECAMERATARGETX = 18.0802 
$GARAGECAMERATARGETY = -1468.512 
$GARAGECAMERATARGETZ = 18.2106
0084: $HOUSECOST = $657
// Marker.Disable($656)
0570: $656 = create_asset_radar_marker_with_icon 19 at $591 $592 $593
018B: set_marker $656 display 2 
0542: add_property 12 to_property_own_stats 
02FA: garage $659 change_to_type 25 
$HOUSE3BOUGHT = 1
// start_new_script @SAVE7 
jump @HOUSBUY_fadeout

:HOUSBUY_ishouse4
if
   $HOUSETOBUY == 4	// Hyman Condo
jf @HOUSBUY_ishouse5
$CAMERAPOSX = -905.0276
$CAMERAPOSY = 1352.564
$CAMERAPOSZ = 50.7682
$CAMERATARGETX = -904.088
$CAMERATARGETY = 1352.261
$CAMERATARGETZ = 50.9287
$PLAYERPUTATX = -833.811 
$PLAYERPUTATY = 1304.07 
$PLAYERPUTATZ = 10.5131
$PLAYERPUTATA = 200.4458
$HOUSEHASGARAGE = 2
$GARAGECAMERAPOSX = -848.3207
$GARAGECAMERAPOSY = 1292.835
$GARAGECAMERAPOSZ = 11.4866
$GARAGECAMERATARGETX = -847.6996
$GARAGECAMERATARGETY = 1293.611
$GARAGECAMERATARGETZ = 11.5998
0084: $HOUSECOST = $665
// Marker.Disable($664)
0570: $664 = create_asset_radar_marker_with_icon 19 at $588 $589 $590 
018B: set_marker $664 display 2 
0542: add_property 14 to_property_own_stats 
02FA: garage $667 change_to_type 17 
02FA: garage $668 change_to_type 18 
02FA: garage $669 change_to_type 24
$HOUSE4BOUGHT = 1
$1300 = 1 // $ = int 
$1795 = 1 // $ = int 
055B: $1298 = create_clothes_pickup 1 at -820.2 1364.1 66.4 
// start_new_script @SAVE7 
jump @HOUSBUY_fadeout

:HOUSBUY_ishouse5
if
   $HOUSETOBUY == 5	// 
jf @HOUSBUY_ishouse6
$HOUSE5BOUGHT = 1
// null house
jump @HOUSBUY_fadeout

:HOUSBUY_ishouse6
if
   $HOUSETOBUY == 6	// Links View
jf @HOUSBUY_ishouse7
$CAMERAPOSX = 241.4097 
$CAMERAPOSY = 420.0691 
$CAMERAPOSZ = 10.388
$CAMERATARGETX = 242.141 
$CAMERATARGETY = 419.4232 
$CAMERATARGETZ = 10.6071
$PLAYERPUTATX = 306.5728 
$PLAYERPUTATY = 376.2928 
$PLAYERPUTATZ = 12.1856
$PLAYERPUTATA = 276.3156 
$HOUSEHASGARAGE = 1
$GARAGECAMERAPOSX = 313.6496 
$GARAGECAMERAPOSY = 390.976 
$GARAGECAMERAPOSZ = 14.5314
$GARAGECAMERATARGETX = 313.0024 
$GARAGECAMERATARGETY = 391.738 
$GARAGECAMERATARGETZ = 14.5534
0084: $HOUSECOST = $653
// Marker.Disable($652)
0570: $652 = create_asset_radar_marker_with_icon 19 at $585 $586 $587 
018B: set_marker $652 display 2 
0542: add_property 9 to_property_own_stats 
02FA: garage $655 change_to_type 26 
$HOUSE6BOUGHT = 1
// start_new_script @SAVE7 
jump @HOUSBUY_fadeout

:HOUSBUY_ishouse7
if
   $HOUSETOBUY == 7	// El Swanko Casa
jf @HOUSBUY_nohouse
$CAMERAPOSX = 415.9304 
$CAMERAPOSY = 640.0891 
$CAMERAPOSZ = 12.9833
$CAMERATARGETX = 416.2365
$CAMERATARGETY = 639.1425
$CAMERATARGETZ = 13.0847
$PLAYERPUTATX = 428.373 
$PLAYERPUTATY = 608.9806 
$PLAYERPUTATZ = 11.6898
$PLAYERPUTATA = 0.0
$HOUSEHASGARAGE = 1
$GARAGECAMERAPOSX = 427.813
$GARAGECAMERAPOSY = 650.6702
$GARAGECAMERAPOSZ = 15.3209
$GARAGECAMERATARGETX = 428.6758 
$GARAGECAMERATARGETY = 650.2003 
$GARAGECAMERATARGETZ = 15.1346
0084: $HOUSECOST = $661
// Marker.Disable($660)
0570: $660 = create_asset_radar_marker_with_icon 19 at $573 $574 $575 
018B: set_marker $660 display 2 
0542: add_property 10 to_property_own_stats 
02FA: garage $663 change_to_type 16 
$HOUSE7BOUGHT = 1
// start_new_script @SAVE7 
jump @HOUSBUY_fadeout

:HOUSBUY_nohouse
0169: set_fade_color 0 0 1 
fade 0 500 
jump @HOUSBUY_endfade

:HOUSBUY_fadeout
if
fading
jf @HOUSBUY_postfadeout
wait 0
jump @HOUSBUY_fadeout

:HOUSBUY_postfadeout
0395: clear_area 1 at $PLAYERPUTATX $PLAYERPUTATY $PLAYERPUTATZ range 1.0 
0055: put_player $PLAYER_CHAR at $PLAYERPUTATX $PLAYERPUTATY $PLAYERPUTATZ 
0171: set_player $PLAYER_CHAR z_angle_to $PLAYERPUTATA
02A3: enable_widescreen 1 
0169: set_fade_color 0 0 1 
fade 1 500 
Camera.SetPosition($CAMERAPOSX, $CAMERAPOSY, $CAMERAPOSZ, 0.0, 0.0, 0.0)
Camera.PointAt($CAMERATARGETX, $CAMERATARGETY, $CAMERATARGETZ, 2)

:HOUSBUY_fadein
if 
fading 
jf @HOUSBUY_postfadein 
wait 0 
jump @HOUSBUY_fadein 

:HOUSBUY_postfadein
0394: play_music 1 
043C: set_game_sounds_disable_on_fade 0 
0529: add $HOUSECOST to_money_spent_on_property_stats 

:HOUSBUY_postfadehouse0
if
   $HOUSETOBUY == 0	// Skumole Shack
jf @HOUSBUY_postfadehouse1
01E3: text_1number_styled 'SKUMBUY' number $HOUSECOST time 5000 style 6  // Skumole Shack purchased: $~1~

:HOUSBUY_postfadehouse1
if
   $HOUSETOBUY == 1	// Vice Point
jf @HOUSBUY_postfadehouse2
01E3: text_1number_styled 'VCPTBUY' number $HOUSECOST time 5000 style 6  // 3321 Vice Point purchased: $~1~

:HOUSBUY_postfadehouse2
if
   $HOUSETOBUY == 2	// 1102 Washington Street
jf @HOUSBUY_postfadehouse3
01E3: text_1number_styled 'WASHBUY' number $HOUSECOST time 5000 style 6  // 1102 Washington Street purchased: $~1~

:HOUSBUY_postfadehouse3
if
   $HOUSETOBUY == 3	// Ocean Heights Apartment
jf @HOUSBUY_postfadehouse4
01E3: text_1number_styled 'OCHEBUY' number $HOUSECOST time 5000 style 6  // Ocean Heights Apartment purchased: $~1~

:HOUSBUY_postfadehouse4
if
   $HOUSETOBUY == 4	// Hyman Condo
jf @HOUSBUY_postfadehouse5
01E3: text_1number_styled 'HYCOBUY' number $HOUSECOST time 5000 style 6  // Hyman Condo purchased: $~1~

:HOUSBUY_postfadehouse5
if
   $HOUSETOBUY == 5	// 
jf @HOUSBUY_postfadehouse6
// null house

:HOUSBUY_postfadehouse6
if
   $HOUSETOBUY == 6	// Links View
jf @HOUSBUY_postfadehouse7
01E3: text_1number_styled 'LNKVBUY' number $HOUSECOST time 5000 style 6  // Links View Apartment purchased: $~1~

:HOUSBUY_postfadehouse7
if
   $HOUSETOBUY == 7	// El Swanko Casa
jf @HOUSBUY_postfadeincontinue
01E3: text_1number_styled 'NBMNBUY' number $HOUSECOST time 5000 style 6  // El Swanko Casa purchased: $~1~

:HOUSBUY_postfadeincontinue
wait 2000 
00BC: text_highpriority 'BUYSAVE' time 3000 1  // ~g~You can now save your game here when not on a mission.
wait 3000 
if
   $HOUSEHASGARAGE == 2
jf @HOUSBUY_checkgarage
Camera.SetPosition($GARAGECAMERAPOSX, $GARAGECAMERAPOSY, $GARAGECAMERAPOSZ, 0.0, 0.0, 0.0)
Camera.PointAt($GARAGECAMERATARGETX, $GARAGECAMERATARGETY, $GARAGECAMERATARGETZ, 2)
00BC: text_highpriority 'BUYGARS' time 3000 1  // ~g~You can also store vehicles in these garages.
wait 3000 

:HOUSBUY_checkgarage
if
   $HOUSEHASGARAGE == 1
jf @HOUSBUY_beginendfade
Camera.SetPosition($GARAGECAMERAPOSX, $GARAGECAMERAPOSY, $GARAGECAMERAPOSZ, 0.0, 0.0, 0.0)
Camera.PointAt($GARAGECAMERATARGETX, $GARAGECAMERATARGETY, $GARAGECAMERATARGETZ, 2)
00BC: text_highpriority 'BUYGARG' time 3000 1  // ~g~You can also store vehicles in this garage.
wait 3000 

:HOUSBUY_beginendfade
0169: set_fade_color 0 0 1 
fade 0 500 

:HOUSBUY_endfade
if 
fading 
jf @HOUSBUY_postendfade 
wait 0 
jump @HOUSBUY_endfade

:HOUSBUY_postendfade
Camera.SetBehindPlayer
Camera.Restore_WithJumpCut
Player.CanMove($PLAYER_CHAR, True)
03BF: set_player $PLAYER_CHAR ignored_by_everyone_to 0 
03F4: set_all_vehicles_apply_damage_rules 1 
02A3: enable_widescreen 0 
0169: set_fade_color 0 0 1 
fade 1 500 
HELP_2932()
043C: set_game_sounds_disable_on_fade 1 
$ONMISSION = 0
mission_cleanup 
terminate_this_script 
return 