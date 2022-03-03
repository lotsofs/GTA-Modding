:HOUSBUY
script_name 'HOUSBUY' 
$ONMISSION = 1
wait 0 
030C: progress_made += 1 
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
0084: $HOUSECOST = $644
Marker.Disable($643)
0570: $643 = create_asset_radar_marker_with_icon 19 at $600 $601 $602 
018B: set_marker $643 display 2 
start_new_script @SAVE7 
jump @HOUSBUY_fadeout

:HOUSBUY_ishouse1
if
   $HOUSETOBUY == 1	// Vice Point
jf @HOUSEBUY_nohouse
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
0084: $HOUSECOST = $647
Marker.Disable($643)
0570: $646 = create_asset_radar_marker_with_icon 19 at $597 $598 $599 
018B: set_marker $646 display 2 
start_new_script @SAVE7 
jump @HOUSBUY_fadeout

:HOUSEBUY_nohouse
terminate_this_script

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
0542: add_property 13 to_property_own_stats 
01E3: text_1number_styled 'SKUMBUY' number $HOUSECOST time 5000 style 6  // Skumole Shack purchased: $~1~
0529: add $HOUSECOST to_money_spent_on_property_stats 

:HOUSBUY_postfadehouse1
if
   $HOUSETOBUY == 1	// Vice Point
jf @HOUSBUY_postfadeincontinue
0542: add_property 8 to_property_own_stats 
01E3: text_1number_styled 'VCPTBUY' number $HOUSECOST time 5000 style 6  // 3321 Vice Point purchased: $~1~

:HOUSBUY_postfadeincontinue
wait 2000 
00BC: text_highpriority 'BUYSAVE' time 3000 1  // ~g~You can now save your game here when not on a mission.
wait 3000 
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