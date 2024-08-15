import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Client} from "../model/client";

@Injectable({
  providedIn: 'root'
})
export class ClientDataService {
  getAllUrl = "/app/getAll";

  constructor(private http: HttpClient) {}

  getAllClients() {
    return this.http.get<Array<Client>>(this.getAllUrl);
  }
}
