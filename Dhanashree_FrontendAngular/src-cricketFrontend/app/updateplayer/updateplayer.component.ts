import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PlayerService } from '../player.service';
import { Player } from 'src/app/model/player';

@Component({
  selector: 'app-updateplayer',
  templateUrl: './updateplayer.component.html'
})
export class UpdateplayerComponent implements OnInit{
  player!: Player;

  constructor(
    private route: ActivatedRoute,
    private service: PlayerService,
    private router: Router) {}

    ngOnInit(): void {
    const id = Number(this.route.snapshot.paramMap.get('id'));
    if (id) {
      this.service.getById(id).subscribe(data => {
        this.player = data;  
      });
    }
  }


  updatePlayer(data:Player) {
    this.service.update(this.player)
      .subscribe(() => this.router.navigate(['/listplayer']));
      console.log(this.player);
      alert("player Updated");
  }

  

}
