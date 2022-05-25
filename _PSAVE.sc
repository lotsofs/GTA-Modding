// ==================== PSAVES =========================

:PSAVES
script_name 'PSAVES'

:PSAVES_genericchecks
wait 250
if
   Player.Defined($PLAYER_CHAR)
jf @PSAVES_continue 
if
	Player.Controllable($PLAYER_CHAR)
jf @PSAVES_continue
// ----------------------------------------

:PSAVES_checkhouse0destroy
if
  $ONMISSION == 1
jf @PSAVES_checkhouse0pickup
if
  $HOUSE0_ACTIVE == 1 
jf @PSAVES_check0end
Pickup.Destroy($HOUSE0_SAVEPICKUP)
$HOUSE0_ACTIVE = 0
jump @PSAVES_check0end 

:PSAVES_checkhouse0pickup
if and
	0121:   player $PLAYER_CHAR in_zone 'DTOWN'  // Skumole Shack
	$HOUSE0_BOUGHT == 1
jf @PSAVES_check0end
if
	$HOUSE0_ACTIVE == 0
jf @PSAVES_checkhouse0save
Pickup.Create($HOUSE0_SAVEPICKUP, #PICKUPSAVE, 3, -562.8, 699.7, 20.6)
$HOUSE0_ACTIVE = 1

:PSAVES_checkhouse0save
if 
   Pickup.Picked_up($HOUSE0_SAVEPICKUP)
jf @PSAVES_check0end
HELP_4118() // show save screen
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVES_finishsave
Pickup.Destroy($HOUSE0_SAVEPICKUP)
Pickup.Create($HOUSE0_SAVEPICKUP, #PICKUPSAVE, 3, -562.8, 699.7, 20.6)
fade 1 1000 
0395: clear_area 1 at -559.9 705.4 19.8 range 1.0 
0055: put_player $PLAYER_CHAR at -559.9 705.4 19.8 
0171: set_player $PLAYER_CHAR z_angle_to 243.0 
jump @PSAVES_finishsave

:PSAVES_check0end
// ----------------------------------------

:PSAVES_checkhouse1destroy
if
  $ONMISSION == 1
jf @PSAVES_checkhouse1pickup
if
  $HOUSE1_ACTIVE == 1 
jf @PSAVES_check1end
Pickup.Destroy($HOUSE1_SAVEPICKUP)
$HOUSE1_ACTIVE = 0
jump @PSAVES_check1end 

:PSAVES_checkhouse1pickup
if and
	0121:   player $PLAYER_CHAR in_zone 'BEACH3'  // 3321 Vice Point
	$HOUSE1_BOUGHT == 1
jf @PSAVES_check1end
if
	$HOUSE1_ACTIVE == 0
jf @PSAVES_checkhouse1save
Pickup.Create($HOUSE1_SAVEPICKUP, #PICKUPSAVE, 3, $HOUSE1_X, $HOUSE1_Y, $HOUSE1_Z)
$HOUSE1_ACTIVE = 1

:PSAVES_checkhouse1save
if 
   Pickup.Picked_up($HOUSE1_SAVEPICKUP)
jf @PSAVES_check1end
HELP_4118() // show save screen
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVES_finishsave
Pickup.Destroy($HOUSE1_SAVEPICKUP)
Pickup.Create($HOUSE1_SAVEPICKUP, #PICKUPSAVE, 3, $HOUSE1_X, $HOUSE1_Y, $HOUSE1_Z)
fade 1 1000 
0395: clear_area 1 at 529.6626 1272.155 16.822 range 1.0 
0055: put_player $PLAYER_CHAR at 529.6626 1272.155 16.822 
0171: set_player $PLAYER_CHAR z_angle_to 131.5277 
jump @PSAVES_finishsave

:PSAVES_check1end
// ----------------------------------------

:PSAVES_checkhouse2destroy
if
  $ONMISSION == 1
jf @PSAVES_checkhouse2pickup
if
  $HOUSE2_ACTIVE == 1 
jf @PSAVES_check2end
Pickup.Destroy($HOUSE2_SAVEPICKUP)
$HOUSE2_ACTIVE = 0
jump @PSAVES_check2end 

:PSAVES_checkhouse2pickup
if and
	0121:   player $PLAYER_CHAR in_zone 'BEACH2'  // 1102 Washington Street
	$HOUSE2_BOUGHT == 1
jf @PSAVES_check2end
if
	$HOUSE2_ACTIVE == 0
jf @PSAVES_checkhouse2save
Pickup.Create($HOUSE2_SAVEPICKUP, #PICKUPSAVE, 3, $HOUSE2_X, $HOUSE2_Y, $HOUSE2_Z)
$HOUSE2_ACTIVE = 1

:PSAVES_checkhouse2save
if 
   Pickup.Picked_up($HOUSE2_SAVEPICKUP)
jf @PSAVES_check2end
HELP_4118() // show save screen
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVES_finishsave
Pickup.Destroy($HOUSE2_SAVEPICKUP)
Pickup.Create($HOUSE2_SAVEPICKUP, #PICKUPSAVE, 3, $HOUSE2_X, $HOUSE2_Y, $HOUSE2_Z)
fade 1 1000 
0395: clear_area 1 at 90.781 -806.1213 10.3349 range 1.0 
0055: put_player $PLAYER_CHAR at 90.781 -806.1213 10.3349 
0171: set_player $PLAYER_CHAR z_angle_to 238.8605 
jump @PSAVES_finishsave

:PSAVES_check2end
// ----------------------------------------

:PSAVES_checkhouse3destroy
if
  $ONMISSION == 1
jf @PSAVES_checkhouse3pickup
if
  $HOUSE3_ACTIVE == 1 
jf @PSAVES_check3end
Pickup.Destroy($HOUSE3_SAVEPICKUP)
$HOUSE3_ACTIVE = 0
jump @PSAVES_check3end 

:PSAVES_checkhouse3pickup
if and
if 
0121:   player $PLAYER_CHAR in_zone 'BEACH1'  // Ocean Heights
	$HOUSE3_BOUGHT == 1
jf @PSAVES_check3end
if
	$HOUSE3_ACTIVE == 0
jf @PSAVES_checkhouse3save
Pickup.Create($HOUSE3_SAVEPICKUP, #PICKUPSAVE, 3, $HOUSE3_X, $HOUSE3_Y, $HOUSE3_Z)
$HOUSE3_ACTIVE = 1

:PSAVES_checkhouse3save
if 
   Pickup.Picked_up($HOUSE3_SAVEPICKUP)
jf @PSAVES_check3end
HELP_4118() // show save screen
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVES_finishsave
Pickup.Destroy($HOUSE3_SAVEPICKUP)
Pickup.Create($HOUSE3_SAVEPICKUP, #PICKUPSAVE, 3, $HOUSE3_X, $HOUSE3_Y, $HOUSE3_Z)
fade 1 1000 
0395: clear_area 1 at 14.4571 -1498.594 12.1974 range 1.0 
0055: put_player $PLAYER_CHAR at 14.4571 -1498.594 12.1974 
0171: set_player $PLAYER_CHAR z_angle_to 353.8286 
jump @PSAVES_finishsave

:PSAVES_check3end
// ----------------------------------------

:PSAVES_checkhouse4destroy
if
  $ONMISSION == 1
jf @PSAVES_checkhouse4pickup
if
  $HOUSE4_ACTIVE == 1 
jf @PSAVES_check4end
Pickup.Destroy($HOUSE4_SAVEPICKUP)
$HOUSE4_ACTIVE = 0
jump @PSAVES_check4end 

:PSAVES_checkhouse4pickup
if and
if 
0121:   player $PLAYER_CHAR in_zone 'DTOWN'  // Hyman Condo
	$HOUSE4_BOUGHT == 1
jf @PSAVES_check4end
if
	$HOUSE4_ACTIVE == 0
jf @PSAVES_checkhouse4save
Pickup.Create($HOUSE4_SAVEPICKUP, #PICKUPSAVE, 3, $HOUSE4_X, $HOUSE4_Y, $HOUSE4_Z)
$HOUSE4_ACTIVE = 1

:PSAVES_checkhouse4save
if 
   Pickup.Picked_up($HOUSE4_SAVEPICKUP)
jf @PSAVES_check4end
HELP_4118() // show save screen
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVES_finishsave
Pickup.Destroy($HOUSE4_SAVEPICKUP)
Pickup.Create($HOUSE4_SAVEPICKUP, #PICKUPSAVE, 3, $HOUSE4_X, $HOUSE4_Y, $HOUSE4_Z)
fade 1 1000 
0395: clear_area 1 at -833.811 1304.07 10.5131 range 1.0 
0055: put_player $PLAYER_CHAR at -833.811 1304.07 10.5131 
0171: set_player $PLAYER_CHAR z_angle_to 200.4458 
jump @PSAVES_finishsave

:PSAVES_check4end
// ----------------------------------------

:PSAVES_checkhouse5destroy
if
  $ONMISSION == 1
jf @PSAVES_checkhouse5pickup
if
  $HOUSE5_ACTIVE == 1 
jf @PSAVES_check5end
Pickup.Destroy($HOUSE5_SAVEPICKUP)
$HOUSE5_ACTIVE = 0
jump @PSAVES_check5end 

:PSAVES_checkhouse5pickup
if and
if 
0121:   player $PLAYER_CHAR in_zone 'BEACH3'  // El Swanko Casa
	$HOUSE5_BOUGHT == 1
jf @PSAVES_check5end
if
	$HOUSE5_ACTIVE == 0
jf @PSAVES_checkhouse5save
Pickup.Create($HOUSE5_SAVEPICKUP, #PICKUPSAVE, 3, $HOUSE5_X, $HOUSE5_Y, $HOUSE5_Z)
$HOUSE5_ACTIVE = 1

:PSAVES_checkhouse5save
if 
   Pickup.Picked_up($HOUSE5_SAVEPICKUP)
jf @PSAVES_check5end
HELP_4118() // show save screen
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVES_finishsave
Pickup.Destroy($HOUSE5_SAVEPICKUP)
Pickup.Create($HOUSE5_SAVEPICKUP, #PICKUPSAVE, 3, $HOUSE5_X, $HOUSE5_Y, $HOUSE5_Z)
fade 1 1000 
0395: clear_area 1 at 428.4 609.1 12.0 range 1.0 
0055: put_player $PLAYER_CHAR at 428.4 609.1 12.0 
0171: set_player $PLAYER_CHAR z_angle_to 0.0 
jump @PSAVES_finishsave

:PSAVES_check5end
// ----------------------------------------

:PSAVES_checkhouse6destroy
if
  $ONMISSION == 1
jf @PSAVES_checkhouse6pickup
if
  $HOUSE6_ACTIVE == 1 
jf @PSAVES_check6end
Pickup.Destroy($HOUSE6_SAVEPICKUP)
$HOUSE6_ACTIVE = 0
jump @PSAVES_check6end 

:PSAVES_checkhouse6pickup
if and
if 
0121:   player $PLAYER_CHAR in_zone 'BEACH3'  // Links View
	$HOUSE6_BOUGHT == 1
jf @PSAVES_check6end
if
	$HOUSE6_ACTIVE == 0
jf @PSAVES_checkhouse6save
Pickup.Create($HOUSE6_SAVEPICKUP, #PICKUPSAVE, 3, $HOUSE6_X, $HOUSE6_Y, $HOUSE6_Z)
$HOUSE6_ACTIVE = 1

:PSAVES_checkhouse6save
if 
   Pickup.Picked_up($HOUSE6_SAVEPICKUP)
jf @PSAVES_check6end
HELP_4118() // show save screen
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVES_finishsave
Pickup.Destroy($HOUSE6_SAVEPICKUP)
Pickup.Create($HOUSE6_SAVEPICKUP, #PICKUPSAVE, 3, $HOUSE6_X, $HOUSE6_Y, $HOUSE6_Z)
fade 1 1000 
0395: clear_area 1 at 306.5728 376.2928 12.1856 range 1.0 
0055: put_player $PLAYER_CHAR at 306.5728 376.2928 12.1856 
0171: set_player $PLAYER_CHAR z_angle_to 276.3156 
jump @PSAVES_finishsave

:PSAVES_check6end
// ----------------------------------------

:PSAVES_checkhouse7destroy
if
  $ONMISSION == 1
jf @PSAVES_checkhouse7pickup
if
  $HOUSE7_ACTIVE == 1 
jf @PSAVES_check7end
Pickup.Destroy($HOUSE7_SAVEPICKUP)
$HOUSE7_ACTIVE = 0
jump @PSAVES_check7end 

:PSAVES_checkhouse7pickup
if and
if 
0121:   player $PLAYER_CHAR in_zone 'JUNKY'  // Junk Yard
	$HOUSE7_BOUGHT == 1
jf @PSAVES_check7end
if
	$HOUSE7_ACTIVE == 0
jf @PSAVES_checkhouse7save
Pickup.Create($HOUSE7_SAVEPICKUP, #PICKUPSAVE, 3, -1242.8242, 82.145, 11.88)
$HOUSE7_ACTIVE = 1

:PSAVES_checkhouse7save
if 
   Pickup.Picked_up($HOUSE7_SAVEPICKUP)
jf @PSAVES_check7end
HELP_4118() // show save screen
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVES_finishsave
Pickup.Destroy($HOUSE7_SAVEPICKUP)
Pickup.Create($HOUSE7_SAVEPICKUP, #PICKUPSAVE, 3, -1242.8242, 82.145, 11.88)
fade 1 1000 
0395: clear_area 1 at -1249.6212 86.3196 10.4558 range 1.0 
0055: put_player $PLAYER_CHAR at -1249.6212 86.3196 10.4558 
0171: set_player $PLAYER_CHAR z_angle_to 119.799 
jump @PSAVES_finishsave

:PSAVES_check7end
// ----------------------------------------
jump @PSAVES_continue

:PSAVES_finishsave
HELP_4210() // finish save (restore camera, control, om0)

:PSAVES_continue
jump @PSAVES_genericchecks












:PSAVE1
script_name 'PSAVE1' 

:PSAVE1_10
wait 250 
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE1_563 
if 
0121:   player $PLAYER_CHAR in_zone 'BEACH1'  // Ocean Beach
jf @PSAVE1_563 
if 
   Player.Controllable($PLAYER_CHAR)
jf @PSAVE1_563 
if 
  $ONMISSION == 0 // $ == int 
jf @PSAVE1_533 
if 
  $444 == 0 // $ == int 
jf @PSAVE1_138 
Pickup.Create($443, #PICKUPSAVE, 3, 219.3, -1273.5, 11.5)
$444 = 1 // $ = int 

:PSAVE1_138
if 
   Pickup.Picked_up($443)
jf @PSAVE1_526 
HELP_4118()
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE1_491 
Pickup.Destroy($443)
Pickup.Create($443, #PICKUPSAVE, 3, 219.3, -1273.5, 11.5)
fade 1 1000 
if 
  $222 == 0 // $ == int 
jf @PSAVE1_433 
0395: clear_area 1 at 220.3 -1275.5 11.0 range 1.0 
0055: put_player $PLAYER_CHAR at 220.3 -1275.5 11.0 
0171: set_player $PLAYER_CHAR z_angle_to 121.0 
Camera.SetPosition(223.301, -1277.655, 13.822, 0.0, 0.0, 0.0)
Camera.PointAt(222.563, -1278.279, 13.565, 2)
03E5: text_box 'HELP19'  // Walk into the ~q~pink marker ~w~to continue.
TIMERA = 0 // @ = int 

:PSAVE1_353
if 
   not TIMERA > 2000 // @ > int 
jf @PSAVE1_426 
wait 0 
if 
  TIMERA > 500 // @ > int 
jf @PSAVE1_419 
if 
00E1:   player 0 pressed_button 16 
jf @PSAVE1_419 
jump @PSAVE1_426 

:PSAVE1_419
jump @PSAVE1_353 

:PSAVE1_426
jump @PSAVE1_487 

:PSAVE1_433
0395: clear_area 1 at 223.1 -1276.7 11.0 range 1.0 
0055: put_player $PLAYER_CHAR at 223.1 -1276.7 11.0 
0171: set_player $PLAYER_CHAR z_angle_to 258.0 

:PSAVE1_487
Camera.Restore_WithJumpCut
Camera.SetBehindPlayer

:PSAVE1_491
wait 500 
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE1_526 
Player.CanMove($PLAYER_CHAR, True)
$ONMISSION = 0 // $ = int 

:PSAVE1_526
jump @PSAVE1_563 

:PSAVE1_533
if 
  $444 == 1 // $ == int 
jf @PSAVE1_563 
Pickup.Destroy($443)
$444 = 0 // $ = int 

:PSAVE1_563
jump @PSAVE1_10 

:PSAVE2
script_name 'PSAVE2' 

:PSAVE2_10
wait 250 
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE2_311 
if 
0121:   player $PLAYER_CHAR in_zone 'STARI'  // Starfish Island
jf @PSAVE2_311 
if 
   Player.Controllable($PLAYER_CHAR)
jf @PSAVE2_311 
if 
  $ONMISSION == 0 // $ == int 
jf @PSAVE2_281 
if 
  $21 == 0 // $ == int 
jf @PSAVE2_138 
Pickup.Create($20, #PICKUPSAVE, 3, -378.3, -597.2, 25.8)
$21 = 1 // $ = int 

:PSAVE2_138
if 
   Pickup.Picked_up($20)
jf @PSAVE2_274 
HELP_4118()
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE2_267 
Pickup.Destroy($20)
Pickup.Create($20, #PICKUPSAVE, 3, -378.3, -597.2, 25.8)
fade 1 1000 
0395: clear_area 1 at -378.3 -592.3 25.3 range 1.0 
0055: put_player $PLAYER_CHAR at -378.5 -589.1 24.6 
0171: set_player $PLAYER_CHAR z_angle_to 0.0 

:PSAVE2_267
HELP_4210()

:PSAVE2_274
jump @PSAVE2_311 

:PSAVE2_281
if 
  $21 == 1 // $ == int 
jf @PSAVE2_311 
Pickup.Destroy($20)
$21 = 0 // $ = int 

:PSAVE2_311
jump @PSAVE2_10 

:PSAVE3
script_name 'PSAVE3' 

:PSAVE3_10
wait 250 
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE3_311 
if 
0121:   player $PLAYER_CHAR in_zone 'HAVANA'  // Little Havana
jf @PSAVE3_311 
if 
   Player.Controllable($PLAYER_CHAR)
jf @PSAVE3_311 
if 
  $ONMISSION == 0 // $ == int 
jf @PSAVE3_281 
if 
  $67 == 0 // $ == int 
jf @PSAVE3_138 
Pickup.Create($68, #PICKUPSAVE, 3, -1033.8, -846.9, 13.0)
$67 = 1 // $ = int 

:PSAVE3_138
if 
   Pickup.Picked_up($68)
jf @PSAVE3_274 
HELP_4118()
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE3_267 
Pickup.Destroy($68)
Pickup.Create($68, #PICKUPSAVE, 3, -1033.8, -846.9, 13.0)
fade 1 1000 
0395: clear_area 1 at -1028.3 -851.9 12.3 range 1.0 
0055: put_player $PLAYER_CHAR at -1028.3 -851.9 12.3 
0171: set_player $PLAYER_CHAR z_angle_to 226.0 

:PSAVE3_267
HELP_4210()

:PSAVE3_274
jump @PSAVE3_311 

:PSAVE3_281
if 
  $67 == 1 // $ == int 
jf @PSAVE3_311 
Pickup.Destroy($68)
$67 = 0 // $ = int 

:PSAVE3_311
jump @PSAVE3_10 

:PSAVE4
script_name 'PSAVE4' 

:PSAVE4_10
wait 250 
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE4_311 
if 
0121:   player $PLAYER_CHAR in_zone 'HAITI'  // Little Haiti
jf @PSAVE4_311 
if 
   Player.Controllable($PLAYER_CHAR)
jf @PSAVE4_311 
if 
  $ONMISSION == 0 // $ == int 
jf @PSAVE4_281 
if 
  $27 == 0 // $ == int 
jf @PSAVE4_138 
Pickup.Create($70, #PICKUPSAVE, 3, -992.7, 193.4, 11.4)
$27 = 1 // $ = int 

:PSAVE4_138
if 
   Pickup.Picked_up($70)
jf @PSAVE4_274 
HELP_4118()
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE4_267 
Pickup.Destroy($70)
Pickup.Create($70, #PICKUPSAVE, 3, -992.7, 193.4, 11.4)
fade 1 1000 
0395: clear_area 1 at -996.5 194.1 10.6 range 1.0 
0055: put_player $PLAYER_CHAR at -996.5 194.1 10.6 
0171: set_player $PLAYER_CHAR z_angle_to 80.0 

:PSAVE4_267
HELP_4210()

:PSAVE4_274
jump @PSAVE4_311 

:PSAVE4_281
if 
  $27 == 1 // $ == int 
jf @PSAVE4_311 
Pickup.Destroy($70)
$27 = 0 // $ = int 

:PSAVE4_311
jump @PSAVE4_10 

:PSAVE5
script_name 'PSAVE5' 

:PSAVE5_10
wait 250 
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE5_299 
if 
0121:   player $PLAYER_CHAR in_zone 'BEACH1'  // Ocean Beach
jf @PSAVE5_299 
if 
   Player.Controllable($PLAYER_CHAR)
jf @PSAVE5_299 
if 
  $ONMISSION == 0 // $ == int 
jf @PSAVE5_269 
if 
  $37 == 0 // $ == int 
jf @PSAVE5_132 
Pickup.Create($615, #PICKUPSAVE, 3, $570, $571, $572)
$37 = 1 // $ = int 

:PSAVE5_132
if 
   Pickup.Picked_up($615)
jf @PSAVE5_262 
HELP_4118()
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE5_255 
Pickup.Destroy($615)
Pickup.Create($615, #PICKUPSAVE, 3, $570, $571, $572)
fade 1 1000 
0395: clear_area 1 at 100.9297 -1470.622 9.3871 range 1.0 
0055: put_player $PLAYER_CHAR at 100.9297 -1470.622 9.3871 
0171: set_player $PLAYER_CHAR z_angle_to 218.0275 

:PSAVE5_255
HELP_4210()

:PSAVE5_262
jump @PSAVE5_299 

:PSAVE5_269
if 
  $37 == 1 // $ == int 
jf @PSAVE5_299 
Pickup.Destroy($615)
$37 = 0 // $ = int 

:PSAVE5_299
jump @PSAVE5_10 

:PSAVE6
script_name 'PSAVE6' 

:PSAVE6_10
wait 250 
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE6_311 
if 
0121:   player $PLAYER_CHAR in_zone 'DOCKS'  // Viceport
jf @PSAVE6_311 
if 
   Player.Controllable($PLAYER_CHAR)
jf @PSAVE6_311 
if 
  $ONMISSION == 0 // $ == int 
jf @PSAVE6_281 
if 
  $49 == 0 // $ == int 
jf @PSAVE6_138 
Pickup.Create($680, #PICKUPSAVE, 3, -664.1, -1476.3, 13.8)
$49 = 1 // $ = int 

:PSAVE6_138
if 
   Pickup.Picked_up($680)
jf @PSAVE6_274 
HELP_4118()
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE6_267 
Pickup.Destroy($680)
Pickup.Create($680, #PICKUPSAVE, 3, -664.1, -1476.3, 13.8)
fade 1 1000 
0395: clear_area 1 at -660.0 -1477.8 13.0 range 1.0 
0055: put_player $PLAYER_CHAR at -660.0 -1477.8 13.0 
0171: set_player $PLAYER_CHAR z_angle_to 248.0 

:PSAVE6_267
HELP_4210()

:PSAVE6_274
jump @PSAVE6_311 

:PSAVE6_281
if 
  $49 == 1 // $ == int 
jf @PSAVE6_311 
Pickup.Destroy($680)
$49 = 0 // $ = int 

:PSAVE6_311
jump @PSAVE6_10 

:PSAVE7
script_name 'PSAVE7' 

:PSAVE7_10
wait 250 
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE7_311 
if 
0121:   player $PLAYER_CHAR in_zone 'HAVANA'  // Little Havana
jf @PSAVE7_311 
if 
   Player.Controllable($PLAYER_CHAR)
jf @PSAVE7_311 
if 
  $ONMISSION == 0 // $ == int 
jf @PSAVE7_281 
if 
  $50 == 0 // $ == int 
jf @PSAVE7_138 
Pickup.Create($ICE_CREAM_FACTORY_ASSET, #PICKUPSAVE, 3, -878.5, -575.1, 11.2)
$50 = 1 // $ = int 

:PSAVE7_138
if 
   Pickup.Picked_up($ICE_CREAM_FACTORY_ASSET)
jf @PSAVE7_274 
HELP_4118()
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE7_267 
Pickup.Destroy($ICE_CREAM_FACTORY_ASSET)
Pickup.Create($ICE_CREAM_FACTORY_ASSET, #PICKUPSAVE, 3, -878.5, -575.1, 11.2)
fade 1 1000 
0395: clear_area 1 at -872.0 -573.4 10.4 range 1.0 
0055: put_player $PLAYER_CHAR at -872.0 -573.4 10.4 
0171: set_player $PLAYER_CHAR z_angle_to 277.0 

:PSAVE7_267
HELP_4210()

:PSAVE7_274
jump @PSAVE7_311 

:PSAVE7_281
if 
  $50 == 1 // $ == int 
jf @PSAVE7_311 
Pickup.Destroy($ICE_CREAM_FACTORY_ASSET)
$50 = 0 // $ = int 

:PSAVE7_311
jump @PSAVE7_10 

:PSAVE8
script_name 'PSAVE8' 

:PSAVE8_10
wait 250 
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE8_311 
if 
0121:   player $PLAYER_CHAR in_zone 'HAVANA'  // Little Havana
jf @PSAVE8_311 
if 
   Player.Controllable($PLAYER_CHAR)
jf @PSAVE8_311 
if 
  $ONMISSION == 0 // $ == int 
jf @PSAVE8_281 
if 
  $71 == 0 // $ == int 
jf @PSAVE8_138 
Pickup.Create($74, #PICKUPSAVE, 3, -1059.6, -282.2, 11.2)
$71 = 1 // $ = int 

:PSAVE8_138
if 
   Pickup.Picked_up($74)
jf @PSAVE8_274 
HELP_4118()
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE8_267 
Pickup.Destroy($74)
Pickup.Create($74, #PICKUPSAVE, 3, -1059.6, -282.2, 11.2)
fade 1 1000 
0395: clear_area 1 at -1056.7 -279.7 10.6 range 1.0 
0055: put_player $PLAYER_CHAR at -1056.7 -279.7 10.6 
0171: set_player $PLAYER_CHAR z_angle_to 273.0 

:PSAVE8_267
HELP_4210()

:PSAVE8_274
jump @PSAVE8_311 

:PSAVE8_281
if 
  $71 == 1 // $ == int 
jf @PSAVE8_311 
Pickup.Destroy($74)
$71 = 0 // $ = int 

:PSAVE8_311
jump @PSAVE8_10 

:PSAVE9
script_name 'PSAVE9' 

:PSAVE9_10
wait 250 
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE9_311 
if 
0121:   player $PLAYER_CHAR in_zone 'PORNI'  // Prawn Island
jf @PSAVE9_311 
if 
   Player.Controllable($PLAYER_CHAR)
jf @PSAVE9_311 
if 
  $ONMISSION == 0 // $ == int 
jf @PSAVE9_281 
if 
  $72 == 0 // $ == int 
jf @PSAVE9_138 
Pickup.Create($75, #PICKUPSAVE, 3, 0.0, 957.9, 11.1)
$72 = 1 // $ = int 

:PSAVE9_138
if 
   Pickup.Picked_up($75)
jf @PSAVE9_274 
HELP_4118()
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE9_267 
Pickup.Destroy($75)
Pickup.Create($75, #PICKUPSAVE, 3, 0.0, 957.9, 11.1)
fade 1 1000 
0395: clear_area 1 at 1.4 960.7 10.2 range 1.0 
0055: put_player $PLAYER_CHAR at 1.4 960.7 10.2 
0171: set_player $PLAYER_CHAR z_angle_to 274.3 

:PSAVE9_267
HELP_4210()

:PSAVE9_274
jump @PSAVE9_311 

:PSAVE9_281
if 
  $72 == 1 // $ == int 
jf @PSAVE9_311 
Pickup.Destroy($75)
$72 = 0 // $ = int 

:PSAVE9_311
jump @PSAVE9_10 

:PSAVE10
script_name 'PSAVE10' 

:PSAVE10_10
wait 250 
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE10_311 
if 
0121:   player $PLAYER_CHAR in_zone 'BEACH3'  // Vice Point
jf @PSAVE10_311 
if 
   Player.Controllable($PLAYER_CHAR)
jf @PSAVE10_311 
if 
  $ONMISSION == 0 // $ == int 
jf @PSAVE10_281 
if 
  $73 == 0 // $ == int 
jf @PSAVE10_138 
Pickup.Create($76, #PICKUPSAVE, 3, 499.5, -66.9, 11.4)
$73 = 1 // $ = int 

:PSAVE10_138
if 
   Pickup.Picked_up($76)
jf @PSAVE10_274 
HELP_4118()
if 
   Player.Defined($PLAYER_CHAR)
jf @PSAVE10_267 
Pickup.Destroy($76)
Pickup.Create($76, #PICKUPSAVE, 3, 499.5, -66.9, 11.4)
fade 1 1000 
0395: clear_area 1 at 492.0 -80.6 10.7 range 0.5 
0055: put_player $PLAYER_CHAR at 492.0 -80.6 10.7 
0171: set_player $PLAYER_CHAR z_angle_to 224.5 

:PSAVE10_267
HELP_4210()

:PSAVE10_274
jump @PSAVE10_311 

:PSAVE10_281
if 
  $73 == 1 // $ == int 
jf @PSAVE10_311 
Pickup.Destroy($76)
$73 = 0 // $ = int 

:PSAVE10_311
jump @PSAVE10_10 
