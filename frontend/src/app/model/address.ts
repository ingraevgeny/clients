import {AddressType} from "./address-type";

export interface Address {
  id: number;
  fullAddress: string;
  addressType: AddressType;
}
