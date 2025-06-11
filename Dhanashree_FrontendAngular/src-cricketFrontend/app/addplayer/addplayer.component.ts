import { Component } from '@angular/core';
import { Player } from 'src/app/model/player';
import { PlayerService } from '../player.service';

@Component({
  selector: 'app-addplayer',
  templateUrl: './addplayer.component.html',
  styleUrls: ['./addplayer.component.css']
})
export class AddplayerComponent {

  constructor(private playerService: PlayerService) {}

  addPlayer(data: Player) {
    this.playerService.add(data).subscribe(
      (player) => {
        console.log('Player Added :'+player);
        alert("player added successfully");
        
      },
     
    );
  }

}