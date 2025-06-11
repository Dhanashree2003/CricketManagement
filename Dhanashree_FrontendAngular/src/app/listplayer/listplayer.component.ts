import { Component, OnInit } from '@angular/core';
import { Player } from 'src/app/model/player';
import { PlayerService } from '../player.service';


@Component({
  selector: 'app-listplayer',
  templateUrl: './listplayer.component.html'
})
export class ListplayerComponent implements OnInit {

  playerList: Player[] = [];

  constructor(private playerService: PlayerService) {}

  ngOnInit() {
    this.getPlayers();
  }

  getPlayers() {
    this.playerService.getAll()
      .subscribe(data => this.playerList = data);
  }

  deletePlayer(playerId: number) {
    this.playerService.delete(playerId)
      .subscribe(() => this.getPlayers());
  }
}
