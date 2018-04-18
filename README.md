# Iris-Detection-Android-OpenCV

#### Manual for using the app

  1. End user opens the app
  
      a.   if "openCV Manager" is not installed, it asks to install it
      
      b.   then re-open the app

  2. app asks for camera permissions, 
  
      a.   if granted, user continues to use the app
      
      b.   if not, the app terminates

  3.  Splash screen with app logo fades in -for a second- and fades out -for another second-
  
      a. showing an introduction screen, explaining the idea behind the app itself
      
      b. when user presses "Proceed", 
      
      c. User is then redirected to "Manual" activity, 
            and preview how to use to the app
  
  4. User is redirected to CountdownTimer screen where he sets the amount of seconds s/he wants 
  
      a. toast appears showing conversion of seconds to minutes and seconds 
      
      b. user is directed to a splash screen with the same animation effects like the first splash screen
      
  5. User has landed on the last activity in the app, where the camera detects his/her face and recognizes his face and eye(s)
  
      a. On recognition, the tone/melody stops and timer resumes -if not timer is not instantiated, if instantiated the timer resumes-
      
      b. On NO recognition, the tone/melody starts and timer pauses
     
   6. When the countdownTimer reaches ZERO or `onFinish` 
   
      a.  The app shows an alert dialog 
      
      b.  on dialog dismissal the user redirected to detection activity
  <hr>
  
  The Application was implemented using 
  
    *  Arduino Studio 3.1.1
    
    *  OpenCV Library 3.4.1
    
    *  The countdownTimer used in this project had the `Resume AND Pause` features
     
  <hr>   
     > For any questions, requirements, explanations please email me at
     > ahmedhelsheikh@gmail.com
     
     Thank you and have a nice day...
