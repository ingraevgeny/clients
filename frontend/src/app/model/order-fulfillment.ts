import {Status} from "./status";
import {Medication} from "./medication";

export interface OrderFulfillment {
  id: number;
  status: Status;
  droneId: number;
  medications: Medication[];
  timestamp: Date;
}
