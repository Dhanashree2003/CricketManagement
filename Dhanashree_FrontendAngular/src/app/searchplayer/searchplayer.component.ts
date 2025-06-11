import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PlayerService } from '../player.service';
import { Player } from 'src/app/model/player';

@Component({
  selector: 'app-searchplayer',
  templateUrl: './searchplayer.component.html',
  styleUrls: ['./searchplayer.component.css']
})
export class SearchplayerComponent implements OnInit {
  player: Player | null = null;
  notFound = false;
  searchInput: string = '';

  constructor(
    private route: ActivatedRoute,
    private service: PlayerService
  ) {}

  ngOnInit(): void {
    this.findPlayer();
  }

  findPlayer(): void {
    this.route.params.subscribe(params => {
      this.searchInput = params['input'];

      const id = +this.searchInput;
      this.service.getById(id).subscribe(
        (data) => {
          this.player = data;
          this.notFound = false;
        },
        (error) => {
         console.error('Player not found:', error); 
        }
      );
    });
  }
}
