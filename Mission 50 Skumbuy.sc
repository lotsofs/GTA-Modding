:SKUMBUY
script_name 'SKUMBUY' 
$ONMISSION = 1 // $ = int 
wait 0 
Marker.Disable($643)
030C: progress_made += 1 
0169: set_fade_color 0 0 1 
fade 0 500 
Player.CanMove($PLAYER_CHAR, False)
03BF: set_player $PLAYER_CHAR ignored_by_everyone_to 1 
03F4: set_all_vehicles_apply_damage_rules 0 

:SKUMBUY_63
if 
fading 
jf @SKUMBUY_136 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @SKUMBUY_129 
0570: $643 = create_asset_radar_marker_with_icon 19 at $600 $601 $602 
018B: set_marker $643 display 2 
start_new_script @SAVE7 
terminate_this_script 

:SKUMBUY_129
jump @SKUMBUY_63 

:SKUMBUY_136
0570: $643 = create_asset_radar_marker_with_icon 19 at $600 $601 $602 
018B: set_marker $643 display 2 
start_new_script @SAVE7 
0395: clear_area 1 at -559.9 705.4 19.8 range 1.0 
0055: put_player $PLAYER_CHAR at -559.9 705.4 19.8 
0171: set_player $PLAYER_CHAR z_angle_to 243.0 
02A3: enable_widescreen 1 
0169: set_fade_color 0 0 1 
fade 1 500 
Camera.SetPosition(-570.4593, 708.1309, 24.3593, 0.0, 0.0, 0.0)
Camera.PointAt(-569.6928, 707.5626, 24.0599, 2)

:SKUMBUY_291
if 
fading 
jf @SKUMBUY_333 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @SKUMBUY_326 
terminate_this_script 

:SKUMBUY_326
jump @SKUMBUY_291 

:SKUMBUY_333
$1794 = 1 // $ = int 
$1299 = 1 // $ = int 
01E3: text_1number_styled 'SKUMBUY' number $644 time 5000 style 6  // Skumole Shack purchased: $~1~
0529: add $644 to_money_spent_on_property_stats 
0542: add_property 13 to_property_own_stats 
0394: play_music 1 
043C: set_game_sounds_disable_on_fade 0 
wait 2000 
00BC: text_highpriority 'BUYSAVE' time 3000 1  // ~g~You can now save your game here when not on a mission.
wait 3000 
0169: set_fade_color 0 0 1 
fade 0 500 

:SKUMBUY_422
if 
fading 
jf @SKUMBUY_468 
wait 0 
if 
   not Player.Defined($PLAYER_CHAR)
jf @SKUMBUY_461 
043C: set_game_sounds_disable_on_fade 1 
terminate_this_script 

:SKUMBUY_461
jump @SKUMBUY_422 

:SKUMBUY_468
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