
[debug] [35m[MJSONWP] [39m Encountered internal error running command: Error: You must include a platformName capability
[debug] [35m[MJSONWP] [39m     at AppiumDriver.getDriverAndVersionForCaps (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:195:13)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.getDriverAndVersionForCaps [as createSession] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:300:66)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\basedriver\driver.js:376:19)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:482:26)
[debug] [35m[MJSONWP] [39m     at executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\protocol\protocol.js:306:34)
[debug] [35m[MJSONWP] [39m     at asyncHandler (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\protocol\protocol.js:432:15)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\route.js:137:13)
[debug] [35m[MJSONWP] [39m     at Route.dispatch (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\route.js:112:3)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:281:22
[debug] [35m[MJSONWP] [39m     at Function.process_params (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:335:12)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:275:10)
[debug] [35m[MJSONWP] [39m     at logger (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\morgan\index.js:144:5)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at trim_prefix (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:317:13)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:284:7
[debug] [35m[MJSONWP] [39m     at Function.process_params (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:335:12)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:275:10)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\body-parser\lib\read.js:130:5
[debug] [35m[MJSONWP] [39m     at invokeCallback (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:224:16)
[debug] [35m[MJSONWP] [39m     at done (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:213:7)
[debug] [35m[MJSONWP] [39m     at IncomingMessage.onEnd (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:273:7)
[debug] [35m[MJSONWP] [39m     at IncomingMessage.emit (events.js:182:13)
[debug] [35m[MJSONWP] [39m     at endReadableNT (_stream_readable.js:1090:12)
[debug] [35m[MJSONWP] [39m     at process._tickCallback (internal/process/next_tick.js:63:19)
[info] [35m[HTTP] [39m [37m<-- POST /wd/hub/session [39m [31m500 [39m [90m57 ms - 179 [39m
[info] [35m[HTTP] [39m [90m [39m[info] [35m[HTTP] [39m [37m--> [39m [37mPOST [39m [37m/wd/hub/session [39m
[info] [35m[HTTP] [39m [90m{"desiredCapabilities":{"automationName":"UiAautomator2","deviceName":"Mate9","platformname":"android","newCommandTimeout":0,"connectHardwareKeyboard":true}} [39m
[debug] [35m[MJSONWP] [39m Calling AppiumDriver.createSession() with args: [{"automationName":"UiAautomator2","deviceName":"Mate9","platformname":"android","newCommandTimeout":0,"connectHardwareKeyboard":true},null,null]
[debug] [35m[BaseDriver] [39m Event 'newSessionRequested' logged at 1588030900658 (19:41:40 GMT-0400 (Hora est. Sudamérica Pacífico))
[debug] [35m[BaseDriver] [39m Event 'newSessionStarted' logged at 1588030900658 (19:41:40 GMT-0400 (Hora est. Sudamérica Pacífico))
[debug] [35m[MJSONWP] [39m Encountered internal error running command: Error: You must include a platformName capability
[debug] [35m[MJSONWP] [39m     at AppiumDriver.getDriverAndVersionForCaps (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:195:13)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.getDriverAndVersionForCaps [as createSession] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:300:66)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\basedriver\driver.js:376:19)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:482:26)
[debug] [35m[MJSONWP] [39m     at executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\protocol\protocol.js:306:34)
[debug] [35m[MJSONWP] [39m     at asyncHandler (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\protocol\protocol.js:432:15)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\route.js:137:13)
[debug] [35m[MJSONWP] [39m     at Route.dispatch (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\route.js:112:3)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:281:22
[debug] [35m[MJSONWP] [39m     at Function.process_params (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:335:12)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:275:10)
[debug] [35m[MJSONWP] [39m     at logger (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\morgan\index.js:144:5)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at trim_prefix (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:317:13)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:284:7
[debug] [35m[MJSONWP] [39m     at Function.process_params (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:335:12)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:275:10)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\body-parser\lib\read.js:130:5
[debug] [35m[MJSONWP] [39m     at invokeCallback (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:224:16)
[debug] [35m[MJSONWP] [39m     at done (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:213:7)
[debug] [35m[MJSONWP] [39m     at IncomingMessage.onEnd (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:273:7)
[debug] [35m[MJSONWP] [39m     at IncomingMessage.emit (events.js:182:13)
[debug] [35m[MJSONWP] [39m     at endReadableNT (_stream_readable.js:1090:12)
[debug] [35m[MJSONWP] [39m     at process._tickCallback (internal/process/next_tick.js:63:19)
[info] [35m[HTTP] [39m [37m<-- POST /wd/hub/session [39m [31m500 [39m [90m7 ms - 179 [39m
[info] [35m[HTTP] [39m [90m [39m
[info] [35m[HTTP] [39m [37m--> [39m [37mDELETE [39m [37m/wd/hub/session [39m
[info] [35m[HTTP] [39m [90m{} [39m
[debug] [35m[HTTP] [39m No route found. Setting content type to 'text/plain'
[info] [35m[HTTP] [39m [37m<-- DELETE /wd/hub/session [39m [33m404 [39m [90m1 ms - 57 [39m
[info] [35m[HTTP] [39m [90m [39m[info] [35m[HTTP] [39m [37m--> [39m [37mPOST [39m [37m/wd/hub/session [39m
[info] [35m[HTTP] [39m [90m{"desiredCapabilities":{"automationName":"UiAautomator2","deviceName":"Mate9","platformName":"android","newCommandTimeout":0,"connectHardwareKeyboard":true}} [39m
[debug] [35m[MJSONWP] [39m Calling AppiumDriver.createSession() with args: [{"automationName":"UiAautomator2","deviceName":"Mate9","platformName":"android","newCommandTimeout":0,"connectHardwareKeyboard":true},null,null]
[debug] [35m[BaseDriver] [39m Event 'newSessionRequested' logged at 1588030916908 (19:41:56 GMT-0400 (Hora est. Sudamérica Pacífico))
[debug] [35m[BaseDriver] [39m Event 'newSessionStarted' logged at 1588030916925 (19:41:56 GMT-0400 (Hora est. Sudamérica Pacífico))
[debug] [35m[MJSONWP] [39m Encountered internal error running command: Error: Could not find a driver for automationName 'UiAautomator2' and platformName 'android'. Please check your desired capabilities.
[debug] [35m[MJSONWP] [39m     at AppiumDriver.getDriverAndVersionForCaps (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:226:11)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.getDriverAndVersionForCaps [as createSession] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:300:66)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\basedriver\driver.js:376:19)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:482:26)
[debug] [35m[MJSONWP] [39m     at executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\protocol\protocol.js:306:34)
[debug] [35m[MJSONWP] [39m     at asyncHandler (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\protocol\protocol.js:432:15)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\route.js:137:13)
[debug] [35m[MJSONWP] [39m     at Route.dispatch (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\route.js:112:3)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:281:22
[debug] [35m[MJSONWP] [39m     at Function.process_params (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:335:12)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:275:10)
[debug] [35m[MJSONWP] [39m     at logger (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\morgan\index.js:144:5)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at trim_prefix (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:317:13)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:284:7
[debug] [35m[MJSONWP] [39m     at Function.process_params (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:335:12)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:275:10)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\body-parser\lib\read.js:130:5
[debug] [35m[MJSONWP] [39m     at invokeCallback (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:224:16)
[debug] [35m[MJSONWP] [39m     at done (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:213:7)
[debug] [35m[MJSONWP] [39m     at IncomingMessage.onEnd (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:273:7)
[debug] [35m[MJSONWP] [39m     at IncomingMessage.emit (events.js:182:13)
[debug] [35m[MJSONWP] [39m     at endReadableNT (_stream_readable.js:1090:12)
[debug] [35m[MJSONWP] [39m     at process._tickCallback (internal/process/next_tick.js:63:19)
[info] [35m[HTTP] [39m [37m<-- POST /wd/hub/session [39m [31m500 [39m [90m26 ms - 263 [39m
[info] [35m[HTTP] [39m [90m [39m[info] [35m[HTTP] [39m [37m--> [39m [37mPOST [39m [37m/wd/hub/session [39m
[info] [35m[HTTP] [39m [90m{"desiredCapabilities":{"automationName":"UiAautomator1","deviceName":"Mate9","platformName":"android","newCommandTimeout":0,"connectHardwareKeyboard":true}} [39m
[debug] [35m[MJSONWP] [39m Calling AppiumDriver.createSession() with args: [{"automationName":"UiAautomator1","deviceName":"Mate9","platformName":"android","newCommandTimeout":0,"connectHardwareKeyboard":true},null,null]
[debug] [35m[BaseDriver] [39m Event 'newSessionRequested' logged at 1588030925213 (19:42:05 GMT-0400 (Hora est. Sudamérica Pacífico))
[debug] [35m[BaseDriver] [39m Event 'newSessionStarted' logged at 1588030925214 (19:42:05 GMT-0400 (Hora est. Sudamérica Pacífico))
[debug] [35m[MJSONWP] [39m Encountered internal error running command: Error: Could not find a driver for automationName 'UiAautomator1' and platformName 'android'. Please check your desired capabilities.
[debug] [35m[MJSONWP] [39m     at AppiumDriver.getDriverAndVersionForCaps (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:226:11)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.getDriverAndVersionForCaps [as createSession] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:300:66)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\basedriver\driver.js:376:19)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:482:26)
[debug] [35m[MJSONWP] [39m     at executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\protocol\protocol.js:306:34)
[debug] [35m[MJSONWP] [39m     at asyncHandler (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\protocol\protocol.js:432:15)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\route.js:137:13)
[debug] [35m[MJSONWP] [39m     at Route.dispatch (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\route.js:112:3)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:281:22
[debug] [35m[MJSONWP] [39m     at Function.process_params (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:335:12)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:275:10)
[debug] [35m[MJSONWP] [39m     at logger (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\morgan\index.js:144:5)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at trim_prefix (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:317:13)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:284:7
[debug] [35m[MJSONWP] [39m     at Function.process_params (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:335:12)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:275:10)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\body-parser\lib\read.js:130:5
[debug] [35m[MJSONWP] [39m     at invokeCallback (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:224:16)
[debug] [35m[MJSONWP] [39m     at done (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:213:7)
[debug] [35m[MJSONWP] [39m     at IncomingMessage.onEnd (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:273:7)
[debug] [35m[MJSONWP] [39m     at IncomingMessage.emit (events.js:182:13)
[debug] [35m[MJSONWP] [39m     at endReadableNT (_stream_readable.js:1090:12)
[debug] [35m[MJSONWP] [39m     at process._tickCallback (internal/process/next_tick.js:63:19)
[info] [35m[HTTP] [39m [37m<-- POST /wd/hub/session [39m [31m500 [39m [90m9 ms - 263 [39m
[info] [35m[HTTP] [39m [90m [39m[info] [35m[HTTP] [39m [37m--> [39m [37mPOST [39m [37m/wd/hub/session [39m
[info] [35m[HTTP] [39m [90m{"desiredCapabilities":{"automationName":"UiAautomator1","deviceName":"Mate9","platformName":"android","newCommandTimeout":0,"connectHardwareKeyboard":true}} [39m
[debug] [35m[MJSONWP] [39m Calling AppiumDriver.createSession() with args: [{"automationName":"UiAautomator1","deviceName":"Mate9","platformName":"android","newCommandTimeout":0,"connectHardwareKeyboard":true},null,null]
[debug] [35m[BaseDriver] [39m Event 'newSessionRequested' logged at 1588030965165 (19:42:45 GMT-0400 (Hora est. Sudamérica Pacífico))
[debug] [35m[BaseDriver] [39m Event 'newSessionStarted' logged at 1588030965166 (19:42:45 GMT-0400 (Hora est. Sudamérica Pacífico))
[debug] [35m[MJSONWP] [39m Encountered internal error running command: Error: Could not find a driver for automationName 'UiAautomator1' and platformName 'android'. Please check your desired capabilities.
[debug] [35m[MJSONWP] [39m     at AppiumDriver.getDriverAndVersionForCaps (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:226:11)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.getDriverAndVersionForCaps [as createSession] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:300:66)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\basedriver\driver.js:376:19)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:482:26)
[debug] [35m[MJSONWP] [39m     at executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\protocol\protocol.js:306:34)
[debug] [35m[MJSONWP] [39m     at asyncHandler (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\protocol\protocol.js:432:15)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\route.js:137:13)
[debug] [35m[MJSONWP] [39m     at Route.dispatch (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\route.js:112:3)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:281:22
[debug] [35m[MJSONWP] [39m     at Function.process_params (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:335:12)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:275:10)
[debug] [35m[MJSONWP] [39m     at logger (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\morgan\index.js:144:5)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at trim_prefix (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:317:13)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:284:7
[debug] [35m[MJSONWP] [39m     at Function.process_params (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:335:12)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:275:10)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\body-parser\lib\read.js:130:5
[debug] [35m[MJSONWP] [39m     at invokeCallback (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:224:16)
[debug] [35m[MJSONWP] [39m     at done (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:213:7)
[debug] [35m[MJSONWP] [39m     at IncomingMessage.onEnd (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:273:7)
[debug] [35m[MJSONWP] [39m     at IncomingMessage.emit (events.js:182:13)
[debug] [35m[MJSONWP] [39m     at endReadableNT (_stream_readable.js:1090:12)
[debug] [35m[MJSONWP] [39m     at process._tickCallback (internal/process/next_tick.js:63:19)
[info] [35m[HTTP] [39m [37m<-- POST /wd/hub/session [39m [31m500 [39m [90m10 ms - 263 [39m
[info] [35m[HTTP] [39m [90m [39m
[info] [35m[HTTP] [39m [37m--> [39m [37mDELETE [39m [37m/wd/hub/session [39m
[info] [35m[HTTP] [39m [90m{} [39m
[debug] [35m[HTTP] [39m No route found. Setting content type to 'text/plain'
[info] [35m[HTTP] [39m [37m<-- DELETE /wd/hub/session [39m [33m404 [39m [90m1 ms - 57 [39m
[info] [35m[HTTP] [39m [90m [39m[info] [35m[HTTP] [39m [37m--> [39m [37mPOST [39m [37m/wd/hub/session [39m
[info] [35m[HTTP] [39m [90m{"desiredCapabilities":{"automationName":"UiAautomator1","deviceName":"Mate9","platformName":"android","newCommandTimeout":0,"connectHardwareKeyboard":true}} [39m
[debug] [35m[MJSONWP] [39m Calling AppiumDriver.createSession() with args: [{"automationName":"UiAautomator1","deviceName":"Mate9","platformName":"android","newCommandTimeout":0,"connectHardwareKeyboard":true},null,null]
[debug] [35m[BaseDriver] [39m Event 'newSessionRequested' logged at 1588031059830 (19:44:19 GMT-0400 (Hora est. Sudamérica Pacífico))
[debug] [35m[BaseDriver] [39m Event 'newSessionStarted' logged at 1588031059831 (19:44:19 GMT-0400 (Hora est. Sudamérica Pacífico))
[debug] [35m[MJSONWP] [39m Encountered internal error running command: Error: Could not find a driver for automationName 'UiAautomator1' and platformName 'android'. Please check your desired capabilities.
[debug] [35m[MJSONWP] [39m     at AppiumDriver.getDriverAndVersionForCaps (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:226:11)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.getDriverAndVersionForCaps [as createSession] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:300:66)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\basedriver\driver.js:376:19)
[debug] [35m[MJSONWP] [39m     at AppiumDriver.executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\lib\appium.js:482:26)
[debug] [35m[MJSONWP] [39m     at executeCommand (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\protocol\protocol.js:306:34)
[debug] [35m[MJSONWP] [39m     at asyncHandler (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-base-driver\lib\protocol\protocol.js:432:15)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\route.js:137:13)
[debug] [35m[MJSONWP] [39m     at Route.dispatch (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\route.js:112:3)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:281:22
[debug] [35m[MJSONWP] [39m     at Function.process_params (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:335:12)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:275:10)
[debug] [35m[MJSONWP] [39m     at logger (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\morgan\index.js:144:5)
[debug] [35m[MJSONWP] [39m     at Layer.handle [as handle_request] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\layer.js:95:5)
[debug] [35m[MJSONWP] [39m     at trim_prefix (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:317:13)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:284:7
[debug] [35m[MJSONWP] [39m     at Function.process_params (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:335:12)
[debug] [35m[MJSONWP] [39m     at next (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\express\lib\router\index.js:275:10)
[debug] [35m[MJSONWP] [39m     at C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\body-parser\lib\read.js:130:5
[debug] [35m[MJSONWP] [39m     at invokeCallback (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:224:16)
[debug] [35m[MJSONWP] [39m     at done (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:213:7)
[debug] [35m[MJSONWP] [39m     at IncomingMessage.onEnd (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\raw-body\index.js:273:7)
[debug] [35m[MJSONWP] [39m     at IncomingMessage.emit (events.js:182:13)
[debug] [35m[MJSONWP] [39m     at endReadableNT (_stream_readable.js:1090:12)
[debug] [35m[MJSONWP] [39m     at process._tickCallback (internal/process/next_tick.js:63:19)
[info] [35m[HTTP] [39m [37m<-- POST /wd/hub/session [39m [31m500 [39m [90m10 ms - 263 [39m
[info] [35m[HTTP] [39m [90m [39m
[info] [35m[HTTP] [39m [37m--> [39m [37mDELETE [39m [37m/wd/hub/session [39m
[info] [35m[HTTP] [39m [90m{} [39m
[debug] [35m[HTTP] [39m No route found. Setting content type to 'text/plain'
[info] [35m[HTTP] [39m [37m<-- DELETE /wd/hub/session [39m [33m404 [39m [90m1 ms - 57 [39m
[info] [35m[HTTP] [39m [90m [39m[info] [35m[HTTP] [39m [37m--> [39m [37mPOST [39m [37m/wd/hub/session [39m
[info] [35m[HTTP] [39m [90m{"desiredCapabilities":{"deviceName":"Mate9","platformName":"android","newCommandTimeout":0,"connectHardwareKeyboard":true}} [39m
[debug] [35m[MJSONWP] [39m Calling AppiumDriver.createSession() with args: [{"deviceName":"Mate9","platformName":"android","newCommandTimeout":0,"connectHardwareKeyboard":true},null,null]
[debug] [35m[BaseDriver] [39m Event 'newSessionRequested' logged at 1588031072651 (19:44:32 GMT-0400 (Hora est. Sudamérica Pacífico))
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m ======================================================================
[warn] [35m[Appium] [39m   DEPRECATION WARNING:
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   The 'automationName' capability was not provided in the desired
[warn] [35m[Appium] [39m   capabilities for this Android session
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   Setting 'automationName=UiAutomator2' by default and using the
[warn] [35m[Appium] [39m   UiAutomator2 Driver
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   The next major version of Appium (2.x) will **require** the
[warn] [35m[Appium] [39m   'automationName' capability to be set for all sessions on all
[warn] [35m[Appium] [39m   platforms
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   In previous versions (Appium <= 1.13.x), the default was
[warn] [35m[Appium] [39m   'automationName=UiAutomator1'
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   If you wish to use that automation instead of UiAutomator2, please
[warn] [35m[Appium] [39m   add 'automationName=UiAutomator1' to your desired capabilities
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   For more information about drivers, please visit
[warn] [35m[Appium] [39m   http://appium.io/docs/en/about-appium/intro/ and explore the
[warn] [35m[Appium] [39m   'Drivers' menu
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m ======================================================================
[warn] [35m[Appium] [39m
[info] [35m[Appium] [39m Appium v1.15.1 creating new AndroidUiautomator2Driver (v1.37.2) session
[debug] [35m[BaseDriver] [39m Creating session with MJSONWP desired capabilities: {
[debug] [35m[BaseDriver] [39m   "deviceName": "Mate9",
[debug] [35m[BaseDriver] [39m   "platformName": "android",
[debug] [35m[BaseDriver] [39m   "newCommandTimeout": 0,
[debug] [35m[BaseDriver] [39m   "connectHardwareKeyboard": true
[debug] [35m[BaseDriver] [39m }
[warn] [35m[BaseDriver] [39m The following capabilities were provided, but are not recognized by Appium:
[warn] [35m[BaseDriver] [39m   connectHardwareKeyboard
[info] [35m[BaseDriver] [39m Session created with session id: 41bfbbe2-58b7-4c26-9056-f8e30a4ac179
[info] [35m[UiAutomator2] [39m Neither 'app' nor 'appPackage' was set. Starting UiAutomator2 without the target application[info] [35m[ADB] [39m Found 1 'build-tools' folders under 'C:\Users\ACL\AppData\Local\Android\Sdk' (newest first):
[info] [35m[ADB] [39m     C:/Users/ACL/AppData/Local/Android/Sdk/build-tools/29.0.3
[info] [35m[ADB] [39m Using 'adb.exe' from 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe'
[info] [35m[AndroidDriver] [39m Retrieving device list
[debug] [35m[ADB] [39m Trying to find a connected android device
[debug] [35m[ADB] [39m Getting connected devices...[debug] [35m[ADB] [39m Connected devices: [{"udid":"AHK7N17213003661","state":"device"}]
[info] [35m[AndroidDriver] [39m Using device: AHK7N17213003661
[info] [35m[ADB] [39m Using 'adb.exe' from 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe'
[debug] [35m[ADB] [39m Setting device id to AHK7N17213003661
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell getprop ro.build.version.sdk'
[debug] [35m[ADB] [39m Current device property 'ro.build.version.sdk': 28
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell getprop ro.build.version.release'[debug] [35m[ADB] [39m Current device property 'ro.build.version.release': 9
[debug] [35m[ADB] [39m Device API level: 28
[warn] [35m[UiAutomator2] [39m Relaxing hidden api policy
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell settings put global hidden_api_policy_pre_p_apps 1'[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell settings put global hidden_api_policy_p_apps 1'[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell settings put global hidden_api_policy 1'[warn] [35m[AndroidDriver] [39m No app sent in, not parsing package/activity
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 wait-for-device'[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell echo ping'
[debug] [35m[AndroidDriver] [39m Pushing settings apk to device...
[debug] [35m[ADB] [39m Getting install status for io.appium.settings
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell dumpsys package io.appium.settings'[debug] [35m[ADB] [39m 'io.appium.settings' is installed
[debug] [35m[ADB] [39m Getting package info for 'io.appium.settings'
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell dumpsys package io.appium.settings'[info] [35m[ADB] [39m Cannot extract apk info using apkanalyzer. Falling back to aapt. Original error: Could not find 'apkanalyzer.bat' in ["C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\platform-tools\\apkanalyzer.bat","C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\emulator\\apkanalyzer.bat","C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\tools\\apkanalyzer.bat","C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\tools\\bin\\apkanalyzer.bat","C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\build-tools\\29.0.3\\apkanalyzer.bat"]. Do you have Android Build Tools installed at 'C:\Users\ACL\AppData\Local\Android\Sdk'?
[info] [35m[ADB] [39m Using 'aapt.exe' from 'C:\Users\ACL\AppData\Local\Android\Sdk\build-tools\29.0.3\aapt.exe'
[debug] [35m[ADB] [39m The version name of the installed 'io.appium.settings' is greater or equal to the application version name ('2.14.2' >= '2.14.2')
[debug] [35m[ADB] [39m There is no need to install/upgrade 'C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\io.appium.settings\apks\settings_apk-debug.apk'
[debug] [35m[ADB] [39m Getting IDs of all 'io.appium.settings' processes
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell 'pgrep --help; echo $?''[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell pgrep -f io\\.appium\\.settings'[debug] [35m[AndroidDriver] [39m io.appium.settings is already running. There is no need to reset its permissions.
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell appops set io.appium.settings android\:mock_location allow'[debug] [35m[Logcat] [39m Starting logcat capture
[debug] [35m[ADB] [39m Getting install status for io.appium.uiautomator2.server
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell dumpsys package io.appium.uiautomator2.server'[debug] [35m[ADB] [39m 'io.appium.uiautomator2.server' is installed
[debug] [35m[ADB] [39m Getting package info for 'io.appium.uiautomator2.server'
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell dumpsys package io.appium.uiautomator2.server'[info] [35m[ADB] [39m Cannot extract apk info using apkanalyzer. Falling back to aapt. Original error: Could not find 'apkanalyzer.bat' in ["C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\platform-tools\\apkanalyzer.bat","C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\emulator\\apkanalyzer.bat","C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\tools\\apkanalyzer.bat","C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\tools\\bin\\apkanalyzer.bat","C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\build-tools\\29.0.3\\apkanalyzer.bat"]. Do you have Android Build Tools installed at 'C:\Users\ACL\AppData\Local\Android\Sdk'?[debug] [35m[ADB] [39m The version name of the installed 'io.appium.uiautomator2.server' is greater or equal to the application version name ('4.3.0' >= '4.3.0')
[debug] [35m[UiAutomator2] [39m io.appium.uiautomator2.server installation state: sameVersionInstalled
[debug] [35m[ADB] [39m Checking app cert for C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk
[info] [35m[ADB] [39m Using 'apksigner.bat' from 'C:\Users\ACL\AppData\Local\Android\Sdk\build-tools\29.0.3\apksigner.bat'
[debug] [35m[ADB] [39m Starting 'C:\Users\ACL\AppData\Local\Android\Sdk\build-tools\29.0.3\apksigner.bat' with args '["verify","--print-certs","C:\\Users\\ACL\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-uiautomator2-server\\apks\\appium-uiautomator2-server-v4.3.0.apk"]'
[debug] [35m[ADB] [39m 'C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk' is signed with non-default certificate
[info] [35m[ADB] [39m Using 'zipalign.exe' from 'C:\Users\ACL\AppData\Local\Android\Sdk\build-tools\29.0.3\zipalign.exe'[debug] [35m[ADB] [39m C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk' is already zip-aligned. Doing nothing
[debug] [35m[ADB] [39m Signing 'C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk' with default cert
[debug] [35m[ADB] [39m Starting 'C:\Users\ACL\AppData\Local\Android\Sdk\build-tools\29.0.3\apksigner.bat' with args '["sign","--key","C:\\Users\\ACL\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-adb\\keys\\testkey.pk8","--cert","C:\\Users\\ACL\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-adb\\keys\\testkey.x509.pem","C:\\Users\\ACL\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-uiautomator2-server\\apks\\appium-uiautomator2-server-v4.3.0.apk"]'
[debug] [35m[ADB] [39m Getting install status for io.appium.uiautomator2.server.test
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell dumpsys package io.appium.uiautomator2.server.test'[debug] [35m[ADB] [39m 'io.appium.uiautomator2.server.test' is installed
[debug] [35m[ADB] [39m Checking app cert for C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk
[debug] [35m[ADB] [39m Starting 'C:\Users\ACL\AppData\Local\Android\Sdk\build-tools\29.0.3\apksigner.bat' with args '["verify","--print-certs","C:\\Users\\ACL\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-uiautomator2-server\\apks\\appium-uiautomator2-server-debug-androidTest.apk"]'
[debug] [35m[ADB] [39m 'C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk' is signed with non-default certificate[debug] [35m[ADB] [39m C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk' is already zip-aligned. Doing nothing
[debug] [35m[ADB] [39m Signing 'C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk' with default cert
[debug] [35m[ADB] [39m Starting 'C:\Users\ACL\AppData\Local\Android\Sdk\build-tools\29.0.3\apksigner.bat' with args '["sign","--key","C:\\Users\\ACL\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-adb\\keys\\testkey.pk8","--cert","C:\\Users\\ACL\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-adb\\keys\\testkey.x509.pem","C:\\Users\\ACL\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-uiautomator2-server\\apks\\appium-uiautomator2-server-debug-androidTest.apk"]'
[info] [35m[UiAutomator2] [39m Server packages are going to be (re)installed
[info] [35m[UiAutomator2] [39m Full packages reinstall is going to be performed
[debug] [35m[ADB] [39m Uninstalling io.appium.uiautomator2.server
[debug] [35m[ADB] [39m Getting install status for io.appium.uiautomator2.server
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell dumpsys package io.appium.uiautomator2.server'[debug] [35m[ADB] [39m 'io.appium.uiautomator2.server' is installed
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell am force-stop io.appium.uiautomator2.server'[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 uninstall io.appium.uiautomator2.server'[debug] [35m[ADB] [39m 'adb uninstall io.appium.uiautomator2.server' command output: Success
[info] [35m[ADB] [39m io.appium.uiautomator2.server was successfully uninstalled
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell 'ls -t -1 /data/local/tmp/appium_cache 2>&1 || echo _ERROR_''
[debug] [35m[ADB] [39m The count of applications in the cache: 3
[info] [35m[ADB] [39m The application at 'C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk' is already cached to '/data/local/tmp/appium_cache/0cc1725a60a05dbb5d0d09256f2fc6ece7e3b10f.apk'
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell pm install -r /data/local/tmp/appium_cache/0cc1725a60a05dbb5d0d09256f2fc6ece7e3b10f.apk'[info] [35m[ADB] [39m The installation of 'appium-uiautomator2-server-v4.3.0.apk' took 0.554s
[debug] [35m[ADB] [39m Install command stdout: Success
[debug] [35m[ADB] [39m Uninstalling io.appium.uiautomator2.server.test
[debug] [35m[ADB] [39m Getting install status for io.appium.uiautomator2.server.test
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell dumpsys package io.appium.uiautomator2.server.test'
[debug] [35m[ADB] [39m 'io.appium.uiautomator2.server.test' is installed
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell am force-stop io.appium.uiautomator2.server.test'[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 uninstall io.appium.uiautomator2.server.test'[debug] [35m[ADB] [39m 'adb uninstall io.appium.uiautomator2.server.test' command output: Success
[info] [35m[ADB] [39m io.appium.uiautomator2.server.test was successfully uninstalled
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell 'ls -t -1 /data/local/tmp/appium_cache 2>&1 || echo _ERROR_''[debug] [35m[ADB] [39m The count of applications in the cache: 3
[info] [35m[ADB] [39m The application at 'C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk' is already cached to '/data/local/tmp/appium_cache/0beede6c27af5c71c23a0d9d1c82a7a0b18390e0.apk'
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell pm install -r /data/local/tmp/appium_cache/0beede6c27af5c71c23a0d9d1c82a7a0b18390e0.apk'[info] [35m[ADB] [39m The installation of 'appium-uiautomator2-server-debug-androidTest.apk' took 0.405s
[debug] [35m[ADB] [39m Install command stdout: Success
[debug] [35m[UiAutomator2] [39m Waiting up to 30000ms for services to be available
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell pm list instrumentation'
[debug] [35m[UiAutomator2] [39m Instrumentation target 'io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner' is available
[debug] [35m[UiAutomator2] [39m Forwarding UiAutomator2 Server port 6790 to 8200
[debug] [35m[ADB] [39m Forwarding system: 8200 to device: 6790
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 forward tcp\:8200 tcp\:6790'[debug] [35m[UiAutomator2] [39m No app capability. Assuming it is already on the device
[debug] [35m[UiAutomator2] [39m Performing shallow cleanup of automation leftovers
[debug] [35m[UiAutomator2] [39m No obsolete sessions have been detected (Error: socket hang up)
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell am force-stop io.appium.uiautomator2.server.test'
[info] [35m[UiAutomator2] [39m Starting UIAutomator2 server 4.3.0
[info] [35m[UiAutomator2] [39m Using UIAutomator2 server from 'C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk' and test from 'C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk'
[info] [35m[UiAutomator2] [39m Waiting up to 30000ms for UiAutomator2 to be online...
[debug] [35m[ADB] [39m Creating ADB subprocess with args: ["-P",5037,"-s","AHK7N17213003661","shell","am","instrument","-w","io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner"][debug] [35m[Instrumentation] [39m java.lang.SecurityException: Permission Denial: starting instrumentation ComponentInfo{io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner} from pid=24839, uid=24839 not allowed because package io.appium.uiautomator2.server.test does not have a signature matching the target io.appium.uiautomator2.server
[debug] [35m[Instrumentation] [39m at android.os.Parcel.createException(Parcel.java:1953)
[debug] [35m[Instrumentation] [39m at android.os.Parcel.readException(Parcel.java:1921)
[debug] [35m[Instrumentation] [39m at android.os.Parcel.readException(Parcel.java:1871)
[debug] [35m[Instrumentation] [39m at android.app.IActivityManager$Stub$Proxy.startInstrumentation(IActivityManager.java:4479)
[debug] [35m[Instrumentation] [39m at com.android.commands.am.Instrument.run(Instrument.java:484)
[debug] [35m[Instrumentation] [39m at com.android.commands.am.Am.runInstrument(Am.java:194)
[debug] [35m[Instrumentation] [39m at com.android.commands.am.Am.onRun(Am.java:80)
[debug] [35m[Instrumentation] [39m at com.android.internal.os.BaseCommand.run(BaseCommand.java:54)
[debug] [35m[Instrumentation] [39m at com.android.commands.am.Am.main(Am.java:50)
[debug] [35m[Instrumentation] [39m at com.android.internal.os.RuntimeInit.nativeFinishInit(Native Method)
[debug] [35m[Instrumentation] [39m at com.android.internal.os.RuntimeInit.main(RuntimeInit.java:371)
[debug] [35m[Instrumentation] [39m Caused by: android.os.RemoteException: Remote stack trace:
[debug] [35m[Instrumentation] [39m at com.android.server.am.ActivityManagerService.startInstrumentation(ActivityManagerService.java:24078)
[debug] [35m[Instrumentation] [39m at android.app.IActivityManager$Stub.onTransact$startInstrumentation$(IActivityManager.java:10360)
[debug] [35m[Instrumentation] [39m at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:528)
[debug] [35m[Instrumentation] [39m at com.android.server.am.ActivityManagerService.onTransact(ActivityManagerService.java:3648)
[debug] [35m[Instrumentation] [39m at com.android.server.am.HwActivityManagerService.onTransact(HwActivityManagerService.java:609)
[debug] [35m[Instrumentation] [39m INSTRUMENTATION_STATUS: Error=Permission Denial: starting instrumentation ComponentInfo{io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner} from pid=24839, uid=24839 not allowed because package io.appium.uiautomator2.server.test does not have a signature matching the target io.appium.uiautomator2.server
[debug] [35m[Instrumentation] [39m INSTRUMENTATION_STATUS: id=ActivityManagerService
[debug] [35m[Instrumentation] [39m INSTRUMENTATION_STATUS_CODE: -1
[debug] [35m[Instrumentation] [39m The process has exited with code 1[warn] [35m[UiAutomator2] [39m The instrumentation process has been unexpectedly terminated. Retrying UiAutomator2 startup (#1 of 1)
[debug] [35m[UiAutomator2] [39m Performing strict cleanup of automation leftovers[debug] [35m[UiAutomator2] [39m No obsolete sessions have been detected (Error: socket hang up)
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell am force-stop io.appium.uiautomator2.server.test'
[debug] [35m[ADB] [39m Attempting to kill all uiautomator processes
[debug] [35m[ADB] [39m Getting IDs of all 'uiautomator' processes
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell pgrep -f uiautomator'[info] [35m[ADB] [39m No 'uiautomator' process has been found[info] [35m[UiAutomator2] [39m Waiting up to 30000ms for UiAutomator2 to be online...
[debug] [35m[ADB] [39m Creating ADB subprocess with args: ["-P",5037,"-s","AHK7N17213003661","shell","am","instrument","-w","io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner"][debug] [35m[Instrumentation] [39m java.lang.SecurityException: Permission Denial: starting instrumentation ComponentInfo{io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner} from pid=25147, uid=25147 not allowed because package io.appium.uiautomator2.server.test does not have a signature matching the target io.appium.uiautomator2.server
[debug] [35m[Instrumentation] [39m at android.os.Parcel.createException(Parcel.java:1953)
[debug] [35m[Instrumentation] [39m at android.os.Parcel.readException(Parcel.java:1921)
[debug] [35m[Instrumentation] [39m at android.os.Parcel.readException(Parcel.java:1871)
[debug] [35m[Instrumentation] [39m at android.app.IActivityManager$Stub$Proxy.startInstrumentation(IActivityManager.java:4479)
[debug] [35m[Instrumentation] [39m at com.android.commands.am.Instrument.run(Instrument.java:484)
[debug] [35m[Instrumentation] [39m at com.android.commands.am.Am.runInstrument(Am.java:194)
[debug] [35m[Instrumentation] [39m INSTRUMENTATION_STATUS: Error=Permission Denial: starting instrumentation ComponentInfo{io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner} from pid=25147, uid=25147 not allowed because package io.appium.uiautomator2.server.test does not have a signature matching the target io.appium.uiautomator2.server
[debug] [35m[Instrumentation] [39m INSTRUMENTATION_STATUS: id=ActivityManagerService
[debug] [35m[Instrumentation] [39m INSTRUMENTATION_STATUS_CODE: -1
[debug] [35m[Instrumentation] [39m at com.android.commands.am.Am.onRun(Am.java:80)
[debug] [35m[Instrumentation] [39m at com.android.internal.os.BaseCommand.run(BaseCommand.java:54)
[debug] [35m[Instrumentation] [39m at com.android.commands.am.Am.main(Am.java:50)
[debug] [35m[Instrumentation] [39m at com.android.internal.os.RuntimeInit.nativeFinishInit(Native Method)
[debug] [35m[Instrumentation] [39m at com.android.internal.os.RuntimeInit.main(RuntimeInit.java:371)
[debug] [35m[Instrumentation] [39m Caused by: android.os.RemoteException: Remote stack trace:
[debug] [35m[Instrumentation] [39m at com.android.server.am.ActivityManagerService.startInstrumentation(ActivityManagerService.java:24078)
[debug] [35m[Instrumentation] [39m at android.app.IActivityManager$Stub.onTransact$startInstrumentation$(IActivityManager.java:10360)
[debug] [35m[Instrumentation] [39m at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:528)
[debug] [35m[Instrumentation] [39m at com.android.server.am.ActivityManagerService.onTransact(ActivityManagerService.java:3648)
[debug] [35m[Instrumentation] [39m at com.android.server.am.HwActivityManagerService.onTransact(HwActivityManagerService.java:609)
[debug] [35m[Instrumentation] [39m The process has exited with code 1[error] [35m[UiAutomator2] [39m Error: The instrumentation process cannot be initialized. Make sure the application under test does not crash and investigate the logcat output.
[error] [35m[UiAutomator2] [39m     at Object.wrappedLogger.errorAndThrow (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-support\lib\logging.js:79:13)
[error] [35m[UiAutomator2] [39m     at UiAutomator2Server.errorAndThrow [as startSession] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-driver\lib\uiautomator2.js:227:13)
[debug] [35m[UiAutomator2] [39m Deleting UiAutomator2 session
[debug] [35m[UiAutomator2] [39m Deleting UiAutomator2 server session
[debug] [35m[WD Proxy] [39m Matched '/' to command name 'deleteSession'
[warn] [35m[UiAutomator2] [39m Did not get confirmation UiAutomator2 deleteSession worked; Error was: UnknownError: An unknown server-side error occurred while processing the command. Original error: Trying to proxy a session command without session id
[debug] [35m[Logcat] [39m Stopping logcat capture
[debug] [35m[ADB] [39m Removing forwarded port socket connection: 8200
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 forward --remove tcp\:8200'[info] [35m[UiAutomator2] [39m Restoring hidden api policy to the device default configuration
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell settings delete global hidden_api_policy_pre_p_apps'
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell settings delete global hidden_api_policy_p_apps'[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell settings delete global hidden_api_policy'[debug] [35m[BaseDriver] [39m Event 'newSessionStarted' logged at 1588031088074 (19:44:48 GMT-0400 (Hora est. Sudamérica Pacífico))
[debug] [35m[MJSONWP] [39m Encountered internal error running command: Error: The instrumentation process cannot be initialized. Make sure the application under test does not crash and investigate the logcat output.
[debug] [35m[MJSONWP] [39m     at Object.wrappedLogger.errorAndThrow (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-support\lib\logging.js:79:13)
[debug] [35m[MJSONWP] [39m     at UiAutomator2Server.errorAndThrow [as startSession] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-driver\lib\uiautomator2.js:227:13)
[info] [35m[HTTP] [39m [37m<-- POST /wd/hub/session [39m [31m500 [39m [90m15425 ms - 274 [39m
[info] [35m[HTTP] [39m [90m [39m
[info] [35m[HTTP] [39m [37m--> [39m [37mDELETE [39m [37m/wd/hub/session [39m
[info] [35m[HTTP] [39m [90m{} [39m
[debug] [35m[HTTP] [39m No route found. Setting content type to 'text/plain'
[info] [35m[HTTP] [39m [37m<-- DELETE /wd/hub/session [39m [33m404 [39m [90m1 ms - 57 [39m
[info] [35m[HTTP] [39m [90m [39m[info] [35m[HTTP] [39m [37m--> [39m [37mPOST [39m [37m/wd/hub/session [39m
[info] [35m[HTTP] [39m [90m{"desiredCapabilities":{"deviceName":"Mate9","platformName":"android","newCommandTimeout":0,"connectHardwareKeyboard":true}} [39m
[debug] [35m[MJSONWP] [39m Calling AppiumDriver.createSession() with args: [{"deviceName":"Mate9","platformName":"android","newCommandTimeout":0,"connectHardwareKeyboard":true},null,null]
[debug] [35m[BaseDriver] [39m Event 'newSessionRequested' logged at 1588031186069 (19:46:26 GMT-0400 (Hora est. Sudamérica Pacífico))
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m ======================================================================
[warn] [35m[Appium] [39m   DEPRECATION WARNING:
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   The 'automationName' capability was not provided in the desired
[warn] [35m[Appium] [39m   capabilities for this Android session
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   Setting 'automationName=UiAutomator2' by default and using the
[warn] [35m[Appium] [39m   UiAutomator2 Driver
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   The next major version of Appium (2.x) will **require** the
[warn] [35m[Appium] [39m   'automationName' capability to be set for all sessions on all
[warn] [35m[Appium] [39m   platforms
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   In previous versions (Appium <= 1.13.x), the default was
[warn] [35m[Appium] [39m   'automationName=UiAutomator1'
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   If you wish to use that automation instead of UiAutomator2, please
[warn] [35m[Appium] [39m   add 'automationName=UiAutomator1' to your desired capabilities
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   For more information about drivers, please visit
[warn] [35m[Appium] [39m   http://appium.io/docs/en/about-appium/intro/ and explore the
[warn] [35m[Appium] [39m   'Drivers' menu
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m ======================================================================
[warn] [35m[Appium] [39m
[info] [35m[Appium] [39m Appium v1.15.1 creating new AndroidUiautomator2Driver (v1.37.2) session
[debug] [35m[BaseDriver] [39m Creating session with MJSONWP desired capabilities: {
[debug] [35m[BaseDriver] [39m   "deviceName": "Mate9",
[debug] [35m[BaseDriver] [39m   "platformName": "android",
[debug] [35m[BaseDriver] [39m   "newCommandTimeout": 0,
[debug] [35m[BaseDriver] [39m   "connectHardwareKeyboard": true
[debug] [35m[BaseDriver] [39m }
[warn] [35m[BaseDriver] [39m The following capabilities were provided, but are not recognized by Appium:
[warn] [35m[BaseDriver] [39m   connectHardwareKeyboard
[info] [35m[BaseDriver] [39m Session created with session id: cf58d8f8-d351-4b6c-a1fc-acf3f96045c6
[info] [35m[UiAutomator2] [39m Neither 'app' nor 'appPackage' was set. Starting UiAutomator2 without the target application[info] [35m[ADB] [39m Using 'adb.exe' from 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe'
[info] [35m[AndroidDriver] [39m Retrieving device list
[debug] [35m[ADB] [39m Trying to find a connected android device
[debug] [35m[ADB] [39m Getting connected devices...[debug] [35m[ADB] [39m Connected devices: [{"udid":"AHK7N17213003661","state":"device"}]
[info] [35m[AndroidDriver] [39m Using device: AHK7N17213003661
[info] [35m[ADB] [39m Using 'adb.exe' from 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe'
[debug] [35m[ADB] [39m Setting device id to AHK7N17213003661
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell getprop ro.build.version.sdk'[debug] [35m[ADB] [39m Current device property 'ro.build.version.sdk': 28
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell getprop ro.build.version.release'[debug] [35m[ADB] [39m Current device property 'ro.build.version.release': 9
[debug] [35m[ADB] [39m Device API level: 28
[warn] [35m[UiAutomator2] [39m Relaxing hidden api policy
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell settings put global hidden_api_policy_pre_p_apps 1'[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell settings put global hidden_api_policy_p_apps 1'
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell settings put global hidden_api_policy 1'[warn] [35m[AndroidDriver] [39m No app sent in, not parsing package/activity
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 wait-for-device'[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell echo ping'
[debug] [35m[AndroidDriver] [39m Pushing settings apk to device...
[debug] [35m[ADB] [39m Getting install status for io.appium.settings
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell dumpsys package io.appium.settings'[debug] [35m[ADB] [39m 'io.appium.settings' is installed
[debug] [35m[ADB] [39m Getting package info for 'io.appium.settings'
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell dumpsys package io.appium.settings'[info] [35m[ADB] [39m Cannot extract apk info using apkanalyzer. Falling back to aapt. Original error: Could not find 'apkanalyzer.bat' in ["C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\platform-tools\\apkanalyzer.bat","C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\emulator\\apkanalyzer.bat","C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\tools\\apkanalyzer.bat","C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\tools\\bin\\apkanalyzer.bat","C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\build-tools\\29.0.3\\apkanalyzer.bat"]. Do you have Android Build Tools installed at 'C:\Users\ACL\AppData\Local\Android\Sdk'?
[info] [35m[ADB] [39m Using 'aapt.exe' from 'C:\Users\ACL\AppData\Local\Android\Sdk\build-tools\29.0.3\aapt.exe'
[debug] [35m[ADB] [39m The version name of the installed 'io.appium.settings' is greater or equal to the application version name ('2.14.2' >= '2.14.2')
[debug] [35m[ADB] [39m There is no need to install/upgrade 'C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\io.appium.settings\apks\settings_apk-debug.apk'
[debug] [35m[ADB] [39m Getting IDs of all 'io.appium.settings' processes
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell 'pgrep --help; echo $?''[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell pgrep -f io\\.appium\\.settings'[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell am start -n io.appium.settings/.Settings -a android.intent.action.MAIN -c android.intent.category.LAUNCHER'[debug] [35m[ADB] [39m Getting IDs of all 'io.appium.settings' processes
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell pgrep -f io\\.appium\\.settings'
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell appops set io.appium.settings android\:mock_location allow'[debug] [35m[Logcat] [39m Starting logcat capture
[debug] [35m[ADB] [39m Getting install status for io.appium.uiautomator2.server
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell dumpsys package io.appium.uiautomator2.server'[debug] [35m[ADB] [39m 'io.appium.uiautomator2.server' is installed
[debug] [35m[ADB] [39m Getting package info for 'io.appium.uiautomator2.server'
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell dumpsys package io.appium.uiautomator2.server'[info] [35m[ADB] [39m Cannot extract apk info using apkanalyzer. Falling back to aapt. Original error: Could not find 'apkanalyzer.bat' in ["C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\platform-tools\\apkanalyzer.bat","C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\emulator\\apkanalyzer.bat","C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\tools\\apkanalyzer.bat","C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\tools\\bin\\apkanalyzer.bat","C:\\Users\\ACL\\AppData\\Local\\Android\\Sdk\\build-tools\\29.0.3\\apkanalyzer.bat"]. Do you have Android Build Tools installed at 'C:\Users\ACL\AppData\Local\Android\Sdk'?[debug] [35m[ADB] [39m The version name of the installed 'io.appium.uiautomator2.server' is greater or equal to the application version name ('4.3.0' >= '4.3.0')
[debug] [35m[UiAutomator2] [39m io.appium.uiautomator2.server installation state: sameVersionInstalled
[debug] [35m[ADB] [39m Checking app cert for C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk
[info] [35m[ADB] [39m Using 'apksigner.bat' from 'C:\Users\ACL\AppData\Local\Android\Sdk\build-tools\29.0.3\apksigner.bat'
[debug] [35m[ADB] [39m Starting 'C:\Users\ACL\AppData\Local\Android\Sdk\build-tools\29.0.3\apksigner.bat' with args '["verify","--print-certs","C:\\Users\\ACL\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-uiautomator2-server\\apks\\appium-uiautomator2-server-v4.3.0.apk"]'
[debug] [35m[ADB] [39m 'C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk' is signed with non-default certificate
[info] [35m[ADB] [39m Using 'zipalign.exe' from 'C:\Users\ACL\AppData\Local\Android\Sdk\build-tools\29.0.3\zipalign.exe'[debug] [35m[ADB] [39m C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk' is already zip-aligned. Doing nothing
[debug] [35m[ADB] [39m Signing 'C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk' with default cert
[debug] [35m[ADB] [39m Starting 'C:\Users\ACL\AppData\Local\Android\Sdk\build-tools\29.0.3\apksigner.bat' with args '["sign","--key","C:\\Users\\ACL\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-adb\\keys\\testkey.pk8","--cert","C:\\Users\\ACL\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-adb\\keys\\testkey.x509.pem","C:\\Users\\ACL\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-uiautomator2-server\\apks\\appium-uiautomator2-server-v4.3.0.apk"]'
[debug] [35m[ADB] [39m Getting install status for io.appium.uiautomator2.server.test
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell dumpsys package io.appium.uiautomator2.server.test'[debug] [35m[ADB] [39m 'io.appium.uiautomator2.server.test' is installed
[debug] [35m[ADB] [39m Checking app cert for C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk
[debug] [35m[ADB] [39m Starting 'C:\Users\ACL\AppData\Local\Android\Sdk\build-tools\29.0.3\apksigner.bat' with args '["verify","--print-certs","C:\\Users\\ACL\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-uiautomator2-server\\apks\\appium-uiautomator2-server-debug-androidTest.apk"]'
[debug] [35m[ADB] [39m 'C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk' is signed with non-default certificate[debug] [35m[ADB] [39m C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk' is already zip-aligned. Doing nothing
[debug] [35m[ADB] [39m Signing 'C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk' with default cert
[debug] [35m[ADB] [39m Starting 'C:\Users\ACL\AppData\Local\Android\Sdk\build-tools\29.0.3\apksigner.bat' with args '["sign","--key","C:\\Users\\ACL\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-adb\\keys\\testkey.pk8","--cert","C:\\Users\\ACL\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-adb\\keys\\testkey.x509.pem","C:\\Users\\ACL\\AppData\\Local\\Programs\\Appium\\resources\\app\\node_modules\\appium\\node_modules\\appium-uiautomator2-server\\apks\\appium-uiautomator2-server-debug-androidTest.apk"]'
[info] [35m[UiAutomator2] [39m Server packages are going to be (re)installed
[info] [35m[UiAutomator2] [39m Full packages reinstall is going to be performed
[debug] [35m[ADB] [39m Uninstalling io.appium.uiautomator2.server
[debug] [35m[ADB] [39m Getting install status for io.appium.uiautomator2.server
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell dumpsys package io.appium.uiautomator2.server'[debug] [35m[ADB] [39m 'io.appium.uiautomator2.server' is installed
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell am force-stop io.appium.uiautomator2.server'[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 uninstall io.appium.uiautomator2.server'[debug] [35m[ADB] [39m 'adb uninstall io.appium.uiautomator2.server' command output: Success
[info] [35m[ADB] [39m io.appium.uiautomator2.server was successfully uninstalled
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell 'ls -t -1 /data/local/tmp/appium_cache 2>&1 || echo _ERROR_''[debug] [35m[ADB] [39m The count of applications in the cache: 3
[info] [35m[ADB] [39m The application at 'C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-v4.3.0.apk' is already cached to '/data/local/tmp/appium_cache/0cc1725a60a05dbb5d0d09256f2fc6ece7e3b10f.apk'
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell pm install -r /data/local/tmp/appium_cache/0cc1725a60a05dbb5d0d09256f2fc6ece7e3b10f.apk'[info] [35m[ADB] [39m The installation of 'appium-uiautomator2-server-v4.3.0.apk' took 0.469s
[debug] [35m[ADB] [39m Install command stdout: Success
[debug] [35m[ADB] [39m Uninstalling io.appium.uiautomator2.server.test
[debug] [35m[ADB] [39m Getting install status for io.appium.uiautomator2.server.test
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell dumpsys package io.appium.uiautomator2.server.test'
[debug] [35m[ADB] [39m 'io.appium.uiautomator2.server.test' is installed
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell am force-stop io.appium.uiautomator2.server.test'[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 uninstall io.appium.uiautomator2.server.test'[debug] [35m[ADB] [39m 'adb uninstall io.appium.uiautomator2.server.test' command output: Success
[info] [35m[ADB] [39m io.appium.uiautomator2.server.test was successfully uninstalled
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell 'ls -t -1 /data/local/tmp/appium_cache 2>&1 || echo _ERROR_''[debug] [35m[ADB] [39m The count of applications in the cache: 3
[info] [35m[ADB] [39m The application at 'C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-server\apks\appium-uiautomator2-server-debug-androidTest.apk' is already cached to '/data/local/tmp/appium_cache/0beede6c27af5c71c23a0d9d1c82a7a0b18390e0.apk'
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell pm install -r /data/local/tmp/appium_cache/0beede6c27af5c71c23a0d9d1c82a7a0b18390e0.apk'[info] [35m[ADB] [39m The installation of 'appium-uiautomator2-server-debug-androidTest.apk' took 0.425s
[debug] [35m[ADB] [39m Install command stdout: Success
[debug] [35m[UiAutomator2] [39m Waiting up to 30000ms for services to be available
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell pm list instrumentation'[debug] [35m[UiAutomator2] [39m Instrumentation target 'io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner' is available
[debug] [35m[UiAutomator2] [39m Forwarding UiAutomator2 Server port 6790 to 8200
[debug] [35m[ADB] [39m Forwarding system: 8200 to device: 6790
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 forward tcp\:8200 tcp\:6790'[debug] [35m[UiAutomator2] [39m No app capability. Assuming it is already on the device
[debug] [35m[UiAutomator2] [39m Performing shallow cleanup of automation leftovers
[debug] [35m[UiAutomator2] [39m No obsolete sessions have been detected (Error: socket hang up)
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell am force-stop io.appium.uiautomator2.server.test'[debug] [35m[Instrumentation] [39m java.lang.SecurityException: Permission Denial: starting instrumentation ComponentInfo{io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner} from pid=25767, uid=25767 not allowed because package io.appium.uiautomator2.server.test does not have a signature matching the target io.appium.uiautomator2.server
[debug] [35m[Instrumentation] [39m at android.os.Parcel.createException(Parcel.java:1953)
[debug] [35m[Instrumentation] [39m at android.os.Parcel.readException(Parcel.java:1921)
[debug] [35m[Instrumentation] [39m at android.os.Parcel.readException(Parcel.java:1871)
[debug] [35m[Instrumentation] [39m at android.app.IActivityManager$Stub$Proxy.startInstrumentation(IActivityManager.java:4479)
[debug] [35m[Instrumentation] [39m at com.android.commands.am.Instrument.run(Instrument.java:484)
[debug] [35m[Instrumentation] [39m at com.android.commands.am.Am.runInstrument(Am.java:194)
[debug] [35m[Instrumentation] [39m at com.android.commands.am.Am.onRun(Am.java:80)
[debug] [35m[Instrumentation] [39m at com.android.internal.os.BaseCommand.run(BaseCommand.java:54)
[debug] [35m[Instrumentation] [39m at com.android.commands.am.Am.main(Am.java:50)
[debug] [35m[Instrumentation] [39m at com.android.internal.os.RuntimeInit.nativeFinishInit(Native Method)
[debug] [35m[Instrumentation] [39m at com.android.internal.os.RuntimeInit.main(RuntimeInit.java:371)[debug] [35m[Instrumentation] [39m INSTRUMENTATION_STATUS: Error=Permission Denial: starting instrumentation ComponentInfo{io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner} from pid=25767, uid=25767 not allowed because package io.appium.uiautomator2.server.test does not have a signature matching the target io.appium.uiautomator2.server
[debug] [35m[Instrumentation] [39m INSTRUMENTATION_STATUS: id=ActivityManagerService
[debug] [35m[Instrumentation] [39m INSTRUMENTATION_STATUS_CODE: -1
[debug] [35m[Instrumentation] [39m The process has exited with code 1[warn] [35m[UiAutomator2] [39m The instrumentation process has been unexpectedly terminated. Retrying UiAutomator2 startup (#1 of 1)
[debug] [35m[UiAutomator2] [39m Performing strict cleanup of automation leftovers
[debug] [35m[UiAutomator2] [39m No obsolete sessions have been detected (Error: socket hang up)
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell am force-stop io.appium.uiautomator2.server.test'
[debug] [35m[ADB] [39m Attempting to kill all uiautomator processes
[debug] [35m[ADB] [39m Getting IDs of all 'uiautomator' processes
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell pgrep -f uiautomator'[info] [35m[ADB] [39m No 'uiautomator' process has been found[info] [35m[UiAutomator2] [39m Waiting up to 30000ms for UiAutomator2 to be online...
[debug] [35m[ADB] [39m Creating ADB subprocess with args: ["-P",5037,"-s","AHK7N17213003661","shell","am","instrument","-w","io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner"][debug] [35m[Instrumentation] [39m java.lang.SecurityException: Permission Denial: starting instrumentation ComponentInfo{io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner} from pid=25800, uid=25800 not allowed because package io.appium.uiautomator2.server.test does not have a signature matching the target io.appium.uiautomator2.server
[debug] [35m[Instrumentation] [39m at android.os.Parcel.createException(Parcel.java:1953)
[debug] [35m[Instrumentation] [39m at android.os.Parcel.readException(Parcel.java:1921)
[debug] [35m[Instrumentation] [39m at android.os.Parcel.readException(Parcel.java:1871)
[debug] [35m[Instrumentation] [39m at android.app.IActivityManager$Stub$Proxy.startInstrumentation(IActivityManager.java:4479)
[debug] [35m[Instrumentation] [39m at com.android.commands.am.Instrument.run(Instrument.java:484)
[debug] [35m[Instrumentation] [39m INSTRUMENTATION_STATUS: Error=Permission Denial: starting instrumentation ComponentInfo{io.appium.uiautomator2.server.test/androidx.test.runner.AndroidJUnitRunner} from pid=25800, uid=25800 not allowed because package io.appium.uiautomator2.server.test does not have a signature matching the target io.appium.uiautomator2.server
[debug] [35m[Instrumentation] [39m INSTRUMENTATION_STATUS: id=ActivityManagerService
[debug] [35m[Instrumentation] [39m INSTRUMENTATION_STATUS_CODE: -1
[debug] [35m[Instrumentation] [39m at com.android.commands.am.Am.runInstrument(Am.java:194)
[debug] [35m[Instrumentation] [39m at com.android.commands.am.Am.onRun(Am.java:80)
[debug] [35m[Instrumentation] [39m at com.android.internal.os.BaseCommand.run(BaseCommand.java:54)
[debug] [35m[Instrumentation] [39m at com.android.commands.am.Am.main(Am.java:50)
[debug] [35m[Instrumentation] [39m at com.android.internal.os.RuntimeInit.nativeFinishInit(Native Method)
[debug] [35m[Instrumentation] [39m at com.android.internal.os.RuntimeInit.main(RuntimeInit.java:371)
[debug] [35m[Instrumentation] [39m Caused by: android.os.RemoteException: Remote stack trace:
[debug] [35m[Instrumentation] [39m at com.android.server.am.ActivityManagerService.startInstrumentation(ActivityManagerService.java:24078)
[debug] [35m[Instrumentation] [39m at android.app.IActivityManager$Stub.onTransact$startInstrumentation$(IActivityManager.java:10360)
[debug] [35m[Instrumentation] [39m at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:528)
[debug] [35m[Instrumentation] [39m at com.android.server.am.ActivityManagerService.onTransact(ActivityManagerService.java:3648)
[debug] [35m[Instrumentation] [39m at com.android.server.am.HwActivityManagerService.onTransact(HwActivityManagerService.java:609)
[debug] [35m[Instrumentation] [39m The process has exited with code 1[error] [35m[UiAutomator2] [39m Error: The instrumentation process cannot be initialized. Make sure the application under test does not crash and investigate the logcat output.
[error] [35m[UiAutomator2] [39m     at Object.wrappedLogger.errorAndThrow (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-support\lib\logging.js:79:13)
[error] [35m[UiAutomator2] [39m     at UiAutomator2Server.errorAndThrow [as startSession] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-driver\lib\uiautomator2.js:227:13)
[debug] [35m[UiAutomator2] [39m Deleting UiAutomator2 session
[debug] [35m[UiAutomator2] [39m Deleting UiAutomator2 server session
[debug] [35m[WD Proxy] [39m Matched '/' to command name 'deleteSession'
[warn] [35m[UiAutomator2] [39m Did not get confirmation UiAutomator2 deleteSession worked; Error was: UnknownError: An unknown server-side error occurred while processing the command. Original error: Trying to proxy a session command without session id
[debug] [35m[Logcat] [39m Stopping logcat capture
[debug] [35m[ADB] [39m Removing forwarded port socket connection: 8200
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 forward --remove tcp\:8200'[info] [35m[UiAutomator2] [39m Restoring hidden api policy to the device default configuration
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell settings delete global hidden_api_policy_pre_p_apps'[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell settings delete global hidden_api_policy_p_apps'
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell settings delete global hidden_api_policy'[debug] [35m[BaseDriver] [39m Event 'newSessionStarted' logged at 1588031201893 (19:46:41 GMT-0400 (Hora est. Sudamérica Pacífico))
[debug] [35m[MJSONWP] [39m Encountered internal error running command: Error: The instrumentation process cannot be initialized. Make sure the application under test does not crash and investigate the logcat output.
[debug] [35m[MJSONWP] [39m     at Object.wrappedLogger.errorAndThrow (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-support\lib\logging.js:79:13)
[debug] [35m[MJSONWP] [39m     at UiAutomator2Server.errorAndThrow [as startSession] (C:\Users\ACL\AppData\Local\Programs\Appium\resources\app\node_modules\appium\node_modules\appium-uiautomator2-driver\lib\uiautomator2.js:227:13)
[info] [35m[HTTP] [39m [37m<-- POST /wd/hub/session [39m [31m500 [39m [90m15826 ms - 274 [39m
[info] [35m[HTTP] [39m [90m [39m
[info] [35m[HTTP] [39m [37m--> [39m [37mDELETE [39m [37m/wd/hub/session [39m
[info] [35m[HTTP] [39m [90m{} [39m
[debug] [35m[HTTP] [39m No route found. Setting content type to 'text/plain'
[info] [35m[HTTP] [39m [37m<-- DELETE /wd/hub/session [39m [33m404 [39m [90m1 ms - 57 [39m
[info] [35m[HTTP] [39m [90m [39m[info] [35m[HTTP] [39m [37m--> [39m [37mPOST [39m [37m/wd/hub/session [39m
[info] [35m[HTTP] [39m [90m{"desiredCapabilities":{"appActivity":"com.truecaller.ui.TruecallerInit","appPackage":"com.truecaller","deviceName":"Mate9","platformName":"android","udid":"AHK7N17213003661","newCommandTimeout":0,"connectHardwareKeyboard":true}} [39m
[debug] [35m[MJSONWP] [39m Calling AppiumDriver.createSession() with args: [{"appActivity":"com.truecaller.ui.TruecallerInit","appPackage":"com.truecaller","deviceName":"Mate9","platformName":"android","udid":"AHK7N17213003661","newCommandTimeout":0,"connectHardwareKeyboard":true},null,null]
[debug] [35m[BaseDriver] [39m Event 'newSessionRequested' logged at 1588031316171 (19:48:36 GMT-0400 (Hora est. Sudamérica Pacífico))
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m ======================================================================
[warn] [35m[Appium] [39m   DEPRECATION WARNING:
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   The 'automationName' capability was not provided in the desired
[warn] [35m[Appium] [39m   capabilities for this Android session
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   Setting 'automationName=UiAutomator2' by default and using the
[warn] [35m[Appium] [39m   UiAutomator2 Driver
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   The next major version of Appium (2.x) will **require** the
[warn] [35m[Appium] [39m   'automationName' capability to be set for all sessions on all
[warn] [35m[Appium] [39m   platforms
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   In previous versions (Appium <= 1.13.x), the default was
[warn] [35m[Appium] [39m   'automationName=UiAutomator1'
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   If you wish to use that automation instead of UiAutomator2, please
[warn] [35m[Appium] [39m   add 'automationName=UiAutomator1' to your desired capabilities
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m   For more information about drivers, please visit
[warn] [35m[Appium] [39m   http://appium.io/docs/en/about-appium/intro/ and explore the
[warn] [35m[Appium] [39m   'Drivers' menu
[warn] [35m[Appium] [39m
[warn] [35m[Appium] [39m ======================================================================
[warn] [35m[Appium] [39m
[info] [35m[Appium] [39m Appium v1.15.1 creating new AndroidUiautomator2Driver (v1.37.2) session
[debug] [35m[BaseDriver] [39m Creating session with MJSONWP desired capabilities: {
[debug] [35m[BaseDriver] [39m   "appActivity": "com.truecaller.ui.TruecallerInit",
[debug] [35m[BaseDriver] [39m   "appPackage": "com.truecaller",
[debug] [35m[BaseDriver] [39m   "deviceName": "Mate9",
[debug] [35m[BaseDriver] [39m   "platformName": "android",
[debug] [35m[BaseDriver] [39m   "udid": "AHK7N17213003661",
[debug] [35m[BaseDriver] [39m   "newCommandTimeout": 0,
[debug] [35m[BaseDriver] [39m   "connectHardwareKeyboard": true
[debug] [35m[BaseDriver] [39m }
[warn] [35m[BaseDriver] [39m The following capabilities were provided, but are not recognized by Appium:
[warn] [35m[BaseDriver] [39m   connectHardwareKeyboard
[info] [35m[BaseDriver] [39m Session created with session id: 6c6a0c10-18aa-43b8-8ff7-b6c04440d9cb
[info] [35m[UiAutomator2] [39m Starting 'com.truecaller' directly on the device[info] [35m[ADB] [39m Using 'adb.exe' from 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe'
[info] [35m[AndroidDriver] [39m Retrieving device list
[debug] [35m[ADB] [39m Trying to find a connected android device
[debug] [35m[ADB] [39m Getting connected devices...[debug] [35m[ADB] [39m Connected devices: [{"udid":"AHK7N17213003661","state":"device"}]
[info] [35m[AndroidDriver] [39m Using device: AHK7N17213003661
[info] [35m[ADB] [39m Using 'adb.exe' from 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe'
[debug] [35m[ADB] [39m Setting device id to AHK7N17213003661
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell getprop ro.build.version.sdk'[debug] [35m[ADB] [39m Current device property 'ro.build.version.sdk': 28
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell getprop ro.build.version.release'[debug] [35m[ADB] [39m Current device property 'ro.build.version.release': 9
[debug] [35m[ADB] [39m Device API level: 28
[warn] [35m[UiAutomator2] [39m Relaxing hidden api policy
[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N17213003661 shell settings put global hidden_api_policy_pre_p_apps 1'[debug] [35m[ADB] [39m Running 'C:\Users\ACL\AppData\Local\Android\Sdk\platform-tools\adb.exe -P 5037 -s AHK7N172130