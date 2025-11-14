import { ServicesComponent } from './features/home/components/services/services.component';
import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HeaderComponent } from './core/header/header.component';
import { BannerComponent } from './features/home/banner/banner.component';
import { CounterComponent } from './features/home/components/counter/counter.component';
import { TestimonialsComponent } from './features/home/components/testimonials/testimonials.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, HeaderComponent, BannerComponent, CounterComponent, ServicesComponent, TestimonialsComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'espacopradodoscortes';
}
