# Selendroid testapp

### An [Selendroid testapp](https://github.com/Hima0X2/MobileAutomation/blob/main/Selendroid%20testapp/com.mobile/src/selendroid-test-app.apk) is automated by implementing test cases ... .Appium is utilized on an emulated device powered by Android Studio.
Here the following tasks are done:
- Selendroid testapp extracted from [Selendroid testapp](https://github.com/Hima0X2/MobileAutomation/blob/main/Selendroid%20testapp/com.mobile/src/selendroid-test-app.apk) is automated by extracting its apk.
- This is mainly a register page where username,email,password,name and programming language have to give.
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
- Open cmd and give ```emulator @emulator_name``` command to get emulator.
- Open cmd and give ```adb devices``` command to get uuid.
- install this app using adb install Selendroid testapp
- Open Appium and start server. Then open inspector tool.
- In the **JSON Representation** section, paste the following desired capabilities after adding your uuid and version:

```
  "appium:platformName": "android",
  "appium:udid": "emulator-5554",
  "appium:deviceName": "your_device_name",

```
- Click **Start Server**.

#### Java IDE

- Clone the repo.

#### Run the Automation Script by the following command:
 ```
 maven clean test 
 ```

