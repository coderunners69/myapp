# Mess Companion

Mess Companion is an Android app that allows university students to view the weekly mess menu. It has authentication for students and admins.

## Features

- Students can view the mess menu for the current week
- Admins can update the mess menu on a weekly basis
- User authentication via Firebase
- Students can register with their university email ID
- Admin portal for updating menu

## Tech Stack

- Kotlin
- Firebase Authentication
- Firebase Cloud Firestore
- MVVM Architecture
- Navigation Components
- ViewBinding
- Coroutines

## Screens

The app contains the following screens:

- Login Screen
  - Login options for students and admin
- Sign Up Screen
  - Registration for students 
- Home Screen
  - Shows menu of the week
  - Option to logout
- Admin Panel
  - Upload new menu
  
## Usage  

**Students:**

- Install the app and register
- Login to view the weekly mess menu

**Admin:**

- Login using admin credentials
- Update or upload the menu for upcoming week

## Setup

- Clone the repository
- Get Firebase project config files
  - google-services.json
  - FirebaseService.kt
- Add the config files to the app
- Build and run the app

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)
