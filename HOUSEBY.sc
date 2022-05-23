:NBMNBUY
script_name 'NBMNBUY' 

:NBMNBUY_10
wait $DEFAULT_WAIT_TIME 
if 
   Player.Defined($PLAYER_CHAR)
jf @NBMNBUY_87 
if 
  $ONMISSION == 0 // $ == int 
jf @NBMNBUY_87 
if 
   Player.Controllable($PLAYER_CHAR)
jf @NBMNBUY_87 
if 
   Pickup.Picked_up($662)
jf @NBMNBUY_87 
start_mission 44  // El Swanko Casa Buy
terminate_this_script 

:NBMNBUY_87
jump @NBMNBUY_10 

:LNKVBY
script_name 'LNKVBY' 

:LNKVBY_10
wait $DEFAULT_WAIT_TIME 
if 
   Player.Defined($PLAYER_CHAR)
jf @LNKVBY_87 
if 
  $ONMISSION == 0 // $ == int 
jf @LNKVBY_87 
if 
   Player.Controllable($PLAYER_CHAR)
jf @LNKVBY_87 
if 
   Pickup.Picked_up($654)
jf @LNKVBY_87 
start_mission 45  // Links View Apartment Buy
terminate_this_script 

:LNKVBY_87
jump @LNKVBY_10 

:HYCOBY
script_name 'HYCOBY' 

:HYCOBY_10
wait $DEFAULT_WAIT_TIME 
if 
   Player.Defined($PLAYER_CHAR)
jf @HYCOBY_87 
if 
  $ONMISSION == 0 // $ == int 
jf @HYCOBY_87 
if 
   Player.Controllable($PLAYER_CHAR)
jf @HYCOBY_87 
if 
   Pickup.Picked_up($666)
jf @HYCOBY_87 
start_mission 46  // Hyman Condo Buy
terminate_this_script 

:HYCOBY_87
jump @HYCOBY_10 

:OCHEBY
script_name 'OCHEBY' 

:OCHEBY_10
wait $DEFAULT_WAIT_TIME 
if 
   Player.Defined($PLAYER_CHAR)
jf @OCHEBY_87 
if 
  $ONMISSION == 0 // $ == int 
jf @OCHEBY_87 
if 
   Player.Controllable($PLAYER_CHAR)
jf @OCHEBY_87 
if 
   Pickup.Picked_up($658)
jf @OCHEBY_87 
start_mission 47  // Ocean Heighs Aprt. Buy
terminate_this_script 

:OCHEBY_87
jump @OCHEBY_10 

:WASHBY
script_name 'WASHBY' 

:WASHBY_10
wait $DEFAULT_WAIT_TIME 
if 
   Player.Defined($PLAYER_CHAR)
jf @WASHBY_87 
if 
  $ONMISSION == 0 // $ == int 
jf @WASHBY_87 
if 
   Player.Controllable($PLAYER_CHAR)
jf @WASHBY_87 
if 
   Pickup.Picked_up($651)
jf @WASHBY_87 
start_mission 48  // 1102 Washington Street Buy
terminate_this_script 

:WASHBY_87
jump @WASHBY_10 

:VCPTBY
script_name 'VCPTBY' 

:VCPTBY_10
wait $DEFAULT_WAIT_TIME 
if 
   Player.Defined($PLAYER_CHAR)
jf @VCPTBY_87 
if 
  $ONMISSION == 0 // $ == int 
jf @VCPTBY_87 
if 
   Player.Controllable($PLAYER_CHAR)
jf @VCPTBY_87 
if 
   Pickup.Picked_up($648)
jf @VCPTBY_87 
start_mission 49  // Vice Point Buy
terminate_this_script 

:VCPTBY_87
jump @VCPTBY_10 

:SKUMBY
script_name 'SKUMBY' 

:SKUMBY_10
wait $DEFAULT_WAIT_TIME 
if 
   Player.Defined($PLAYER_CHAR)
jf @SKUMBY_87 
if 
  $ONMISSION == 0 // $ == int 
jf @SKUMBY_87 
if 
   Player.Controllable($PLAYER_CHAR)
jf @SKUMBY_87 
if 
   Pickup.Picked_up($645)
jf @SKUMBY_87 
start_mission 50  // Skumole Shack Buy
terminate_this_script 

:SKUMBY_87
jump @SKUMBY_10 
