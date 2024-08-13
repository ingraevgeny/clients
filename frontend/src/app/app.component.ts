import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { MatSlideToggleModule } from '@angular/material/slide-toggle';
import {ClientDataSource} from "./client/client-datasource";
import {ClientComponent} from "./client/client.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [MatSlideToggleModule, RouterOutlet, ClientComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'Clients';
}
