:HOUSEBY
script_name 'HOUSEBY'

:HOUSEBY_start
wait $DEFAULT_WAIT_TIME
if
   $HOUSES_BOUGHT > 6
jf @HOUSEBY_checks
terminate_this_script

:HOUSEBY_checks
if and
   Player.Defined($PLAYER_CHAR)
   $ONMISSION == 0 // $ == int 
   Player.Controllable($PLAYER_CHAR)
jf @HOUSEBY_continue

:HOUSEBY_0
if and
   Pickup.Picked_up($HOUSE0_PICKUP)
   $HOUSE0_BOUGHT == 0
jf @HOUSEBY_1
$HOUSETOBUY = 0
start_mission 50  // House Buy

:HOUSEBY_1
if and
   Pickup.Picked_up($HOUSE1_PICKUP)
   $HOUSE1_BOUGHT == 0
jf @HOUSEBY_2
$HOUSETOBUY = 1
start_mission 50  // House Buy

:HOUSEBY_2
if and
   Pickup.Picked_up($HOUSE2_PICKUP)
   $HOUSE2_BOUGHT == 0
jf @HOUSEBY_3
$HOUSETOBUY = 2
start_mission 50  // House Buy

:HOUSEBY_3
if and
   Pickup.Picked_up($HOUSE3_PICKUP)
   $HOUSE3_BOUGHT == 0
jf @HOUSEBY_4
$HOUSETOBUY = 3
start_mission 50  // House Buy

:HOUSEBY_4
if and
   Pickup.Picked_up($HOUSE4_PICKUP)
   $HOUSE4_BOUGHT == 0
jf @HOUSEBY_5
$HOUSETOBUY = 4
start_mission 50  // House Buy

:HOUSEBY_5
if and
   Pickup.Picked_up($HOUSE5_PICKUP)
   $HOUSE5_BOUGHT == 0
jf @HOUSEBY_6
$HOUSETOBUY = 5
start_mission 50  // House Buy

:HOUSEBY_6
if and
   Pickup.Picked_up($HOUSE6_PICKUP)
   $HOUSE6_BOUGHT == 0
jf @HOUSEBY_continue
$HOUSETOBUY = 6
start_mission 50  // House Buy

// :HOUSEBY_7
// if and
//    Pickup.Picked_up($HOUSE7_PICKUP)
//    $HOUSE7_BOUGHT == 0
// jf @HOUSEBY_continue
// $HOUSETOBUY = 7
// start_mission 50  // House Buy

:HOUSEBY_continue
jump @HOUSEBY_start