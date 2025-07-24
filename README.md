# Geo-Alert-Mobile-Application

Geo Alert is an Android application that leverages Google Maps to provide real-time location-based alerts and navigation features. This app is designed to help users set up geo-fences, receive notifications when entering or leaving specific areas, and visualize locations on an interactive map.

## Features

- **Google Maps Integration:** View and interact with maps using Google Maps SDK.
- **Location Tracking:** Get your current location and display it on the map.
- **Geo-fencing:** Set up custom areas (geo-fences) and receive alerts when you enter or exit them.
- **Custom Markers:** Add, edit, and remove markers for important locations.
- **Permissions Handling:** Securely requests and manages location permissions.
- **Responsive UI:** Modern and user-friendly interface.

## How It Works

1. **Launch the App:** Open the Geo Alert app on your Android device.
2. **Grant Permissions:** Allow the app to access your device's location for full functionality.
3. **View Map:** The main screen displays a Google Map centered on your current location.
4. **Add Markers:** Tap on the map to add custom markers for places you want to monitor.
5. **Set Geo-fences:** Define geo-fences around specific locations. The app will monitor your position relative to these areas.
6. **Receive Alerts:** Get notifications when you enter or exit a geo-fenced area.

## How to Use

1. **Clone the Repository:**
   ```sh
   git clone https://github.com/Snehil-0108/Geo-Alert-Mobile-Application.git
   ```
2. **Open in Android Studio:**
   - Open Android Studio and select `Open an existing project`.
   - Navigate to the cloned folder and open it.
3. **Configure API Keys:**
   - Add your Google Maps API key in `app/src/main/res/values/strings.xml` as `my_app_apikey`.
   - (Optional) Add any other required keys or secrets as described in the documentation.
4. **Build and Run:**
   - Connect your Android device or start an emulator.
   - Click `Run` to build and launch the app.

## Requirements

- Android Studio (latest version recommended)
- Android SDK 26 or higher
- Google Maps API key

## Security
Sensitive files and credentials (API keys, keystores, etc.) are excluded from version control via `.gitignore`. Make sure to add your own keys locally.

## Contributing
Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

## License
This project is licensed under the MIT License.
