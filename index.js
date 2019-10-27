import { NativeModules, requireNativeComponent } from 'react-native';

const { CrispChat } = NativeModules;
export const CrispChatWindow = requireNativeComponent('RCTCrispChatWindow');
export const CrispChat = CrispChat;
