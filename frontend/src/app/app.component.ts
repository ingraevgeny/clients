import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {ClientViewComponent} from "./components/client-view/client-view.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, ClientViewComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'Clients';
}
