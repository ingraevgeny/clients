import {Address} from "./address";

export interface Client {
  id: number;
  firstName: string;
  lastName: string;
  fullName: string;
  address: Address[];
}
