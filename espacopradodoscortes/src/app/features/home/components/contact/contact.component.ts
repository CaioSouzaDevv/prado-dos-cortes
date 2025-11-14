import { Component } from '@angular/core';
import { SITE_INFO } from '../../../../core/config/site-info';

@Component({
  selector: 'app-contact',
  standalone: true,
  imports: [],
  templateUrl: './contact.component.html',
  styleUrl: './contact.component.scss'
})
export class ContactComponent {
    general_information = SITE_INFO;

}
