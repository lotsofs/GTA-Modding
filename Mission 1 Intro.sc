:INTRO
script_name 'INTRO' 
$ONMISSION = 1  
$13 = 0  
wait 0 
fade 0 0 
03BF: set_player $PLAYER_CHAR ignored_by_everyone_to 1 
Player.CanMove($PLAYER_CHAR, False)
03AF: set_streaming 0 
03AD: set_rubbish 0 
054C: use_GXT_table 'INTRO' 
Player.MakeSafe($PLAYER_CHAR)
044D: load_splash 'INTRO1' 
0169: set_fade_color 2 2 2 
wait 250 
023C: load_special_actor 1 'SFRENDA' 
023C: load_special_actor 2 'SFRENDB' 
023C: load_special_actor 3 'CSSONNY' 
023C: load_special_actor 4 'SGOONA' 
023C: load_special_actor 5 'SGOONB' 
02F3: load_object #CUTOBJ01 'SVNTRAY' 
02F3: load_object #CUTOBJ02 'DRINK' 
02F3: load_object #CUTOBJ03 'MBTBEMP' 
02F3: load_object #CUTOBJ04 'SCHAIR' 
03AF: set_streaming 0 
03AD: set_rubbish 0 
select_interior 1 
0363: toggle_model_render_at 231.4 -1277.7 19.0 radius 50.0 object #MOB_MOBROOM2 1 
0363: toggle_model_render_at 231.4 -1277.7 19.0 radius 50.0 object #MOB_DETAILSB 1 
Camera.SetAtPos(231.4, -1277.7, 19.0)
04F9: set_extra_colors 16 fade 0 
038B: load_requested_models 

:INTRO_295
if or
823D:   not special_actor 1 loaded 
823D:   not special_actor 2 loaded 
823D:   not special_actor 3 loaded 
823D:   not special_actor 4 loaded 
823D:   not special_actor 5 loaded 
jf @INTRO_369 
wait 0 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_362 
jump @INTRO_4_start 

:INTRO_362
jump @INTRO_295 

:INTRO_369
if or
   not Model.Available(#CUTOBJ01)
   not Model.Available(#CUTOBJ02)
   not Model.Available(#CUTOBJ03)
   not Model.Available(#CUTOBJ04)
jf @INTRO_443 
wait 0 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_436 
jump @INTRO_4_start 

:INTRO_436
jump @INTRO_369 

:INTRO_443
02E4: load_cutscene_data 'INT_A' 
0244: set_cutscene_pos 231.411 -1277.707 19.069 
041D: set_camera_near_clip 0.1 
02E5: $127 = create_cutscene_object #SPECIAL01 
02E6: set_cutscene_anim $127 'SFRENDA' 
02E5: $128 = create_cutscene_object #SPECIAL02 
02E6: set_cutscene_anim $128 'SFRENDB' 
02E5: $138 = create_cutscene_object #SPECIAL03 
02E6: set_cutscene_anim $138 'CSSONNY' 
02E5: $129 = create_cutscene_object #SPECIAL04 
02E6: set_cutscene_anim $129 'SGOONA' 
02E5: $130 = create_cutscene_object #SPECIAL05 
02E6: set_cutscene_anim $130 'SGOONB' 
02E5: $151 = create_cutscene_object #CUTOBJ01 
02E6: set_cutscene_anim $151 'SVNTRAY' 
02E5: $152 = create_cutscene_object #CUTOBJ02 
02E6: set_cutscene_anim $152 'DRINK01' 
02E5: $153 = create_cutscene_object #CUTOBJ02 
02E6: set_cutscene_anim $153 'DRINK02' 
02E5: $154 = create_cutscene_object #CUTOBJ02 
02E6: set_cutscene_anim $154 'DRINK03' 
02E5: $126 = create_cutscene_object #CUTOBJ03 
02E6: set_cutscene_anim $126 'MBTBEMP' 
02E5: $216 = create_cutscene_object #CUTOBJ04 
02E6: set_cutscene_anim $216 'SCHAIR' 
fade 1 2000 
03AD: set_rubbish 0 
03AF: set_streaming 1 
02E7: start_cutscene 
02E8: $CUT_SCENE_TIME = cutscenetime 

:INTRO_725
if 
  1246 > $CUT_SCENE_TIME  
jf @INTRO_792 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_785 
jump @INTRO_4_start 

:INTRO_785
jump @INTRO_725 

:INTRO_792
00BC: text_highpriority 'INT1_A' time 10000 1  // Tommy Vercetti...Huh! shit.

:INTRO_807
if 
  2708 > $CUT_SCENE_TIME  
jf @INTRO_874 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_867 
jump @INTRO_4_start 

:INTRO_867
jump @INTRO_807 

:INTRO_874
00BC: text_highpriority 'INT1_B' time 10000 1  // Didn't think they'd ever let him out.

:INTRO_889
if 
  4796 > $CUT_SCENE_TIME  
jf @INTRO_956 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_949 
jump @INTRO_4_start 

:INTRO_949
jump @INTRO_889 

:INTRO_956
00BC: text_highpriority 'INT1_C' time 10000 1  // He kept his head down, helps people forget.

:INTRO_971
if 
  7086 > $CUT_SCENE_TIME  
jf @INTRO_1038 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_1031 
jump @INTRO_4_start 

:INTRO_1031
jump @INTRO_971 

:INTRO_1038
00BC: text_highpriority 'INT1_D' time 10000 1  // People will remember soon enough.

:INTRO_1053
if 
  8404 > $CUT_SCENE_TIME  
jf @INTRO_1120 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_1113 
jump @INTRO_4_start 

:INTRO_1113
jump @INTRO_1053 

:INTRO_1120
00BC: text_highpriority 'INT1_E' time 10000 1  // When they see him walking down the streets of their neighborhoods.

:INTRO_1135
if 
  10756 > $CUT_SCENE_TIME  
jf @INTRO_1202 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_1195 
jump @INTRO_4_start 

:INTRO_1195
jump @INTRO_1135 

:INTRO_1202
00BC: text_highpriority 'INT1_F' time 10000 1  // It will be bad for business.

:INTRO_1217
if 
  12614 > $CUT_SCENE_TIME  
jf @INTRO_1284 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_1277 
jump @INTRO_4_start 

:INTRO_1277
jump @INTRO_1217 

:INTRO_1284
00BC: text_highpriority 'INT1_G' time 10000 1  // Well, what are we gonna do, Sonny?

:INTRO_1299
if 
  14813 > $CUT_SCENE_TIME  
jf @INTRO_1366 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_1359 
jump @INTRO_4_start 

:INTRO_1359
jump @INTRO_1299 

:INTRO_1366
00BC: text_highpriority 'INT1_H' time 10000 1  // We treat him like an old friend and keep him busy out of town. OK?

:INTRO_1381
if 
  18741 > $CUT_SCENE_TIME  
jf @INTRO_1448 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_1441 
jump @INTRO_4_start 

:INTRO_1441
jump @INTRO_1381 

:INTRO_1448
00BC: text_highpriority 'INT1_I' time 10000 1  // We been talking about expanding down South, right?

:INTRO_1463
if 
  21294 > $CUT_SCENE_TIME  
jf @INTRO_1530 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_1523 
jump @INTRO_4_start 

:INTRO_1523
jump @INTRO_1463 

:INTRO_1530
00BC: text_highpriority 'INT1_J' time 10000 1  // Vice City is twenty-four carat gold these days.

:INTRO_1545
if 
  24399 > $CUT_SCENE_TIME  
jf @INTRO_1612 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_1605 
jump @INTRO_4_start 

:INTRO_1605
jump @INTRO_1545 

:INTRO_1612
00BC: text_highpriority 'INT1_K' time 10000 1  // The Colombians, the Mexicans, hell,

:INTRO_1627
if 
  26496 > $CUT_SCENE_TIME  
jf @INTRO_1694 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_1687 
jump @INTRO_4_start 

:INTRO_1687
jump @INTRO_1627 

:INTRO_1694
00BC: text_highpriority 'INT1_L' time 10000 1  // even those Cuban refugees are cutting themselves a piece of some nice action.

:INTRO_1709
if 
  31264 > $CUT_SCENE_TIME  
jf @INTRO_1776 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_1769 
jump @INTRO_4_start 

:INTRO_1769
jump @INTRO_1709 

:INTRO_1776
00BC: text_highpriority 'INT1_M' time 10000 1  // But it's all drugs, Sonny,

:INTRO_1791
if 
  32904 > $CUT_SCENE_TIME  
jf @INTRO_1860 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_1853 
jump @INTRO_4_start 

:INTRO_1853
jump @INTRO_1791 

:INTRO_1860
00BC: text_highpriority 'INT1_N' time 10000 1  // None of the families will touch that shit!

:INTRO_1875
if 
  35200 > $CUT_SCENE_TIME  
jf @INTRO_1944 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_1937 
jump @INTRO_4_start 

:INTRO_1937
jump @INTRO_1875 

:INTRO_1944
00BC: text_highpriority 'INT1_O' time 10000 1  // Times are changing.

:INTRO_1959
if 
  36522 > $CUT_SCENE_TIME  
jf @INTRO_2028 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_2021 
jump @INTRO_4_start 

:INTRO_2021
jump @INTRO_1959 

:INTRO_2028
00BC: text_highpriority 'INT1_P' time 10000 1  // The families can't keep their backs turned while our enemies reap the rewards.

:INTRO_2043
if 
  41196 > $CUT_SCENE_TIME  
jf @INTRO_2112 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_2105 
jump @INTRO_4_start 

:INTRO_2105
jump @INTRO_2043 

:INTRO_2112
00BC: text_highpriority 'INT1_Q' time 10000 1  // So, we send someone down to do the dirty work for us...

:INTRO_2127
if 
  45232 > $CUT_SCENE_TIME  
jf @INTRO_2196 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_2189 
jump @INTRO_4_start 

:INTRO_2189
jump @INTRO_2127 

:INTRO_2196
00BC: text_highpriority 'INT1_R' time 10000 1  // and cut ourselves a nice quiet slice. OK?

:INTRO_2211
if 
  48992 > $CUT_SCENE_TIME  
jf @INTRO_2280 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_2273 
jump @INTRO_4_start 

:INTRO_2273
jump @INTRO_2211 

:INTRO_2280
00BC: text_highpriority 'INT1_S' time 10000 1  // Who's our contact down there?

:INTRO_2295
if 
  50206 > $CUT_SCENE_TIME  
jf @INTRO_2364 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_2357 
jump @INTRO_4_start 

:INTRO_2357
jump @INTRO_2295 

:INTRO_2364
00BC: text_highpriority 'INT1_T' time 10000 1  // Ken Rosenberg, schmuck of a lawyer.

:INTRO_2379
if 
  52509 > $CUT_SCENE_TIME  
jf @INTRO_2448 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_2441 
jump @INTRO_4_start 

:INTRO_2441
jump @INTRO_2379 

:INTRO_2448
00BC: text_highpriority 'INT1_U' time 10000 1  // How's he gonna hold Vercetti's leash?

:INTRO_2463
if 
  54340 > $CUT_SCENE_TIME  
jf @INTRO_2532 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_2525 
jump @INTRO_4_start 

:INTRO_2525
jump @INTRO_2463 

:INTRO_2532
00BC: text_highpriority 'INT1_V' time 10000 1  // We don't need him to.

:INTRO_2547
if 
  56291 > $CUT_SCENE_TIME  
jf @INTRO_2616 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_2609 
jump @INTRO_4_start 

:INTRO_2609
jump @INTRO_2547 

:INTRO_2616
00BC: text_highpriority 'INT1_W' time 10000 1  // We just set him loose in Vice City,

:INTRO_2631
if 
  57900 > $CUT_SCENE_TIME  
jf @INTRO_2700 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_2693 
jump @INTRO_4_start 

:INTRO_2693
jump @INTRO_2631 

:INTRO_2700
00BC: text_highpriority 'INT1_X' time 10000 1  // we give him a little cash to get started. OK?

:INTRO_2715
if 
  61168 > $CUT_SCENE_TIME  
jf @INTRO_2784 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_2777 
jump @INTRO_4_start 

:INTRO_2777
jump @INTRO_2715 

:INTRO_2784
00BC: text_highpriority 'INT1_Y' time 10000 1  // Give it a few months.

:INTRO_2799
if 
  62518 > $CUT_SCENE_TIME  
jf @INTRO_2868 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_2861 
jump @INTRO_4_start 

:INTRO_2861
jump @INTRO_2799 

:INTRO_2868
00BC: text_highpriority 'INT1_Z' time 10000 1  // Then we go down,

:INTRO_2883
if 
  64169 > $CUT_SCENE_TIME  
jf @INTRO_2952 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_2945 
jump @INTRO_4_start 

:INTRO_2945
jump @INTRO_2883 

:INTRO_2952
00BC: text_highpriority 'INT1_A1' time 10000 1  // pay him a little visit, right?

:INTRO_2967
if 
  65706 > $CUT_SCENE_TIME  
jf @INTRO_3036 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_3029 
jump @INTRO_4_start 

:INTRO_3029
jump @INTRO_2967 

:INTRO_3036
00BC: text_highpriority 'INT1_A2' time 10000 1  // see how he's doing.

:INTRO_3051
if 
  66784 > $CUT_SCENE_TIME  
jf @INTRO_3120 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_3113 
jump @INTRO_4_start 

:INTRO_3113
jump @INTRO_3051 

:INTRO_3120
00BE: text_clear_all 

:INTRO_3122
if 
  68240 > $CUT_SCENE_TIME  
jf @INTRO_3191 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_3184 
jump @INTRO_4_start 

:INTRO_3184
jump @INTRO_3122 

:INTRO_3191
00BE: text_clear_all 
0169: set_fade_color 1 1 1 
fade 0 2000 

:INTRO_3208
if 
fading 
jf @INTRO_3264 
wait 0 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_3257 
jump @INTRO_4_start 

:INTRO_3257
jump @INTRO_3208 

:INTRO_3264
02EA: end_cutscene 
04FA: clear_extra_colors_with_fade 0 
03AD: set_rubbish 1 
0296: unload_special_actor 1 
0296: unload_special_actor 2 
0296: unload_special_actor 3 
0296: unload_special_actor 4 
0296: unload_special_actor 5 
Model.Destroy(#CUTOBJ01)
Model.Destroy(#CUTOBJ02)
Model.Destroy(#CUTOBJ03)
Model.Destroy(#CUTOBJ04)
0363: toggle_model_render_at 231.4 -1277.7 19.0 radius 50.0 object #MOB_MOBROOM2 0 
0363: toggle_model_render_at 231.4 -1277.7 19.0 radius 50.0 object #MOB_DETAILSB 0 
select_interior 0 
wait 0 
0522: disable_cutscene_shadows 
044D: load_splash 'INTRO2' 
0169: set_fade_color 2 2 2 
wait 250 
set_weather 4 
00C0: set_current_time 12 0 
023C: load_special_actor 1 'CSKEN' 
023C: load_special_actor 2 'CSPLAY' 
023C: load_special_actor 3 'SGOONA' 
023C: load_special_actor 4 'SGOONB' 
02F3: load_object #CUTOBJ01 'AIRPLAN' 
02F3: load_object #CUTOBJ02 'MERCED' 
02F3: load_object #CUTOBJ03 'BRFCASE' 
Model.Load(#AP_RADAR1_01)
Model.Load(#VEG_PALM04)
Camera.SetAtPos(-1592.0, -545.0, 15.0)
04E4: request_collision_at -1654.0 -1388.0 
038B: load_requested_models 

:INTRO_3535
if or
823D:   not special_actor 1 loaded 
823D:   not special_actor 2 loaded 
823D:   not special_actor 3 loaded 
823D:   not special_actor 4 loaded 
   not Model.Available(#CUTOBJ01)
   not Model.Available(#CUTOBJ02)
jf @INTRO_3615 
wait 0 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_3608 
jump @INTRO_4_start 

:INTRO_3608
jump @INTRO_3535 

:INTRO_3615
if or
   not Model.Available(#CUTOBJ03)
   not Model.Available(#AP_RADAR1_01)
   not Model.Available(#VEG_PALM04)
jf @INTRO_3682 
wait 0 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_3675 
jump @INTRO_4_start 

:INTRO_3675
jump @INTRO_3615 

:INTRO_3682
0055: put_player $PLAYER_CHAR at -1654.0 -1388.0 -100.0 
0569: load_uncompressed_animation 'AIRPLAN' 
02E4: load_cutscene_data 'INT_M' 
0244: set_cutscene_pos -1601.536 -548.298 13.679 
02E5: $141 = create_cutscene_object #SPECIAL01 
02E6: set_cutscene_anim $141 'CSKEN' 
02E5: $125 = create_cutscene_object #SPECIAL02 
02E6: set_cutscene_anim $125 'CSPLAY' 
02E5: $129 = create_cutscene_object #SPECIAL03 
02E6: set_cutscene_anim $129 'SGOONA' 
02E5: $130 = create_cutscene_object #SPECIAL04 
02E6: set_cutscene_anim $130 'SGOONB' 
02E5: $208 = create_cutscene_object #CUTOBJ01 
02E6: set_cutscene_anim $208 'AIRPLAN' 
02E5: $207 = create_cutscene_object #CUTOBJ02 
02E6: set_cutscene_anim $207 'MERCED' 
0418: set_object $207 draw_last 1 
02E5: $131 = create_cutscene_object #CUTOBJ03 
02E6: set_cutscene_anim $131 'BRFCASE' 
0525: attach_cutscene_object $141 to_component $207 'MERCBOD' 
0525: attach_cutscene_object $125 to_component $207 'MERCBOD' 
0525: attach_cutscene_object $129 to_component $207 'MERCBOD' 
0525: attach_cutscene_object $130 to_component $207 'MERCBOD' 
fade 1 3000 
03AF: set_streaming 1 
02E7: start_cutscene 
02E8: $CUT_SCENE_TIME = cutscenetime 

:INTRO_3971
if 
  4860 > $CUT_SCENE_TIME  
jf @INTRO_4038 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_4031 
jump @INTRO_4_start 

:INTRO_4031
jump @INTRO_3971 

:INTRO_4038
00BC: text_highpriority 'INT2_A' time 10000 1  // Hey, hey, guys! It's, uh, Ken Rosenberg here! Hey! Heh, heh, hey, great, hey!

:INTRO_4053
if 
  6400 > $CUT_SCENE_TIME  
jf @INTRO_4120 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_4113 
jump @INTRO_4_start 

:INTRO_4113
jump @INTRO_4053 

:INTRO_4120
041D: set_camera_near_clip 0.15 

:INTRO_4127
if 
  9600 > $CUT_SCENE_TIME  
jf @INTRO_4194 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_4187 
jump @INTRO_4_start 

:INTRO_4187
jump @INTRO_4127 

:INTRO_4194
00BC: text_highpriority 'INT2_B' time 10000 1  // Well, uh, I'm gonna drive you guys to the meet, okay?

:INTRO_4209
if 
  12342 > $CUT_SCENE_TIME  
jf @INTRO_4276 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_4269 
jump @INTRO_4_start 

:INTRO_4269
jump @INTRO_4209 

:INTRO_4276
00BC: text_highpriority 'INT2_C' time 10000 1  // Now, I've talked to the suppliers and they are very, huh-ha,

:INTRO_4291
if 
  15840 > $CUT_SCENE_TIME  
jf @INTRO_4358 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_4351 
jump @INTRO_4_start 

:INTRO_4351
jump @INTRO_4291 

:INTRO_4358
00BC: text_highpriority 'INT2_D' time 10000 1  // keen to start a business relationship, so, uh,

:INTRO_4373
if 
  17556 > $CUT_SCENE_TIME  
jf @INTRO_4440 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_4433 
jump @INTRO_4_start 

:INTRO_4433
jump @INTRO_4373 

:INTRO_4440
00BC: text_highpriority 'INT2_E' time 10000 1  // if all goes well, we should, uh,

:INTRO_4455
if 
  20640 > $CUT_SCENE_TIME  
jf @INTRO_4522 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_4515 
jump @INTRO_4_start 

:INTRO_4515
jump @INTRO_4455 

:INTRO_4522
00BC: text_highpriority 'INT2_F' time 10000 1  // be doing very nicely for ourselves, which is, y'know...

:INTRO_4537
if 
  23018 > $CUT_SCENE_TIME  
jf @INTRO_4604 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_4597 
jump @INTRO_4_start 

:INTRO_4597
jump @INTRO_4537 

:INTRO_4604
00BC: text_highpriority 'INT2_G' time 10000 1  // good..

:INTRO_4619
if 
  25863 > $CUT_SCENE_TIME  
jf @INTRO_4686 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_4679 
jump @INTRO_4_start 

:INTRO_4679
jump @INTRO_4619 

:INTRO_4686
00BC: text_highpriority 'INT2_H' time 10000 1  // Okay, so. They're brothers, okay.

:INTRO_4701
if 
  26000 > $CUT_SCENE_TIME  
jf @INTRO_4768 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_4761 
jump @INTRO_4_start 

:INTRO_4761
jump @INTRO_4701 

:INTRO_4768
if 
  27624 > $CUT_SCENE_TIME  
jf @INTRO_4835 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_4828 
jump @INTRO_4_start 

:INTRO_4828
jump @INTRO_4768 

:INTRO_4835
00BC: text_highpriority 'INT2_I' time 10000 1  // One operates the uh, the business,

:INTRO_4850
if 
  29348 > $CUT_SCENE_TIME  
jf @INTRO_4917 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_4910 
jump @INTRO_4_start 

:INTRO_4910
jump @INTRO_4850 

:INTRO_4917
00BC: text_highpriority 'INT2_J' time 10000 1  // and the other one does the flying.

:INTRO_4932
if 
  30300 > $CUT_SCENE_TIME  
jf @INTRO_4999 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_4992 
jump @INTRO_4_start 

:INTRO_4992
jump @INTRO_4932 

:INTRO_4999
00BE: text_clear_all 
0169: set_fade_color 1 1 1 
fade 0 2000 

:INTRO_5016
if 
fading 
jf @INTRO_5100 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
if 
  $CUT_SCENE_TIME >= 33300  
jf @INTRO_5061 
00BE: text_clear_all 

:INTRO_5061
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_5093 
jump @INTRO_4_start 

:INTRO_5093
jump @INTRO_5016 

:INTRO_5100
00BE: text_clear_all 
02EA: end_cutscene 
0296: unload_special_actor 1 
0296: unload_special_actor 2 
0296: unload_special_actor 3 
0296: unload_special_actor 4 
Model.Destroy(#CUTOBJ01)
Model.Destroy(#CUTOBJ02)
Model.Destroy(#CUTOBJ03)
Model.Destroy(#AP_RADAR1_01)
Model.Destroy(#VEG_PALM04)
wait 0 
044D: load_splash 'INTRO3' 
0169: set_fade_color 2 2 2 
wait 250 
set_weather 0 
00C0: set_current_time 20 0 
023C: load_special_actor 1 'CSKEN' 
023C: load_special_actor 2 'CSDEAL' 
023C: load_special_actor 3 'SGOONA' 
023C: load_special_actor 4 'SGOONB' 
023C: load_special_actor 5 'CSASSA' 
023C: load_special_actor 6 'CSASSB' 
023C: load_special_actor 7 'CSASSC' 
023C: load_special_actor 8 'CSPLAY' 
02F3: load_object #CUTOBJ01 'CS_CHOP' 
02F3: load_object #CUTOBJ02 'BRFCASE' 
02F3: load_object #CUTOBJ03 'DELCASE' 
02F3: load_object #CUTOBJ04 'MERCED' 
Model.Load(#DOC_CRANEEGGS04)
Model.Load(#DOC_CRANE_CAB04)
Model.Load(#DOCKFUEL07)
04E4: request_collision_at -692.0 -1559.0 
0055: put_player $PLAYER_CHAR at -683.145 -1581.747 11.53 
Camera.SetAtPos(-692.0, -1559.0, 12.0)
04F9: set_extra_colors 14 fade 0 
038B: load_requested_models 

:INTRO_5397
if or
823D:   not special_actor 1 loaded 
823D:   not special_actor 2 loaded 
823D:   not special_actor 3 loaded 
823D:   not special_actor 4 loaded 
823D:   not special_actor 5 loaded 
823D:   not special_actor 6 loaded 
jf @INTRO_5475 
wait 0 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_5468 
jump @INTRO_4_start 

:INTRO_5468
jump @INTRO_5397 

:INTRO_5475
if or
823D:   not special_actor 7 loaded 
823D:   not special_actor 8 loaded 
   not Model.Available(#CUTOBJ01)
   not Model.Available(#CUTOBJ02)
   not Model.Available(#CUTOBJ03)
   not Model.Available(#CUTOBJ04)
jf @INTRO_5557 
wait 0 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_5550 
jump @INTRO_4_start 

:INTRO_5550
jump @INTRO_5475 

:INTRO_5557
if or
   not Model.Available(#DOC_CRANEEGGS04)
   not Model.Available(#DOC_CRANE_CAB04)
   not Model.Available(#DOCKFUEL07)
jf @INTRO_5623 
wait 0 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_5616 
jump @INTRO_4_start 

:INTRO_5616
jump @INTRO_5557 

:INTRO_5623
0569: load_uncompressed_animation 'CS_CHOP' 
02E4: load_cutscene_data 'INT_D' 
0244: set_cutscene_pos -690.0 -1568.0 11.44 
02E5: $125 = create_cutscene_object #SPECIAL08 
02E6: set_cutscene_anim $125 'CSPLAY' 
02E5: $141 = create_cutscene_object #SPECIAL01 
02E6: set_cutscene_anim $141 'CSKEN' 
02E5: $143 = create_cutscene_object #SPECIAL02 
02E6: set_cutscene_anim $143 'CSDEAL' 
02E5: $129 = create_cutscene_object #SPECIAL03 
02E6: set_cutscene_anim $129 'SGOONA' 
02E5: $130 = create_cutscene_object #SPECIAL04 
02E6: set_cutscene_anim $130 'SGOONB' 
02E5: $145 = create_cutscene_object #SPECIAL05 
02E6: set_cutscene_anim $145 'CSASSA' 
02E5: $146 = create_cutscene_object #SPECIAL06 
02E6: set_cutscene_anim $146 'CSASSB' 
02E5: $147 = create_cutscene_object #SPECIAL07 
02E6: set_cutscene_anim $147 'CSASSC' 
02E5: $148 = create_cutscene_object #CUTOBJ01 
02E6: set_cutscene_anim $148 'CS_CHOP' 
0418: set_object $148 draw_last 1 
02E5: $131 = create_cutscene_object #CUTOBJ02 
02E6: set_cutscene_anim $131 'BRFCASE' 
02E5: $132 = create_cutscene_object #CUTOBJ03 
02E6: set_cutscene_anim $132 'DELCASE' 
02E5: $207 = create_cutscene_object #CUTOBJ04 
02E6: set_cutscene_anim $207 'MERCED' 
0418: set_object $207 draw_last 1 
0525: attach_cutscene_object $141 to_component $207 'MERCBOD' 
fade 1 2000 
03AF: set_streaming 1 
02E7: start_cutscene 
02E8: $CUT_SCENE_TIME = cutscenetime 

:INTRO_5952
if 
  6500 > $CUT_SCENE_TIME  
jf @INTRO_6019 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_6012 
jump @INTRO_4_start 

:INTRO_6012
jump @INTRO_5952 

:INTRO_6019
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_6031
if 
  8743 > $CUT_SCENE_TIME  
jf @INTRO_6110 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_6091 
jump @INTRO_4_start 

:INTRO_6091
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_6031 

:INTRO_6110
00BC: text_highpriority 'INT3_A' time 10000 1  // Ok, that's them in the chopper.
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_6137
if 
  10784 > $CUT_SCENE_TIME  
jf @INTRO_6216 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_6197 
jump @INTRO_4_start 

:INTRO_6197
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_6137 

:INTRO_6216
00BC: text_highpriority 'INT3_B' time 10000 1  // All right, here's the deal.
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_6243
if 
  12040 > $CUT_SCENE_TIME  
jf @INTRO_6322 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_6303 
jump @INTRO_4_start 

:INTRO_6303
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_6243 

:INTRO_6322
00BC: text_highpriority 'INT3_C' time 10000 1  // They want a straight exchange on open ground.
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_6349
if 
  14488 > $CUT_SCENE_TIME  
jf @INTRO_6428 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_6409 
jump @INTRO_4_start 

:INTRO_6409
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_6349 

:INTRO_6428
00BC: text_highpriority 'INT3_D' time 10000 1  // All right? Ok. Stay tight, let's go.
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_6455
if 
  17072 > $CUT_SCENE_TIME  
jf @INTRO_6534 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_6515 
jump @INTRO_4_start 

:INTRO_6515
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_6455 

:INTRO_6534
03D5: remove_text 'INT3_D'  // All right? Ok. Stay tight, let's go.
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_6556
if 
  20384 > $CUT_SCENE_TIME  
jf @INTRO_6635 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_6616 
jump @INTRO_4_start 

:INTRO_6616
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_6556 

:INTRO_6635
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_6647
if 
  23200 > $CUT_SCENE_TIME  
jf @INTRO_6726 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_6707 
jump @INTRO_4_start 

:INTRO_6707
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_6647 

:INTRO_6726
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_6738
if 
  35596 > $CUT_SCENE_TIME  
jf @INTRO_6819 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_6800 
jump @INTRO_4_start 

:INTRO_6800
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_6738 

:INTRO_6819
00BC: text_highpriority 'INT3_G' time 10000 1  // Got it?
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_6846
if 
  36430 > $CUT_SCENE_TIME  
jf @INTRO_6927 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_6908 
jump @INTRO_4_start 

:INTRO_6908
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_6846 

:INTRO_6927
00BC: text_highpriority 'INT3_H' time 10000 1  // 100% pure grade-A Colombian, my friend.
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_6954
if 
  39824 > $CUT_SCENE_TIME  
jf @INTRO_7035 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_7016 
jump @INTRO_4_start 

:INTRO_7016
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_6954 

:INTRO_7035
00BC: text_highpriority 'INT3_M' time 10000 1  // Let me see it.
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_7062
if 
  40896 > $CUT_SCENE_TIME  
jf @INTRO_7143 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_7124 
jump @INTRO_4_start 

:INTRO_7124
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_7062 

:INTRO_7143
00BC: text_highpriority 'INT3_I' time 10000 1  // The greens?
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_7170
if 
  42518 > $CUT_SCENE_TIME  
jf @INTRO_7251 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_7232 
jump @INTRO_4_start 

:INTRO_7232
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_7170 

:INTRO_7251
00BC: text_highpriority 'INT3_J' time 10000 1  // Tens and twenties...used.
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_7278
if 
  46872 > $CUT_SCENE_TIME  
jf @INTRO_7359 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_7340 
jump @INTRO_4_start 

:INTRO_7340
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_7278 

:INTRO_7359
00BC: text_highpriority 'INT3_K' time 10000 1  // I think we have a deal, my friend. HA HA!
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_7386
if 
  51100 > $CUT_SCENE_TIME  
jf @INTRO_7455 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_7448 
jump @INTRO_4_start 

:INTRO_7448
jump @INTRO_7386 

:INTRO_7455
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_7500 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 

:INTRO_7500
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_7512
if 
  51233 > $CUT_SCENE_TIME  
jf @INTRO_7593 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_7574 
jump @INTRO_4_start 

:INTRO_7574
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_7512 

:INTRO_7593
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_7638 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 

:INTRO_7638
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_7650
if 
  51366 > $CUT_SCENE_TIME  
jf @INTRO_7731 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_7712 
jump @INTRO_4_start 

:INTRO_7712
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_7650 

:INTRO_7731
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_7776 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 

:INTRO_7776
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_7788
if 
  51500 > $CUT_SCENE_TIME  
jf @INTRO_7869 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_7850 
jump @INTRO_4_start 

:INTRO_7850
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_7788 

:INTRO_7869
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_7946 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 
058A: create_gun_flash_from -696.522 -1577.432 12.826 to -696.492 -1577.354 12.815 

:INTRO_7946
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_7958
if 
  51633 > $CUT_SCENE_TIME  
jf @INTRO_8039 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_8020 
jump @INTRO_4_start 

:INTRO_8020
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_7958 

:INTRO_8039
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_8084 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 

:INTRO_8084
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_8096
if 
  51733 > $CUT_SCENE_TIME  
jf @INTRO_8177 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_8158 
jump @INTRO_4_start 

:INTRO_8158
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_8096 

:INTRO_8177
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_8222 
058A: create_gun_flash_from -696.442 -1577.358 12.765 to -696.402 -1577.286 12.749 

:INTRO_8222
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_8234
if 
  51766 > $CUT_SCENE_TIME  
jf @INTRO_8315 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_8296 
jump @INTRO_4_start 

:INTRO_8296
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_8234 

:INTRO_8315
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_8360 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 

:INTRO_8360
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_8372
if 
  51900 > $CUT_SCENE_TIME  
jf @INTRO_8453 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_8434 
jump @INTRO_4_start 

:INTRO_8434
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_8372 

:INTRO_8453
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_8498 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 

:INTRO_8498
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_8510
if 
  51966 > $CUT_SCENE_TIME  
jf @INTRO_8591 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_8572 
jump @INTRO_4_start 

:INTRO_8572
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_8510 

:INTRO_8591
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_8636 
058A: create_gun_flash_from -696.448 -1577.274 12.666 to -696.405 -1577.206 12.643 

:INTRO_8636
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_8648
if 
  52033 > $CUT_SCENE_TIME  
jf @INTRO_8729 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_8710 
jump @INTRO_4_start 

:INTRO_8710
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_8648 

:INTRO_8729
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_8806 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 
058A: create_gun_flash_from -696.354 -1578.122 13.06 to -695.836 -1577.301 13.02 

:INTRO_8806
0598: stir_ground_around_object $148 radius 10.0 density 4 

:INTRO_8818
if 
  52166 > $CUT_SCENE_TIME  
jf @INTRO_8899 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_8880 
jump @INTRO_4_start 

:INTRO_8880
0598: stir_ground_around_object $148 radius 10.0 density 4 
jump @INTRO_8818 

:INTRO_8899
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_8944 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 

:INTRO_8944
0598: stir_ground_around_object $148 radius 10.0 density 6 

:INTRO_8956
if 
  52200 > $CUT_SCENE_TIME  
jf @INTRO_9037 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_9018 
jump @INTRO_4_start 

:INTRO_9018
0598: stir_ground_around_object $148 radius 10.0 density 6 
jump @INTRO_8956 

:INTRO_9037
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_9082 
058A: create_gun_flash_from -696.437 -1577.235 12.658 to -696.391 -1577.17 12.635 

:INTRO_9082
0598: stir_ground_around_object $148 radius 10.0 density 6 

:INTRO_9094
if 
  52256 > $CUT_SCENE_TIME  
jf @INTRO_9175 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_9156 
jump @INTRO_4_start 

:INTRO_9156
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_9094 

:INTRO_9175
00BC: text_highpriority 'INT3_N' time 2000 1  // Oh Shit!
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_9202
if 
  52300 > $CUT_SCENE_TIME  
jf @INTRO_9283 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_9264 
jump @INTRO_4_start 

:INTRO_9264
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_9202 

:INTRO_9283
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_9328 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 

:INTRO_9328
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_9340
if 
  52433 > $CUT_SCENE_TIME  
jf @INTRO_9421 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_9402 
jump @INTRO_4_start 

:INTRO_9402
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_9340 

:INTRO_9421
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_9498 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 
058A: create_gun_flash_from -696.439 -1577.222 12.653 to -696.391 -1577.158 12.63 

:INTRO_9498
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_9510
if 
  52566 > $CUT_SCENE_TIME  
jf @INTRO_9591 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_9572 
jump @INTRO_4_start 

:INTRO_9572
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_9510 

:INTRO_9591
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_9636 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 

:INTRO_9636
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_9648
if 
  52666 > $CUT_SCENE_TIME  
jf @INTRO_9729 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_9710 
jump @INTRO_4_start 

:INTRO_9710
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_9648 

:INTRO_9729
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_9774 
058A: create_gun_flash_from -696.465 -1577.189 12.648 to -696.419 -1577.213 12.625 

:INTRO_9774
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_9786
if 
  52700 > $CUT_SCENE_TIME  
jf @INTRO_9867 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_9848 
jump @INTRO_4_start 

:INTRO_9848
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_9786 

:INTRO_9867
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_9912 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 

:INTRO_9912
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_9924
if 
  52833 > $CUT_SCENE_TIME  
jf @INTRO_10005 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_9986 
jump @INTRO_4_start 

:INTRO_9986
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_9924 

:INTRO_10005
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_10050 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 

:INTRO_10050
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_10062
if 
  52900 > $CUT_SCENE_TIME  
jf @INTRO_10143 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_10124 
jump @INTRO_4_start 

:INTRO_10124
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_10062 

:INTRO_10143
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_10188 
058A: create_gun_flash_from -696.576 -1577.111 12.686 to -696.538 -1577.04 12.667 

:INTRO_10188
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_10200
if 
  52966 > $CUT_SCENE_TIME  
jf @INTRO_10281 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_10262 
jump @INTRO_4_start 

:INTRO_10262
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_10200 

:INTRO_10281
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_10326 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 

:INTRO_10326
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_10338
if 
  53100 > $CUT_SCENE_TIME  
jf @INTRO_10419 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_10400 
jump @INTRO_4_start 

:INTRO_10400
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_10338 

:INTRO_10419
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_10464 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 

:INTRO_10464
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_10476
if 
  53133 > $CUT_SCENE_TIME  
jf @INTRO_10557 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_10538 
jump @INTRO_4_start 

:INTRO_10538
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_10476 

:INTRO_10557
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_10602 
058A: create_gun_flash_from -696.692 -1577.05 12.703 to -696.665 -1576.973 12.686 

:INTRO_10602
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_10614
if 
  53233 > $CUT_SCENE_TIME  
jf @INTRO_10695 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_10676 
jump @INTRO_4_start 

:INTRO_10676
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_10614 

:INTRO_10695
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_10740 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 

:INTRO_10740
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_10752
if 
  53366 > $CUT_SCENE_TIME  
jf @INTRO_10833 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_10814 
jump @INTRO_4_start 

:INTRO_10814
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_10752 

:INTRO_10833
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_10942 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 
058A: create_gun_flash_from -696.354 -1578.122 13.06 to -695.836 -1577.301 13.02 
058A: create_gun_flash_from -696.781 -1576.899 12.688 to -696.676 -1576.918 12.67 

:INTRO_10942
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_10954
if 
  53500 > $CUT_SCENE_TIME  
jf @INTRO_11035 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_11016 
jump @INTRO_4_start 

:INTRO_11016
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_10954 

:INTRO_11035
if 
856A:   not has_cutscene_been_interrupted 
jf @INTRO_11080 
058A: create_gun_flash_from -684.222 -1577.189 12.384 to -695.416 -1576.626 12.415 

:INTRO_11080
0598: stir_ground_around_object $148 radius 10.0 density 8 

:INTRO_11092
if 
  57000 > $CUT_SCENE_TIME  
jf @INTRO_11173 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_11154 
jump @INTRO_4_start 

:INTRO_11154
0598: stir_ground_around_object $148 radius 10.0 density 8 
jump @INTRO_11092 

:INTRO_11173
if 
  58736 > $CUT_SCENE_TIME  
jf @INTRO_11242 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_11235 
jump @INTRO_4_start 

:INTRO_11235
jump @INTRO_11173 

:INTRO_11242
00BC: text_highpriority 'INT3_L' time 10000 1  // Go on, get out of here! Drive!

:INTRO_11257
if 
  60800 > $CUT_SCENE_TIME  
jf @INTRO_11326 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_11319 
jump @INTRO_4_start 

:INTRO_11319
jump @INTRO_11257 

:INTRO_11326
00BE: text_clear_all 

:INTRO_11328
if 
  63212 > $CUT_SCENE_TIME  
jf @INTRO_11397 
wait 0 
02E8: $CUT_SCENE_TIME = cutscenetime 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_11390 
jump @INTRO_4_start 

:INTRO_11390
jump @INTRO_11328 

:INTRO_11397
0169: set_fade_color 1 1 1 
fade 0 2000 

:INTRO_11412
if 
fading 
jf @INTRO_11468 
wait 0 
gosub @INTRO_cutsceneskip 
if 
  $13 == 2  
jf @INTRO_11461 
jump @INTRO_4_start 

:INTRO_11461
jump @INTRO_11412 

:INTRO_11468
04FA: clear_extra_colors_with_fade 0 
02EA: end_cutscene 
0296: unload_special_actor 1 
0296: unload_special_actor 2 
0296: unload_special_actor 3 
0296: unload_special_actor 4 
0296: unload_special_actor 5 
0296: unload_special_actor 6 
0296: unload_special_actor 7 
0296: unload_special_actor 8 
Model.Destroy(#CUTOBJ01)
Model.Destroy(#CUTOBJ02)
Model.Destroy(#CUTOBJ03)
Model.Destroy(#CUTOBJ04)
Model.Destroy(#DOC_CRANEEGGS04)
Model.Destroy(#DOC_CRANE_CAB04)
Model.Destroy(#DOCKFUEL07)
wait 0 

:INTRO_4_start
044D: load_splash 'INTRO4' 
0169: set_fade_color 2 2 2 
if 
  $13 == 2  
jf @INTRO_4_setup 
fade 0 1000 
00BE: text_clear_all 

:INTRO_4_waitforfade
if 
fading 
jf @INTRO_4_setup 
wait 0 
jump @INTRO_4_waitforfade 

:INTRO_4_setup
$13 = 0
01B7: release_weather 
00C0: set_current_time 21 0 
02EA: end_cutscene 
04FA: clear_extra_colors_with_fade 0 
select_interior 0 
0296: unload_special_actor 1 
0296: unload_special_actor 2 
0296: unload_special_actor 3 
0296: unload_special_actor 4 
0296: unload_special_actor 5 
0296: unload_special_actor 6 
0296: unload_special_actor 7 
0296: unload_special_actor 8 
0296: unload_special_actor 9 
0296: unload_special_actor 10 
0296: unload_special_actor 11 
0296: unload_special_actor 12 
0296: unload_special_actor 13 
0296: unload_special_actor 14 
0296: unload_special_actor 15 
0296: unload_special_actor 16 
0296: unload_special_actor 17 
0296: unload_special_actor 18 
0296: unload_special_actor 19 
0296: unload_special_actor 20 
0296: unload_special_actor 21 
Model.Destroy(#CUTOBJ01)
Model.Destroy(#CUTOBJ02)
Model.Destroy(#CUTOBJ03)
Model.Destroy(#CUTOBJ04)
Model.Destroy(#CUTOBJ05)
Model.Destroy(#DOC_CRANEEGGS04)
Model.Destroy(#DOC_CRANE_CAB04)
Model.Destroy(#DOCKFUEL07)
Model.Destroy(#AP_RADAR1_01)
Model.Destroy(#VEG_PALM04)
0363: toggle_model_render_at 231.4 -1277.7 19.0 radius 50.0 object #MOB_MOBROOM2 0 
0363: toggle_model_render_at 231.4 -1277.7 19.0 radius 50.0 object #MOB_DETAILSB 0 
wait 0 
01B7: release_weather 
00C0: set_current_time 21 0 
3@ = 0  
4@ = 0  
5@ = 0  
6@ = 0  
02A3: enable_widescreen 1 
Player.CanMove($PLAYER_CHAR, False)
01F7: set_player $PLAYER_CHAR ignored_by_cops_state_to 1 
03BF: set_player $PLAYER_CHAR ignored_by_everyone_to 1 
03CF: load_wav 'INTRO1' as 1 
03CF: load_wav 'INTRO2' as 2 

:INTRO_4_waitforloadaudio
if or
83D0:   not wav 1 loaded 
83D0:   not wav 2 loaded 
jf @INTRO_4_setup2 
wait 0 
jump @INTRO_4_waitforloadaudio 

:INTRO_4_setup2
Model.Load(#ADMIRAL)
Model.Load(#FAGGIO)
023C: load_special_actor 10 'IGKEN' 
038B: load_requested_models 

:INTRO_4_waitforloadmodels
if or
   not Model.Available(#ADMIRAL)
   not Model.Available(#FAGGIO)
823D:   not special_actor 10 loaded 
jf @INTRO_4_setup3 
wait 0 
jump @INTRO_4_waitforloadmodels 

:INTRO_4_setup3
0395: clear_area 0 at 114.2 -823.3 9.7 range 1.0 
04E4: request_collision_at 86.428 -852.238 
Camera.SetAtPos(114.2, -823.3, 9.7)
0395: clear_area 1 at 86.428 -852.238 9.325 range 50.0 
03DE: set_pedestrians_density_multiplier_to 0.0 
01EB: set_traffic_density_multiplier_to 0.0 
0055: put_player $PLAYER_CHAR at 86.428 -852.238 9.325 
0395: clear_area 1 at 86.485 -851.933 10.0 range 10.0 
Car.Create(0@, #ADMIRAL, 83.54, -851.669, 10.0)
Car.SetImmunities(0@, 1, 1, 1, 1, 1)
Car.Angle(0@) = 330.0
01D4: actor $PLAYER_ACTOR go_to_car 0@ and_enter_it_as_a_passenger 
0129: 2@ = create_actor 4 #SPECIAL10 in_car 0@ driverseat 
01ED: clear_actor 2@ threat_search 
02AB: set_actor 2@ immunities BP 1 FP 1 EP 1 CP 1 MP 1 
Car.SetToNormalDriver(0@)
0229: set_car 0@ color_to 84 84 
Car.Create(1@, #FAGGIO, 127.4, -818.5, 9.5)
Car.Angle(1@) = 250.6
041E: set_radio_station 9 -1 
Model.Destroy(#ADMIRAL)
Model.Destroy(#FAGGIO)

:INTRO_4_waitforplayertoentercar
if 
   not Actor.Driving($PLAYER_ACTOR)
jf @INTRO_4_startcutscene 
wait 0 
jump @INTRO_4_waitforplayertoentercar 

:INTRO_4_startcutscene
fade 1 1000 
0395: clear_area 1 at 116.583 -796.821 11.423 range 1.0 
Camera.SetPosition(116.583, -796.821, 11.423, 0.0, 0.0, 0.0)
Camera.PointAt(116.573, -797.821, 11.414, 2)
if 
   not Car.Wrecked(0@)
jf @INTRO_4_resetdialoguetimers 
04BA: set_car 0@ speed_instantly 20.0 
Car.DriveTo(0@, 103.1, -832.3, 9.317)
Car.SetMaxSpeed(0@, 30.0)
00AE: set_vehicle 0@ traffic_behavior_to 2 
4@ = 1  

:INTRO_4_resetdialoguetimers
TIMERA = 0  
TIMERB = 0  

:INTRO_4_checkdialogueprogress
if or
   not 3@ == 8  // all required dialogues played
   not 4@ == 4  // car has arrived
jf @INTRO_4_carparked 
wait 0 
if 
   Car.Wrecked(0@)
jf @INTRO_4_carstuckfailsafe 
jump @INTRO_4_dialoguestart_pokehead 

:INTRO_4_carstuckfailsafe
if and
  4@ == 1  
  TIMERB >= 30000  
  not Car.Wrecked(0@)
  81AF:   not car 0@ 0 132.6 -818.278 9.446 radius 3.0 3.0 4.0 
jf @INTRO_4_cardriveskip 
4@ = 3  
Car.PutAt(0@, 132.6, -818.278, 9.446)
Car.Angle(0@) = 206.0214

:INTRO_4_cardriveskip
gosub @INTRO_4_cutsceneskip
if
  $13 > 0
jf @INTRO_4_cardriveto1
if 
  81AF:   not car 0@ 0 136.4 -819.482 10.148 radius 5.0 5.0 4.0 
jf @INTRO_4_moveplayer 
Car.PutAt(0@, 136.4, -819.482, 9.446)
Car.Angle(0@) = 206.0214
jump @INTRO_4_moveplayer

:INTRO_4_cardriveto1
if 
  4@ == 1  
jf @INTRO_4_cardriveto2 
if 
01AF:   car 0@ 0 103.1 -832.3 9.317 radius 4.0 4.0 4.0 
jf @INTRO_4_cardriveto2 
Car.DriveTo(0@, 113.371, -819.078, 9.317)
4@ = 2  

:INTRO_4_cardriveto2
if 
  4@ == 2  
jf @INTRO_4_cardriveto3 
if 
01AF:   car 0@ 0 113.371 -819.078 9.317 radius 4.0 4.0 4.0 
jf @INTRO_4_cardriveto3 
Car.DriveTo(0@, 132.6, -818.278, 9.446)
4@ = 3  

:INTRO_4_cardriveto3
if 
  4@ == 3  
jf @INTRO_4_dialoguestart_pokehead 
if 
01AF:   car 0@ 0 132.6 -818.278 9.446 radius 3.0 3.0 4.0 
jf @INTRO_4_dialoguestart_pokehead 
if 
   not Car.Wrecked(0@)
jf @INTRO_4_dialoguestart_pokehead 
Car.SetMaxSpeed(0@, 0.0)
Car.SetToNormalDriver(0@)
4@ = 4  

:INTRO_4_dialoguestart_pokehead
if 
  3@ == 0  
jf @INTRO_4_changedialoguecameraangle 
03D1: play_wav 1 
00BC: text_highpriority 'INTRO1' time 10000 1  // I poke my head out of the gutter for one freakin' second and fate shovels shit in my face!
TIMERA = 0  
TIMERB = 0  
3@ = 1  

:INTRO_4_changedialoguecameraangle
if 
  6@ == 0  
jf @INTRO_4_dialoguestart_getsleep 
if 
  TIMERB >= 2000  
jf @INTRO_4_dialoguestart_getsleep 
0395: clear_area 0 at 104.88 -808.433 12.108 range 1.0 
Camera.SetPosition(104.88, -808.433, 12.108, 0.0, 0.0, 0.0)
Camera.PointAt(105.771, -808.888, 12.091, 2)
TIMERB = 0  
6@ = 1  

:INTRO_4_dialoguestart_getsleep
if 
  3@ == 1  
jf @INTRO_4_loadnextaudiofile1 
if 
03D2:   wav 1 ended 
jf @INTRO_4_loadnextaudiofile1 
03D5: remove_text 'INTRO1'  // I poke my head out of the gutter for one freakin' second and fate shovels shit in my face!
if 
  TIMERA >= 1000  
jf @INTRO_4_loadnextaudiofile1 
03D1: play_wav 2 
00BC: text_highpriority 'INTRO2' time 10000 1  // Go get some sleep.
3@ = 2  

:INTRO_4_loadnextaudiofile1
if 
  3@ == 2  
jf @INTRO_4_dialoguestop_getsleep 
03CF: load_wav 'INTRO3' as 1 
3@ = 3  

:INTRO_4_dialoguestop_getsleep
if 
  3@ == 3  
jf @INTRO_4_loadnextaudiofile2 
if 
03D2:   wav 2 ended 
jf @INTRO_4_loadnextaudiofile2 
03D5: remove_text 'INTRO2'  // Go get some sleep.
3@ = 4  

:INTRO_4_loadnextaudiofile2
if 
  3@ == 4  
jf @INTRO_4_dialoguestart_whatgonna 
if 
03D0:   wav 1 loaded 
jf @INTRO_4_dialoguestart_whatgonna 
03CF: load_wav 'INTRO4' as 2 
TIMERA = 0  
3@ = 5  

:INTRO_4_dialoguestart_whatgonna
if 
  3@ == 5  
jf @INTRO_4_dialoguestop_whatgonna 
if 
  TIMERA >= 900  
jf @INTRO_4_dialoguestop_whatgonna 
03D1: play_wav 1 
00BC: text_highpriority 'INTRO3' time 10000 1  // What are you gonna do?
3@ = 6  

:INTRO_4_dialoguestop_whatgonna
if 
  3@ == 6  
jf @INTRO_4_dialoguedone 
if 
03D2:   wav 1 ended 
jf @INTRO_4_dialoguedone 
03D5: remove_text 'INTRO3'  // What are you gonna do?
3@ = 7  

:INTRO_4_dialoguedone
if 
  3@ == 7  
jf @INTRO_4_checkdialogueprogressjump 
if 
03D0:   wav 2 loaded 
jf @INTRO_4_checkdialogueprogressjump 
TIMERA = 0  
3@ = 8  

:INTRO_4_checkdialogueprogressjump
jump @INTRO_4_checkdialogueprogress 

:INTRO_4_carparked
gosub @INTRO_4_cutsceneskip
if
  $13 == 0
jf @INTRO_4_moveplayer
if 
  300 > TIMERA  
jf @INTRO_4_dialoguestart_dropby 
wait 0 
jump @INTRO_4_carparked 

:INTRO_4_dialoguestart_dropby
03D1: play_wav 2 
00BC: text_highpriority 'INTRO4' time 10000 1  // I'll drop by your office tomorrow and we can start sorting this mess out.
wait 400 

:INTRO_4_dialoguewait_dropby
gosub @INTRO_4_cutsceneskip
if
  $13 == 0
jf @INTRO_4_moveplayer
if 
83D2:   not wav 2 ended 
jf @INTRO_4_kenexitcar 
wait 0 
jump @INTRO_4_dialoguewait_dropby 

:INTRO_4_kenexitcar
03D5: remove_text 'INTRO4'  // I'll drop by your office tomorrow and we can start sorting this mess out.
if 
   not Car.Wrecked(0@)
jf @INTRO_4_waitforkenexitcar 
if 
   not Actor.Dead(2@)
jf @INTRO_4_waitforkenexitcar 
01D3: actor 2@ leave_car 0@ 

:INTRO_4_waitforkenexitcar
gosub @INTRO_4_cutsceneskip
if
  $13 == 0
jf @INTRO_4_moveplayer
if 
   not Actor.Dead(2@)
jf @INTRO_4_kenrunto1 
if 
   Actor.Driving(2@)
jf @INTRO_4_kenrunto1 
wait 0 
jump @INTRO_4_waitforkenexitcar 

:INTRO_4_kenrunto1
if 
   not Actor.Dead(2@)
jf @INTRO_4_resettimer1 
0211: actor 2@ walk_to 125.809 -815.263 
0319: set_actor 2@ running 1 

:INTRO_4_resettimer1
TIMERA = 0  

:INTRO_4_waitfortimer1
gosub @INTRO_4_cutsceneskip
if
  $13 == 0
jf @INTRO_4_moveplayer
if 
  1500 > TIMERA  
jf @INTRO_4_kenrunto2 
wait 0 
jump @INTRO_4_waitfortimer1 

:INTRO_4_kenrunto2
0395: clear_area 0 at 113.655 -815.814 11.029 range 1.0 
Camera.SetPosition(113.655, -815.814, 11.029, 0.0, 0.0, 0.0)
Camera.PointAt(114.307, -816.57, 11.083, 2)
if 
   not Actor.Dead(2@)
jf @INTRO_4_moveplayer 
009F: set_actor 2@ idle 
011C: actor 2@ clear_objective 
Actor.PutAt(2@, 125.809, -815.263, 9.444)
0211: actor 2@ walk_to 116.269 -825.438 
0319: set_actor 2@ running 1 
5@ = 1  

:INTRO_4_moveplayer
if 
   not Actor.Driving($PLAYER_ACTOR)
jf @INTRO_4_moveplayerfromcar 
Actor.PutAt($PLAYER_ACTOR, 136.457, -817.37, 9.44)
Actor.Angle($PLAYER_ACTOR) = 225.495
jump @INTRO_4_resettimer2 

:INTRO_4_moveplayerfromcar
0362: put_actor $PLAYER_ACTOR at 136.457 -817.37 9.44 and_remove_from_car 
if 
   not Actor.Driving($PLAYER_ACTOR)
jf @INTRO_4_resettimer2 
Actor.Angle($PLAYER_ACTOR) = 225.495

:INTRO_4_resettimer2
TIMERB = 0  

:INTRO_4_waitfortimer2
gosub @INTRO_4_cutsceneskip
if
  $13 == 0
jf @INTRO_finish
if 
  1350 > TIMERB  
jf @INTRO_finish 
wait 0 
jump @INTRO_4_waitfortimer2 

:INTRO_finish
Camera.SetBehindPlayer
Camera.Restore_WithJumpCut
03D5: remove_text 'INTRO1'
03D5: remove_text 'INTRO2'
03D5: remove_text 'INTRO3'
03D5: remove_text 'INTRO4'  // I'll drop by your office tomorrow and we can start sorting this mess out.
041E: set_radio_station 1 -1 
03BF: set_player $PLAYER_CHAR ignored_by_everyone_to 0 
01F7: set_player $PLAYER_CHAR ignored_by_cops_state_to 0 
03AD: set_rubbish 1 
Player.CanMove($PLAYER_CHAR, True)
02A3: enable_widescreen 0 
Car.RemoveReferences(0@)
Car.RemoveReferences(1@)
014C: set_parked_car_generator $PARKEDCAR_ADMIRAL_KENS cars_to_generate_to 101 
Actor.DestroyInstantly(2@)
$220 = 1  
$ONMISSION = 0  
if 
   not Car.Wrecked(0@)
jf @INTRO_finish2 
Car.SetImmunities(0@, 0, 0, 0, 0, 0)

:INTRO_finish2
0296: unload_special_actor 10 
Model.Destroy(#ADMIRAL)
Model.Destroy(#FAGGIO)
03DE: set_pedestrians_density_multiplier_to 1.0 
01EB: set_traffic_density_multiplier_to 1.0 
044D: load_splash 'SPLASH1' 
0169: set_fade_color 0 0 0 
mission_cleanup 
terminate_this_script 
return 

:INTRO_cutsceneskip
if 
  $13 == 0  
jf @INTRO_cutsceneskip2 
if and
80E1:   not player 0 pressed_button 16 
80E1:   not player 0 pressed_button 12 
jf @INTRO_cutsceneskip2 
$13 = 1  

:INTRO_cutsceneskip2
if 
  $13 == 1  
jf @INTRO_cutsceneskip3 
if 
056A:   has_cutscene_been_interrupted 
jf @INTRO_cutsceneskip3 
$13 = 2  

:INTRO_cutsceneskip3
return 

:INTRO_4_cutsceneskip
if
  not fading
jf @INTRO_4_cutsceneskip2
if 
  $13 == 0
jf @INTRO_4_cutsceneskip2
if or
00E1:   player 0 pressed_button 16 
00E1:   player 0 pressed_button 12 
jf @INTRO_4_cutsceneskip2
$13 = 1

:INTRO_4_cutsceneskip2
return