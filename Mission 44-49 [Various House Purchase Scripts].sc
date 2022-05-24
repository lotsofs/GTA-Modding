//-------------Mission 44---------------
// Originally: El Swanko Casa Buy

:BUYPRO5
script_name 'BUYPRO5' 
$ONMISSION = 1 // $ = int 
wait 0 
Marker.Disable($660)
030C: progress_made += 1 
0169: set_fade_color 0 0 1 
fade 0 500 
Player.CanMove($PLAYER_CHAR, False)
03BF: set_player $PLAYER_CHAR ignored_by_everyone_to 1 
03F4: set_all_vehicles_apply_damage_rules 0 

:BUYPRO5_63
if 
fading 
jf @BUYPRO5_136 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @BUYPRO5_129 
0570: $660 = create_asset_radar_marker_with_icon 19 at $573 $574 $575 
018B: set_marker $660 display 2 
start_new_script @SAVE1 
terminate_this_script 

:BUYPRO5_129
jump @BUYPRO5_63 

:BUYPRO5_136
0570: $660 = create_asset_radar_marker_with_icon 19 at $573 $574 $575 
018B: set_marker $660 display 2 
start_new_script @SAVE1 
0395: clear_area 1 at 428.373 608.9806 11.6898 range 1.0 
0055: put_player $PLAYER_CHAR at 428.373 608.9806 11.6898 
0171: set_player $PLAYER_CHAR z_angle_to 0.0 
02A3: enable_widescreen 1 
0169: set_fade_color 0 0 1 
fade 1 500 
Camera.SetPosition(415.9304, 640.0891, 12.9833, 0.0, 0.0, 0.0)
Camera.PointAt(416.2365, 639.1425, 13.0847, 2)

:BUYPRO5_291
if 
fading 
jf @BUYPRO5_333 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @BUYPRO5_326 
terminate_this_script 

:BUYPRO5_326
jump @BUYPRO5_291 

:BUYPRO5_333
$1798 = 1 // $ = int 
$1303 = 1 // $ = int 
01E3: text_1number_styled 'NBMNBUY' number $661 time 5000 style 6  // El Swanko Casa purchased: $~1~
0529: add $661 to_money_spent_on_property_stats 
0542: add_property 10 to_property_own_stats 
0394: play_music 1 
043C: set_game_sounds_disable_on_fade 0 
wait 2000 
00BC: text_highpriority 'BUYSAVE' time 3000 1  // ~g~You can now save your game here when not on a mission.
wait 3000 
Camera.SetPosition(427.813, 650.6702, 15.3209, 0.0, 0.0, 0.0)
Camera.PointAt(428.6758, 650.2003, 15.1346, 2)
00BC: text_highpriority 'BUYGARG' time 3000 1  // ~g~You can also store vehicles in this garage.
02FA: garage $663 change_to_type 16 
wait 3000 
0169: set_fade_color 0 0 1 
fade 0 500 

:BUYPRO5_500
if 
fading 
jf @BUYPRO5_546 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @BUYPRO5_539 
043C: set_game_sounds_disable_on_fade 1 
terminate_this_script 

:BUYPRO5_539
jump @BUYPRO5_500 

:BUYPRO5_546
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
$ONMISSION = 0 // $ = int 
mission_cleanup 
terminate_this_script 
return 

//-------------Mission 45---------------
// Originally: Links View Apartment Buy

:LNKVBUY
script_name 'LNKVBUY' 
$ONMISSION = 1 // $ = int 
wait 0 
Marker.Disable($652)
030C: progress_made += 1 
0169: set_fade_color 0 0 1 
fade 0 500 
Player.CanMove($PLAYER_CHAR, False)
03BF: set_player $PLAYER_CHAR ignored_by_everyone_to 1 
03F4: set_all_vehicles_apply_damage_rules 0 

:LNKVBUY_63
if 
fading 
jf @LNKVBUY_136 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @LNKVBUY_129 
0570: $652 = create_asset_radar_marker_with_icon 19 at $585 $586 $587 
018B: set_marker $652 display 2 
start_new_script @SAVE2 
terminate_this_script 

:LNKVBUY_129
jump @LNKVBUY_63 

:LNKVBUY_136
0570: $652 = create_asset_radar_marker_with_icon 19 at $585 $586 $587 
018B: set_marker $652 display 2 
start_new_script @SAVE2 
0395: clear_area 1 at 306.5728 376.2928 12.1856 range 1.0 
0055: put_player $PLAYER_CHAR at 306.5728 376.2928 12.1856 
0171: set_player $PLAYER_CHAR z_angle_to 276.3156 
02A3: enable_widescreen 1 
0169: set_fade_color 0 0 1 
fade 1 500 
Camera.SetPosition(241.4097, 420.0691, 10.388, 0.0, 0.0, 0.0)
Camera.PointAt(242.141, 419.4232, 10.6071, 2)

:LNKVBUY_291
if 
fading 
jf @LNKVBUY_333 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @LNKVBUY_326 
terminate_this_script 

:LNKVBUY_326
jump @LNKVBUY_291 

:LNKVBUY_333
$1799 = 1 // $ = int 
$1304 = 1 // $ = int 
01E3: text_1number_styled 'LNKVBUY' number $653 time 5000 style 6  // Links View Apartment purchased: $~1~
0529: add $653 to_money_spent_on_property_stats 
0542: add_property 9 to_property_own_stats 
0394: play_music 1 
043C: set_game_sounds_disable_on_fade 0 
wait 2000 
00BC: text_highpriority 'BUYSAVE' time 3000 1  // ~g~You can now save your game here when not on a mission.
wait 3000 
Camera.SetPosition(313.6496, 390.976, 14.5314, 0.0, 0.0, 0.0)
Camera.PointAt(313.0024, 391.738, 14.5534, 2)
00BC: text_highpriority 'BUYGARG' time 3000 1  // ~g~You can also store vehicles in this garage.
02FA: garage $655 change_to_type 26 
wait 3000 
0169: set_fade_color 0 0 1 
fade 0 500 

:LNKVBUY_500
if 
fading 
jf @LNKVBUY_546 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @LNKVBUY_539 
043C: set_game_sounds_disable_on_fade 1 
terminate_this_script 

:LNKVBUY_539
jump @LNKVBUY_500 

:LNKVBUY_546
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
$ONMISSION = 0 // $ = int 
mission_cleanup 
terminate_this_script 
return 

//-------------Mission 46---------------
// Originally: Hyman Condo Buy

:HYCOBUY
script_name 'HYCOBUY' 
$ONMISSION = 1 // $ = int 
wait 0 
Marker.Disable($664)
030C: progress_made += 1 
0169: set_fade_color 0 0 1 
fade 0 500 
Player.CanMove($PLAYER_CHAR, False)
03BF: set_player $PLAYER_CHAR ignored_by_everyone_to 1 
03F4: set_all_vehicles_apply_damage_rules 0 

:HYCOBUY_63
if 
fading 
jf @HYCOBUY_136 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @HYCOBUY_129 
0570: $664 = create_asset_radar_marker_with_icon 19 at $588 $589 $590 
018B: set_marker $664 display 2 
start_new_script @SAVE3 
terminate_this_script 

:HYCOBUY_129
jump @HYCOBUY_63 

:HYCOBUY_136
0570: $664 = create_asset_radar_marker_with_icon 19 at $588 $589 $590 
018B: set_marker $664 display 2 
start_new_script @SAVE3 
0395: clear_area 1 at -833.811 1304.07 10.5131 range 1.0 
0055: put_player $PLAYER_CHAR at -833.811 1304.07 10.5131 
0171: set_player $PLAYER_CHAR z_angle_to 200.4458 
02A3: enable_widescreen 1 
0169: set_fade_color 0 0 1 
fade 1 500 
Camera.SetPosition(-905.0276, 1352.564, 50.7682, 0.0, 0.0, 0.0)
Camera.PointAt(-904.088, 1352.261, 50.9287, 2)

:HYCOBUY_291
if 
fading 
jf @HYCOBUY_333 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @HYCOBUY_326 
terminate_this_script 

:HYCOBUY_326
jump @HYCOBUY_291 

:HYCOBUY_333
$1795 = 1 // $ = int 
055B: $1298 = create_clothes_pickup 1 at -820.2 1364.1 66.4 
$1300 = 1 // $ = int 
01E3: text_1number_styled 'HYCOBUY' number $665 time 5000 style 6  // Hyman Condo purchased: $~1~
0529: add $665 to_money_spent_on_property_stats 
0542: add_property 14 to_property_own_stats 
0394: play_music 1 
043C: set_game_sounds_disable_on_fade 0 
wait 2000 
00BC: text_highpriority 'BUYSAVE' time 3000 1  // ~g~You can now save your game here when not on a mission.
wait 3000 
Camera.SetPosition(-848.3207, 1292.835, 11.4866, 0.0, 0.0, 0.0)
Camera.PointAt(-847.6996, 1293.611, 11.5998, 2)
00BC: text_highpriority 'BUYGARS' time 3000 1  // ~g~You can also store vehicles in these garages.
02FA: garage $667 change_to_type 17 
02FA: garage $668 change_to_type 18 
02FA: garage $669 change_to_type 24 
wait 3000 
0169: set_fade_color 0 0 1 
fade 0 500 

:HYCOBUY_536
if 
fading 
jf @HYCOBUY_582 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @HYCOBUY_575 
043C: set_game_sounds_disable_on_fade 1 
terminate_this_script 

:HYCOBUY_575
jump @HYCOBUY_536 

:HYCOBUY_582
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
$ONMISSION = 0 // $ = int 
mission_cleanup 
terminate_this_script 
return 

//-------------Mission 47---------------
// Originally: Ocean Heighs Aprt. Buy

:OCHEBUY
script_name 'OCHEBUY' 
$ONMISSION = 1 // $ = int 
wait 0 
Marker.Disable($656)
030C: progress_made += 1 
0169: set_fade_color 0 0 1 
fade 0 500 
Player.CanMove($PLAYER_CHAR, False)
03BF: set_player $PLAYER_CHAR ignored_by_everyone_to 1 
03F4: set_all_vehicles_apply_damage_rules 0 

:OCHEBUY_63
if 
fading 
jf @OCHEBUY_136 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @OCHEBUY_129 
0570: $656 = create_asset_radar_marker_with_icon 19 at $591 $592 $593 
018B: set_marker $656 display 2 
start_new_script @SAVE5 
terminate_this_script 

:OCHEBUY_129
jump @OCHEBUY_63 

:OCHEBUY_136
0570: $656 = create_asset_radar_marker_with_icon 19 at $591 $592 $593 
018B: set_marker $656 display 2 
start_new_script @SAVE5 
0395: clear_area 1 at 14.4571 -1498.594 12.1974 range 1.0 
0055: put_player $PLAYER_CHAR at 14.4571 -1498.594 12.1974 
0171: set_player $PLAYER_CHAR z_angle_to 353.8286 
02A3: enable_widescreen 1 
0169: set_fade_color 0 0 1 
fade 1 500 
Camera.SetPosition(-9.9202, -1467.05, 10.114, 0.0, 0.0, 0.0)
Camera.PointAt(-9.376, -1467.813, 10.4639, 2)

:OCHEBUY_291
if 
fading 
jf @OCHEBUY_333 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @OCHEBUY_326 
terminate_this_script 

:OCHEBUY_326
jump @OCHEBUY_291 

:OCHEBUY_333
$1800 = 1 // $ = int 
$1305 = 1 // $ = int 
01E3: text_1number_styled 'OCHEBUY' number $657 time 5000 style 6  // Ocean Heights Apartment purchased: $~1~
0529: add $657 to_money_spent_on_property_stats 
0542: add_property 12 to_property_own_stats 
0394: play_music 1 
043C: set_game_sounds_disable_on_fade 0 
wait 2000 
00BC: text_highpriority 'BUYSAVE' time 3000 1  // ~g~You can now save your game here when not on a mission.
wait 3000 
Camera.SetPosition(17.7346, -1467.674, 18.6329, 0.0, 0.0, 0.0)
Camera.PointAt(18.0802, -1468.512, 18.2106, 2)
00BC: text_highpriority 'BUYGARG' time 3000 1  // ~g~You can also store vehicles in this garage.
02FA: garage $659 change_to_type 25 
wait 3000 
0169: set_fade_color 0 0 1 
fade 0 500 

:OCHEBUY_500
if 
fading 
jf @OCHEBUY_546 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @OCHEBUY_539 
043C: set_game_sounds_disable_on_fade 1 
terminate_this_script 

:OCHEBUY_539
jump @OCHEBUY_500 

:OCHEBUY_546
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
$ONMISSION = 0 // $ = int 
mission_cleanup 
terminate_this_script 
return 

//-------------Mission 48---------------
// Originally: 1102 Washington Street Buy

:WASHBUY
script_name 'WASHBUY' 
$ONMISSION = 1 // $ = int 
wait 0 
Marker.Disable($649)
030C: progress_made += 1 
0169: set_fade_color 0 0 1 
fade 0 500 
Player.CanMove($PLAYER_CHAR, False)
03BF: set_player $PLAYER_CHAR ignored_by_everyone_to 1 
03F4: set_all_vehicles_apply_damage_rules 0 

:WASHBUY_63
if 
fading 
jf @WASHBUY_136 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @WASHBUY_129 
0570: $649 = create_asset_radar_marker_with_icon 19 at $594 $595 $596 
018B: set_marker $649 display 2 
start_new_script @SAVE4 
terminate_this_script 

:WASHBUY_129
jump @WASHBUY_63 

:WASHBUY_136
0570: $649 = create_asset_radar_marker_with_icon 19 at $594 $595 $596 
018B: set_marker $649 display 2 
start_new_script @SAVE4 
0395: clear_area 1 at 90.781 -806.1213 10.3349 range 1.0 
0055: put_player $PLAYER_CHAR at 90.781 -806.1213 10.3349 
0171: set_player $PLAYER_CHAR z_angle_to 238.8605 
02A3: enable_widescreen 1 
0169: set_fade_color 0 0 1 
fade 1 500 
Camera.SetPosition(57.5999, -681.8762, 10.4095, 0.0, 0.0, 0.0)
Camera.PointAt(57.8653, -682.802, 10.6787, 2)

:WASHBUY_291
if 
fading 
jf @WASHBUY_333 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @WASHBUY_326 
terminate_this_script 

:WASHBUY_326
jump @WASHBUY_291 

:WASHBUY_333
$1796 = 1 // $ = int 
$1301 = 1 // $ = int 
01E3: text_1number_styled 'WASHBUY' number $650 time 5000 style 6  // 1102 Washington Street purchased: $~1~
0529: add $650 to_money_spent_on_property_stats 
0542: add_property 11 to_property_own_stats 
0394: play_music 1 
043C: set_game_sounds_disable_on_fade 0 
wait 2000 
00BC: text_highpriority 'BUYSAVE' time 3000 1  // ~g~You can now save your game here when not on a mission.
wait 3000 
0169: set_fade_color 0 0 1 
fade 0 500 

:WASHBUY_422
if 
fading 
jf @WASHBUY_468 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @WASHBUY_461 
043C: set_game_sounds_disable_on_fade 1 
terminate_this_script 

:WASHBUY_461
jump @WASHBUY_422 

:WASHBUY_468
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
$ONMISSION = 0 // $ = int 
mission_cleanup 
terminate_this_script 
return 

//-------------Mission 49---------------
// Originally: Vice Point Buy

:VCPTBUY
script_name 'VCPTBUY' 
$ONMISSION = 1 // $ = int 
wait 0 
Marker.Disable($646)
030C: progress_made += 1 
0169: set_fade_color 0 0 1 
fade 0 500 
Player.CanMove($PLAYER_CHAR, False)
03BF: set_player $PLAYER_CHAR ignored_by_everyone_to 1 
03F4: set_all_vehicles_apply_damage_rules 0 

:VCPTBUY_63
if 
fading 
jf @VCPTBUY_136 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @VCPTBUY_129 
0570: $646 = create_asset_radar_marker_with_icon 19 at $597 $598 $599 
018B: set_marker $646 display 2 
start_new_script @SAVE6 
terminate_this_script 

:VCPTBUY_129
jump @VCPTBUY_63 

:VCPTBUY_136
0570: $646 = create_asset_radar_marker_with_icon 19 at $597 $598 $599 
018B: set_marker $646 display 2 
start_new_script @SAVE6 
0395: clear_area 1 at 529.6626 1272.155 16.822 range 1.0 
0055: put_player $PLAYER_CHAR at 529.6626 1272.155 16.822 
0171: set_player $PLAYER_CHAR z_angle_to 131.5277 
02A3: enable_widescreen 1 
0169: set_fade_color 0 0 1 
fade 1 500 
Camera.SetPosition(468.3571, 1259.458, 21.8848, 0.0, 0.0, 0.0)
Camera.PointAt(469.2978, 1259.797, 21.8834, 2)

:VCPTBUY_291
if 
fading 
jf @VCPTBUY_333 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @VCPTBUY_326 
terminate_this_script 

:VCPTBUY_326
jump @VCPTBUY_291 

:VCPTBUY_333
$1797 = 1 // $ = int 
$1302 = 1 // $ = int 
01E3: text_1number_styled 'VCPTBUY' number $647 time 5000 style 6  // 3321 Vice Point purchased: $~1~
0529: add $647 to_money_spent_on_property_stats 
0542: add_property 8 to_property_own_stats 
0394: play_music 1 
043C: set_game_sounds_disable_on_fade 0 
wait 2000 
00BC: text_highpriority 'BUYSAVE' time 3000 1  // ~g~You can now save your game here when not on a mission.
wait 3000 
0169: set_fade_color 0 0 1 
fade 0 500 

:VCPTBUY_422
if 
fading 
jf @VCPTBUY_468 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @VCPTBUY_461 
043C: set_game_sounds_disable_on_fade 1 
terminate_this_script 

:VCPTBUY_461
jump @VCPTBUY_422 

:VCPTBUY_468
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
$ONMISSION = 0 // $ = int 
mission_cleanup 
terminate_this_script 
return 