import {Component, OnInit} from '@angular/core';
import {MatTableModule} from "@angular/material/table";
import {ClientDataService} from "../../service/client-data.service";
import {Client} from "../../model/client";
import {animate, state, style, transition, trigger} from "@angular/animations";
import {MatIconModule} from "@angular/material/icon";
import {MatButtonModule} from "@angular/material/button";

@Component({
  selector: 'app-client-view',
  standalone: true,
  imports: [MatTableModule, MatButtonModule, MatIconModule],
  templateUrl: './client-view.component.html',
  styleUrl: './client-view.component.scss',
  animations: [
    trigger('detailExpand', [
      state('collapsed,void', style({height: '0px', minHeight: '0'})),
      state('expanded', style({height: '*'})),
      transition('expanded <=> collapsed', animate('225ms cubic-bezier(0.4, 0.0, 0.2, 1)')),
    ]),
  ]
})
export class ClientViewComponent implements OnInit {
  displayedColumns: string[] = ['id', 'firstName', 'lastName', 'fullName'];
  captions: Map<string, string> = new Map<string, string> ([
    ['id', 'ID'],
    ['firstName', 'Name'],
    ['lastName', 'Surname'],
    ['fullName', 'Full Name']
  ]);
  dataSource: Client[] = [];
  expandedElement: Client | null | undefined;
  columnsToDisplayWithExpand = [...this.displayedColumns, 'expand'];

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
