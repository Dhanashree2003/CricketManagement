import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html'
})
export class HomepageComponent {
  constructor(private router: Router) {}

  search(form: any) {
    const id = form.value.id;
    if (id) {
      this.router.navigate(['/search', id]);
    }
  }
}
