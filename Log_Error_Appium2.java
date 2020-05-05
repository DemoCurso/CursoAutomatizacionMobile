[info] [35m[Appium][39m Welcome to Appium v1.15.1
[info] [35m[Appium][39m Non-default server args:
[info] [35m[Appium][39m   allowInsecure: {
[info] [35m[Appium][39m   }
[info] [35m[Appium][39m   denyInsecure: {
[info] [35m[Appium][39m   }
[info] [35m[Appium][39m Appium REST http interface listener started on 0.0.0.0:4723[info] [35m[HTTP][39m [37m-->[39m [37mGET[39m [37m/wd/hub/sessions[39m
[info] [35m[HTTP][39m [90m{}[39m
[debug] [35m[GENERIC][39m Calling AppiumDriver.getSessions() with args: []
[debug] [35m[GENERIC][39m Responding to client with driver.getSessions() result: []
[info] [35m[HTTP][39m [37m<-- GET /wd/hub/sessions [39m[32m200[39m [90m3 ms - 40[39m
[info] [35m[HTTP][39m [90m[39m[info] [35m[HTTP][39m [37m-->[39m [37mPOST[39m [37m/wd/hub/session[39m
[info] [35m[HTTP][39m [90m{"desiredCapabilities":{"buildToolsVersion":"30.0.0-rc2","deviceName":"S8","platformName":"android","newCommandTimeout":0,"connectHardwareKeyboard":true}}[39m
[debug] [35m[MJSONWP][39m Calling AppiumDriver.createSession() with args: [{"buildToolsVersion":"30.0.0-rc2","deviceName":"S8","platformName":"android","newCommandTimeout":0,"connectHardwareKeyboard":true},null,null]
[debug] [35m[BaseDriver][39m Event 'newSessionRequested' logged at 1588116678490 (19:31:18 GMT-0400 (Hora est. Sudamérica Pacífico))
[warn] [35m[Appium][39m 
[warn] [35m[Appium][39m ======================================================================
[warn] [35m[Appium][39m   DEPRECATION WARNING:
[warn] [35m[Appium][39m 
[warn] [35m[Appium][39m   The 'automationName' capability was not provided in the desired 
[warn] [35m[Appium][39m   capabilities for this Android session
[warn] [35m[Appium][39m 
[warn] [35m[Appium][39m   Setting 'automationName=UiAutomator2' by default and using the 
[warn] [35m[Appium][39m   UiAutomator2 Driver
[warn] [35m[Appium][39m 
[warn] [35m[Appium][39m   The next major version of Appium (2.x) will **require** the 
[warn] [35m[Appium][39m   'automationName' capability to be set for all sessions on all 
[warn] [35m[Appium][39m   platforms
[warn] [35m[Appium][39m 
[warn] [35m[Appium][39m   In previous versions (Appium <= 1.13.x), the default was 
[warn] [35m[Appium][39m   'automationName=UiAutomator1'
[warn] [35m[Appium][39m 
[warn] [35m[Appium][39m   If you wish to use that automation instead of UiAutomator2, please 
[warn] [35m[Appium][39m   add 'automationName=UiAutomator1' to your desired capabilities
[warn] [35m[Appium][39m 
[warn] [35m[Appium][39m   For more information about drivers, please visit 
[warn] [35m[Appium][39m   http://appium.io/docs/en/about-appium/intro/ and explore the 
[warn] [35m[Appium][39m   'Drivers' menu
[warn] [35m[Appium][39m 
[warn] [35m[Appium][39m ======================================================================
[warn] [35m[Appium][39m 
[info] [35m[Appium][39m Appium v1.15.1 creating new AndroidUiautomator2Driver (v1.37.2) session
[debug] [35m[BaseDriver][39m Creating session with MJSONWP desired capabilities: {
[debug] [35m[BaseDriver][39m   "buildToolsVersion": "30.0.0-rc2",
[debug] [35m[BaseDriver][39m   "deviceName": "S8",
[debug] [35m[BaseDriver][39m   "platformName": "android",
[debug] [35m[BaseDriver][39m   "newCommandTimeout": 0,
[debug] [35m[BaseDriver][39m   "connectHardwareKeyboard": true
[debug] [35m[BaseDriver][39m }
[warn] [35m[BaseDriver][39m The following capabilities were provided, but are not recognized by Appium:
[warn] [35m[BaseDriver][39m   connectHardwareKeyboard
[info] [35m[BaseDriver][39m Session created with session id: 9a2d96b3-3291-4d99-b669-4c9c634341fd
[info] [35m[UiAutomator2][39m Neither 'app' nor 'appPackage' was set. Starting UiAutomator2 without the target application[info] [35m[ADB][39m Using build tools at 'C:/Users/Admin/AppData/Local/Android/Sdk/build-tools/30.0.0-rc2'
[info] [35m[ADB][39m Using 'adb.exe' from 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe'
[info] [35m[AndroidDriver][39m Retrieving device list
[debug] [35m[ADB][39m Trying to find a connected android device
[debug] [35m[ADB][39m Getting connected devices...
[debug] [35m[ADB][39m Connected devices: [{"udid":"ce12171cdd12e53401","state":"device"}]
[info] [35m[AndroidDriver][39m Using device: ce12171cdd12e53401
[info] [35m[ADB][39m Using build tools at 'C:/Users/Admin/AppData/Local/Android/Sdk/build-tools/30.0.0-rc2'
[info] [35m[ADB][39m Using 'adb.exe' from 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe'
[debug] [35m[ADB][39m Setting device id to ce12171cdd12e53401
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell getprop ro.build.version.sdk'[debug] [35m[ADB][39m Current device property 'ro.build.version.sdk': 28
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell getprop ro.build.version.release'[debug] [35m[ADB][39m Current device property 'ro.build.version.release': 9
[debug] [35m[ADB][39m Device API level: 28
[warn] [35m[UiAutomator2][39m Relaxing hidden api policy
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell settings put global hidden_api_policy_pre_p_apps 1'[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell settings put global hidden_api_policy_p_apps 1'[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell settings put global hidden_api_policy 1'[warn] [35m[AndroidDriver][39m No app sent in, not parsing package/activity
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 wait-for-device'
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell echo ping'[debug] [35m[AndroidDriver][39m Pushing settings apk to device...
[debug] [35m[ADB][39m Getting install status for io.appium.settings
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell dumpsys package io.appium.settings'[debug] [35m[ADB][39m 'io.appium.settings' is installed
[debug] [35m[ADB][39m Getting package info for 'io.appium.settings'
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell dumpsys package io.appium.settings'
[info] [35m[ADB][39m Using build tools at 'C:/Users/Admin/AppData/Local/Android/Sdk/build-tools/30.0.0-rc2'
[info] [35m[ADB][39m Cannot extract apk info using apkanalyzer. Falling back to aapt. Original error: Could not find 'apkanalyzer.bat' in ["C:\\Users\\Admin\\AppData\\Local\\Android\\Sdk\\platform-tools\\apkanalyzer.bat","C:\\Users\\Admin\\AppData\\Local\\Android\\Sdk\\emulator\\apkanalyzer.bat","C:\\Users\\Admin\\AppData\\Local\\Android\\Sdk\\tools\\apkanalyzer.bat","C:\\Users\\Admin\\AppData\\Local\\Android\\Sdk\\tools\\bin\\apkanalyzer.bat","C:\\Users\\Admin\\AppData\\Local\\Android\\Sdk\\build-tools\\30.0.0-rc2\\apkanalyzer.bat"]. Do you have Android Build Tools v 30.0.0-rc2 installed at 'C:\Users\Admin\AppData\Local\Android\Sdk'?
[info] [35m[ADB][39m Using build tools at 'C:/Users/Admin/AppData/Local/Android/Sdk/build-tools/30.0.0-rc2'
[info] [35m[ADB][39m Using 'aapt.exe' from 'C:\Users\Admin\AppData\Local\Android\Sdk\build-tools\30.0.0-rc2\aapt.exe'[debug] [35m[ADB][39m The version code of the installed 'io.appium.settings' is greater than the application version code (26 > 19)
[debug] [35m[ADB][39m There is no need to downgrade 'io.appium.settings'
[debug] [35m[ADB][39m Getting IDs of all 'io.appium.settings' processes
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell 'pgrep --help; echo $?''[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell pgrep -f io\\.appium\\.settings'[debug] [35m[AndroidDriver][39m io.appium.settings is already running. There is no need to reset its permissions.
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell appops set io.appium.settings android\:mock_location allow'[debug] [35m[Logcat][39m Starting logcat capture[debug] [35m[ADB][39m Getting install status for io.appium.uiautomator2.server
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell dumpsys package io.appium.uiautomator2.server'[debug] [35m[ADB][39m 'io.appium.uiautomator2.server' is installed
[debug] [35m[ADB][39m Getting package info for 'io.appium.uiautomator2.server'
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell dumpsys package io.appium.uiautomator2.server'[info] [35m[ADB][39m Using build tools at 'C:/Users/Admin/AppData/Local/Android/Sdk/build-tools/30.0.0-rc2'
[info] [35m[ADB][39m Cannot extract apk info using apkanalyzer. Falling back to aapt. Original error: Could not find 'apkanalyzer.bat' in ["C:\\Users\\Admin\\AppData\\Local\\Android\\Sdk\\platform-tools\\apkanalyzer.bat","C:\\Users\\Admin\\AppData\\Local\\Android\\Sdk\\emulator\\apkanalyzer.bat","C:\\Users\\Admin\\AppData\\Local\\Android\\Sdk\\tools\\apkanalyzer.bat","C:\\Users\\Admin\\AppData\\Local\\Android\\Sdk\\tools\\bin\\apkanalyzer.bat","C:\\Users\\Admin\\AppData\\Local\\Android\\Sdk\\build-tools\\30.0.0-rc2\\apkanalyzer.bat"]. Do you have Android Build Tools v 30.0.0-rc2 installed at 'C:\Users\Admin\AppData\Local\Android\Sdk'?
[debug] [35m[ADB][39m The version name of the installed 'io.appium.uiautomator2.server' is greater or equal to the application version name ('4.3.0' >= '4.3.0')
[debug] [35m[UiAutomator2][39m io.appium.uiautomator2.server installation state: sameVersionInstalled
[debug] [35m[ADB][39m Checking app cert for C:\Users\Admin\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk
[info] [35m[ADB][39m Using build tools at 'C:/Users/Admin/AppData/Local/Android/Sdk/build-tools/30.0.0-rc2'
[info] [35m[ADB][39m Using 'apksigner.bat' from 'C:\Users\Admin\AppData\Local\Android\Sdk\build-tools\30.0.0-rc2\apksigner.bat'
[debug] [35m[ADB][39m Starting 'C:\Users\Admin\AppData\Local\Android\Sdk\build-tools\30.0.0-rc2\apksigner.bat' with args '["verify","--print-certs","C:\\Users\\Admin\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-uiautomator2-server\\apks\\appium-uiautomator2-server-v4.3.0.apk"]'[debug] [35m[ADB][39m 'C:\Users\Admin\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk' is signed with non-default certificate
[info] [35m[ADB][39m Using build tools at 'C:/Users/Admin/AppData/Local/Android/Sdk/build-tools/30.0.0-rc2'
[info] [35m[ADB][39m Using 'zipalign.exe' from 'C:\Users\Admin\AppData\Local\Android\Sdk\build-tools\30.0.0-rc2\zipalign.exe'
[debug] [35m[ADB][39m C:\Users\Admin\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk' is already zip-aligned. Doing nothing
[debug] [35m[ADB][39m Signing 'C:\Users\Admin\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk' with default cert
[debug] [35m[ADB][39m Starting 'C:\Users\Admin\AppData\Local\Android\Sdk\build-tools\30.0.0-rc2\apksigner.bat' with args '["sign","--key","C:\\Users\\Admin\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-adb\\keys\\testkey.pk8","--cert","C:\\Users\\Admin\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-adb\\keys\\testkey.x509.pem","C:\\Users\\Admin\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-uiautomator2-server\\apks\\appium-uiautomator2-server-v4.3.0.apk"]'[debug] [35m[ADB][39m Getting install status for io.appium.uiautomator2.server.test
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell dumpsys package io.appium.uiautomator2.server.test'[debug] [35m[ADB][39m 'io.appium.uiautomator2.server.test' is installed
[debug] [35m[ADB][39m Checking app cert for C:\Users\Admin\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk
[debug] [35m[ADB][39m Starting 'C:\Users\Admin\AppData\Local\Android\Sdk\build-tools\30.0.0-rc2\apksigner.bat' with args '["verify","--print-certs","C:\\Users\\Admin\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-uiautomator2-server\\apks\\appium-uiautomator2-server-debug-androidTest.apk"]'
[debug] [35m[ADB][39m 'C:\Users\Admin\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk' is signed with non-default certificate[debug] [35m[ADB][39m C:\Users\Admin\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk' is already zip-aligned. Doing nothing
[debug] [35m[ADB][39m Signing 'C:\Users\Admin\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk' with default cert
[debug] [35m[ADB][39m Starting 'C:\Users\Admin\AppData\Local\Android\Sdk\build-tools\30.0.0-rc2\apksigner.bat' with args '["sign","--key","C:\\Users\\Admin\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-adb\\keys\\testkey.pk8","--cert","C:\\Users\\Admin\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-adb\\keys\\testkey.x509.pem","C:\\Users\\Admin\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-uiautomator2-server\\apks\\appium-uiautomator2-server-debug-androidTest.apk"]'[debug] [35m[ADB][39m 'io.appium.uiautomator2.server' is installed
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell am force-stop io.appium.uiautomator2.server'[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 uninstall io.appium.uiautomator2.server'[debug] [35m[ADB][39m 'adb uninstall io.appium.uiautomator2.server' command output: Success
[info] [35m[ADB][39m io.appium.uiautomator2.server was successfully uninstalled
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell 'ls -t -1 /data/local/tmp/appium_cache 2>&1 || echo _ERROR_''[debug] [35m[ADB][39m The count of applications in the cache: 10
[info] [35m[ADB][39m The application at 'C:\Users\Admin\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk' is already cached to '/data/local/tmp/appium_cache/0cc1725a60a05dbb5d0d09256f2fc6ece7e3b10f.apk'
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell pm install -r /data/local/tmp/appium_cache/0cc1725a60a05dbb5d0d09256f2fc6ece7e3b10f.apk'[info] [35m[ADB][39m The installation of 'appium-uiautomator2-server-v4.3.0.apk' took 5.864s
[debug] [35m[ADB][39m Install command stdout: Success
[debug] [35m[ADB][39m Uninstalling io.appium.uiautomator2.server.test
[debug] [35m[ADB][39m Getting install status for io.appium.uiautomator2.server.test
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell dumpsys package io.appium.uiautomator2.server.test'[debug] [35m[ADB][39m 'io.appium.uiautomator2.server.test' is installed
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell am force-stop io.appium.uiautomator2.server.test'[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 uninstall io.appium.uiautomator2.server.test'[debug] [35m[ADB][39m 'adb uninstall io.appium.uiautomator2.server.test' command output: Success
[info] [35m[ADB][39m io.appium.uiautomator2.server.test was successfully uninstalled
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell 'ls -t -1 /data/local/tmp/appium_cache 2>&1 || echo _ERROR_''[debug] [35m[ADB][39m The count of applications in the cache: 10
[info] [35m[ADB][39m The application at 'C:\Users\Admin\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk' is already cached to '/data/local/tmp/appium_cache/0beede6c27af5c71c23a0d9d1c82a7a0b18390e0.apk'
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell pm install -r /data/local/tmp/appium_cache/0beede6c27af5c71c23a0d9d1c82a7a0b18390e0.apk'[info] [35m[ADB][39m The installation of 'appium-uiautomator2-server-debug-androidTest.apk' took 8.019s
[debug] [35m[ADB][39m Install command stdout: Success
[debug] [35m[UiAutomator2][39m Waiting up to 30000ms for services to be available
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell pm list instrumentation'[debug] [35m[UiAutomator2][39m Instrumentation target 'io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner' is available
[debug] [35m[UiAutomator2][39m Forwarding UiAutomator2 Server port 6790 to 8200
[debug] [35m[ADB][39m Forwarding system: 8200 to device: 6790
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 forward tcp\:8200 tcp\:6790'
[debug] [35m[UiAutomator2][39m No app capability. Assuming it is already on the device
[debug] [35m[UiAutomator2][39m Performing shallow cleanup of automation leftovers
[debug] [35m[UiAutomator2][39m No obsolete sessions have been detected (Error: socket hang up)
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell am force-stop io.appium.uiautomator2.server.test'[info] [35m[UiAutomator2][39m Starting UIAutomator2 server 4.3.0
[info] [35m[UiAutomator2][39m Using UIAutomator2 server from 'C:\Users\Admin\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk' and test from 'C:\Users\Admin\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk'
[info] [35m[UiAutomator2][39m Waiting up to 30000ms for UiAutomator2 to be online...
[debug] [35m[ADB][39m Creating ADB subprocess with args: ["-P",5037,"-s","ce12171cdd12e53401","shell","am","instrument","-w","io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner"][debug] [35m[WD Proxy][39m Matched '/status' to command name 'getStatus'
[debug] [35m[WD Proxy][39m Proxying [GET /status] to [GET http://localhost:8200/wd/hub/status] with no body
[info] [35m[WD Proxy][39m Got an unexpected response with status undefined: {"code":"ECONNRESET"}[debug] [35m[Instrumentation][39m java.lang.SecurityException: Permission Denial: starting instrumentation ComponentInfo{io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner} from pid=20754, uid=20754 not allowed because package io.appium.uiautomator2.server.test does not have a signature matching the target io.appium.uiautomator2.server
[debug] [35m[Instrumentation][39m 	at android.os.Parcel.createException(Parcel.java:1966)
[debug] [35m[Instrumentation][39m 	at android.os.Parcel.readException(Parcel.java:1934)
[debug] [35m[Instrumentation][39m at android.os.Parcel.readException(Parcel.java:1884)
[debug] [35m[Instrumentation][39m 	at android.app.IActivityManager$Stub$Proxy.startInstrumentation(IActivityManager.java:4365)
[debug] [35m[Instrumentation][39m 	at com.android.commands.am.Instrument.run(Instrument.java:484)
[debug] [35m[Instrumentation][39m 	at com.android.commands.am.Am.runInstrument(Am.java:194)
[debug] [35m[Instrumentation][39m 	at com.android.commands.am.Am.onRun(Am.java:80)
[debug] [35m[Instrumentation][39m 	at com.android.internal.os.BaseCommand.run(BaseCommand.java:54)
[debug] [35m[Instrumentation][39m 	at com.android.commands.am.Am.main(Am.java:50)
[debug] [35m[Instrumentation][39m 	at com.android.internal.os.RuntimeInit.nativeFinishInit(Native Method)
[debug] [35m[Instrumentation][39m 	at com.android.internal.os.RuntimeInit.main(RuntimeInit.java:341)
[debug] [35m[Instrumentation][39m Caused by: android.os.RemoteException: Remote stack trace:
[debug] [35m[Instrumentation][39m 	at com.android.server.am.ActivityManagerService.startInstrumentation(ActivityManagerService.java:26747)
[debug] [35m[Instrumentation][39m 	at android.app.IActivityManager$Stub.onTransact$startInstrumentation$(IActivityManager.java:11158)
[debug] [35m[Instrumentation][39m 	at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:440)
[debug] [35m[Instrumentation][39m 	at com.android.server.am.ActivityManagerService.onTransact(ActivityManagerService.java:4136)
[debug] [35m[Instrumentation][39m 	at android.os.Binder.execTransact(Binder.java:739)[debug] [35m[WD Proxy][39m Matched '/status' to command name 'getStatus'
[debug] [35m[WD Proxy][39m Proxying [GET /status] to [GET http://localhost:8200/wd/hub/status] with no body
[info] [35m[WD Proxy][39m Got an unexpected response with status undefined: {"code":"ECONNRESET"}
[warn] [35m[UiAutomator2][39m The instrumentation process has been unexpectedly terminated. Retrying UiAutomator2 startup (#1 of 1)
[debug] [35m[UiAutomator2][39m Performing strict cleanup of automation leftovers
[debug] [35m[UiAutomator2][39m No obsolete sessions have been detected (Error: socket hang up)
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell am force-stop io.appium.uiautomator2.server.test'[debug] [35m[ADB][39m Attempting to kill all uiautomator processes
[debug] [35m[ADB][39m Getting IDs of all 'uiautomator' processes
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell pgrep -f uiautomator'[info] [35m[ADB][39m No 'uiautomator' process has been found[info] [35m[UiAutomator2][39m Waiting up to 30000ms for UiAutomator2 to be online...
[debug] [35m[ADB][39m Creating ADB subprocess with args: ["-P",5037,"-s","ce12171cdd12e53401","shell","am","instrument","-w","io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner"][debug] [35m[Instrumentation][39m java.lang.SecurityException: Permission Denial: starting instrumentation ComponentInfo{io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner} from pid=21144, uid=21144 not allowed because package io.appium.uiautomator2.server.test does not have a signature matching the target io.appium.uiautomator2.server
[debug] [35m[Instrumentation][39m 	at android.os.Parcel.createException(Parcel.java:1966)
[debug] [35m[Instrumentation][39m 	at android.os.Parcel.readException(Parcel.java:1934)
[debug] [35m[Instrumentation][39m 	at android.os.Parcel.readException(Parcel.java:1884)
[debug] [35m[Instrumentation][39m 	at android.app.IActivityManager$Stub$Proxy.startInstrumentation(IActivityManager.java:4365)
[debug] [35m[Instrumentation][39m 	at com.android.commands.am.Instrument.run(Instrument.java:484)
[debug] [35m[Instrumentation][39m 	at com.android.commands.am.Am.runInstrument(Am.java:194)
[debug] [35m[Instrumentation][39m 	at com.android.commands.am.Am.onRun(Am.java:80)
[debug] [35m[Instrumentation][39m 	at com.android.internal.os.BaseCommand.run(BaseCommand.java:54)
[debug] [35m[Instrumentation][39m 	at com.android.commands.am.Am.main(Am.java:50)
[debug] [35m[Instrumentation][39m 	at com.android.internal.os.RuntimeInit.nativeFinishInit(Native Method)
[debug] [35m[Instrumentation][39m 	at com.android.internal.os.RuntimeInit.main(RuntimeInit.java:341)
[debug] [35m[Instrumentation][39m Caused by: android.os.RemoteException: Remote stack trace:
[debug] [35m[Instrumentation][39m 	at com.android.server.am.ActivityManagerService.startInstrumentation(ActivityManagerService.java:26747)
[debug] [35m[Instrumentation][39m 	at android.app.IActivityManager$Stub.onTransact$startInstrumentation$(IActivityManager.java:11158)
[debug] [35m[Instrumentation][39m 	at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:440)
[debug] [35m[Instrumentation][39m 	at com.android.server.am.ActivityManagerService.onTransact(ActivityManagerService.java:4136)
[debug] [35m[Instrumentation][39m 	at android.os.Binder.execTransact(Binder.java:739)
[debug] [35m[Instrumentation][39m INSTRUMENTATION_STATUS: Error=Permission Denial: starting instrumentation ComponentInfo{io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner} from pid=21144, uid=21144 not allowed because package io.appium.uiautomator2.server.test does not have a signature matching the target io.appium.uiautomator2.server
[debug] [35m[Instrumentation][39m INSTRUMENTATION_STATUS: id=ActivityManagerService
[debug] [35m[Instrumentation][39m INSTRUMENTATION_STATUS_CODE: -1[debug] [35m[Instrumentation][39m The process has exited with code 1
[error] [35m[UiAutomator2][39m Error: The instrumentation process cannot be initialized. Make sure the application under test does not crash and investigate the logcat output.
[error] [35m[UiAutomator2][39m     at Object.wrappedLogger.errorAndThrow (C:\Users\Admin\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-support\lib\logging.js:79:13)
[error] [35m[UiAutomator2][39m     at UiAutomator2Server.errorAndThrow [as startSession] (C:\Users\Admin\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-driver\lib\uiautomator2.js:227:13)
[debug] [35m[UiAutomator2][39m Deleting UiAutomator2 session
[debug] [35m[UiAutomator2][39m Deleting UiAutomator2 server session
[debug] [35m[WD Proxy][39m Matched '/' to command name 'deleteSession'
[warn] [35m[UiAutomator2][39m Did not get confirmation UiAutomator2 deleteSession worked; Error was: UnknownError: An unknown server-side error occurred while processing the command. Original error: Trying to proxy a session command without session id
[debug] [35m[Logcat][39m Stopping logcat capture[debug] [35m[ADB][39m Removing forwarded port socket connection: 8200 
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 forward --remove tcp\:8200'
[info] [35m[UiAutomator2][39m Restoring hidden api policy to the device default configuration
[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell settings delete global hidden_api_policy_pre_p_apps'[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell settings delete global hidden_api_policy_p_apps'[debug] [35m[ADB][39m Running 'C:\Users\Admin\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s ce12171cdd12e53401 shell settings delete global hidden_api_policy'[debug] [35m[BaseDriver][39m Event 'newSessionStarted' logged at 1588116713981 (19:31:53 GMT-0400 (Hora est. Sudamérica Pacífico))
[debug] [35m[MJSONWP][39m Encountered internal error running command: Error: The instrumentation process cannot be initialized. Make sure the application under test does not crash and investigate the logcat output.
[debug] [35m[MJSONWP][39m     at Object.wrappedLogger.errorAndThrow (C:\Users\Admin\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-support\lib\logging.js:79:13)
[debug] [35m[MJSONWP][39m     at UiAutomator2Server.errorAndThrow [as startSession] (C:\Users\Admin\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-driver\lib\uiautomator2.js:227:13)
[info] [35m[HTTP][39m [37m<-- POST /wd/hub/session [39m[31m500[39m [90m35496 ms - 274[39m
[info] [35m[HTTP][39m [90m[39m
[info] [35m[HTTP][39m [37m-->[39m [37mDELETE[39m [37m/wd/hub/session[39m
[info] [35m[HTTP][39m [90m{}[39m
[debug] [35m[HTTP][39m No route found. Setting content type to 'text/plain'
[info] [35m[HTTP][39m [37m<-- DELETE /wd/hub/session [39m[33m404[39m [90m7 ms - 57[39m
[info] [35m[HTTP][39m [90m[39m