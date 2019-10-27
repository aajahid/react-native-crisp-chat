import { NativeModules, requireNativeComponent } from 'react-native';

export const { CrispChat } = NativeModules;
export const CrispChatWindow = requireNativeComponent('RCTCrispChatWindow');