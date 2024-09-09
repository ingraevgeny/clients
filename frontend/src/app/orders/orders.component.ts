import {Component} from '@angular/core';
import {MatTableModule} from "@angular/material/table";
import {MatButtonModule} from "@angular/material/button";
import {MatIconModule} from "@angular/material/icon";
import {Client} from "../model/client";

@Component({
  selector: 'app-orders',
  standalone: true,
  imports: [MatTableModule, MatButtonModule, MatIconModule],
  templateUrl: './orders.component.html',
  styleUrl: './orders.component.scss'
})
export class OrdersComponent {
  displayedColumns: string[] = ['id', 'clientId', 'droneId', 'status'];
  captions: Map<string, string> = new Map<string, string> ([
    ['id', 'ID'],
    ['clientId', 'Client'],
    ['droneId', 'Drone'],
    ['status', 'Status']
  ]);
  dataSource: Client[] = [];

}
