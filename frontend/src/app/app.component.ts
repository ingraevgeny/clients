import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {ClientView} from "./client-view/client-view.component";


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ClientView],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'Clients';
}
