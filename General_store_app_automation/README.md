# General_store_app_automation

### An [General store](https://github.com/Hima0X2/MobileAutomation/blob/main/General_store_app_automation/com.mobile/src/General-Store.apk) is automated by implementing test cases ... .Appium is utilized on an emulated device powered by Android Studio.
Here the following tasks are done:
- General store App extracted from [General store app](https://github.com/Hima0X2/MobileAutomation/blob/main/General_store_app_automation/com.mobile/src/General-Store.apk) is automated by extracting its apk.
- Change the country name
- Enter user name
- Changed gendar using radio button
- click let's shop button
### Technology: </br>
- Tool: Selenium Webdriver
- Test_Runner: Appium
- IDE: Eclipse, Android Studio
- Build tool: Maven
- Language: Java

### Prerequisites</br>
- Install Android Studio latest version
- Install Appium 2.11.2
- Install jdk 8 or any LTS version
- Configure **ANDROID_HOME**, **JAVA_HOME** and **GRADLE_HOME**
- Stable internet connection

### Project Run

#### Appium and Android Studio
- Turn on **Developer Options** on your android phone
- Connect your android phone with USB cable/ Create an emulated virtual device via Android Studio and run it.
- Open cmd and give ```adb devices``` command to get uuid.
- install this app using adb install General-Store.apk
- Open Appium and start server. Then open inspector tool.
- In the **JSON Representation** section, paste the following desired capabilities after adding your uuid and version:

```
  "appium:platformName": "android",
  "appium:udid": "emulator-5554",
  "appium:deviceName": "Automation",
  "appium:appPackage": "com.androidsample.generalstore",
  "appium:appActivity": "com.androidsample.generalstore.MainActivity"

```
- Click **Start Server**.

#### Java IDE

- Clone the repo.

#### Run the Automation Script by the following command:
 ```
 maven clean test 
 ```
