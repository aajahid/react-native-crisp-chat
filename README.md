# react-native-crisp-chat

## Getting started

`$ npm install react-native-crisp-chat --save`

### Mostly automatic installation

`$ react-native link react-native-crisp-chat`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-crisp-chat` and add `CrispChat.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libCrispChat.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainApplication.java`
  - Add `import com.reactlibrary.CrispChatPackage;` to the imports at the top of the file
  - Add `new CrispChatPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-crisp-chat'
  	project(':react-native-crisp-chat').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-crisp-chat/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-crisp-chat')
  	```


## Usage
```javascript
import CrispChat from 'react-native-crisp-chat';

// TODO: What to do with the module?
CrispChat;
```
