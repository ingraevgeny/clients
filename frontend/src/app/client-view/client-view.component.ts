import {Component, OnInit} from '@angular/core';
import {MatTableModule} from "@angular/material/table";
import {ClientDataService} from "../service/client-data.service";
import {Client} from "../model/client";

@Component({
  selector: 'client-view',
  standalone: true,
  imports: [MatTableModule],
  templateUrl: './client-view.component.html',
  styleUrl: './client-view.component.scss'
})
export class ClientView implements OnInit {
  displayedColumns: string[] = ['id', 'firstName', 'lastName', 'fullName'];
  captions: Map<string, string> = new Map<string, string> ([
    ['id', 'ID'],
    ['firstName', 'Name'],
    ['lastName', 'Surname'],
    ['fullName', 'Full Name']
  ]);
  dataSource: Array<Client> = [];

  constructor(private clientService : ClientDataService) {
  }

  ngOnInit() {
    this.getClients();
  }

  getClients() {
    this.clientService.getAllClients()
      .subscribe(data => this.dataSource = data);
  }

}
