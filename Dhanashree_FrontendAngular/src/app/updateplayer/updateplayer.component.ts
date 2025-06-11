import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { PlayerService } from '../player.service';
import { Player } from 'src/app/model/player';

@Component({
  selector: 'app-updateplayer',
  templateUrl: './updateplayer.component.html'
})
export class UpdateplayerComponent{
  player!: Player;

  constructor(
    private route: ActivatedRoute,
    private service: PlayerService,
    private router: Router) {}


  updatePlayer(data:Player) {
    this.service.update(this.player)
      .subscribe(() => this.router.navigate(['/listplayer']));
      console.log(this.player);
  }

  

}
