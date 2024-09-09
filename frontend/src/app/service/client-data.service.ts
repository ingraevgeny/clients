import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import {Client} from "../model/client";

@Injectable({
  providedIn: 'root'
})
export class ClientDataService {
  getAllUrl = "/clients/getAll";
  getOrdersUrl = "http://localhost:9898/orders/get";

  constructor(private http: HttpClient) {}

  getAllClients() {
    return this.http.get<Client[]>(this.getAllUrl);
  }
}
