Feature: User Scheduling Appointment
  
  Schedule Appointment API Smoke Test Script

  Scenario: create a new appointment
   Given create first appointment

  Scenario: create second appointment
    Given create second appointment

    
  Scenario: system not allow to create third appointment at same time 
  Given create third appointment
  
  
  
  Scenario: get office list
  Given get office names
  
  
  Scenario: get all staff list
  Given get staff list