import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Player } from './model/player';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {
  

  private baseUrl = 'http://localhost:8080/api/players/';
  //private baseUrl = 'http://localhost:3000/players';
  

  constructor(private http: HttpClient) {}

  getAll(): Observable<Player[]> {
    return this.http.get<Player[]>(this.baseUrl);
  }

  getById(playerId: number): Observable<Player> {
    return this.http.get<Player>(this.baseUrl+`${playerId}`);
  }

  add(player: Player): Observable<Player> {
    console.log(player);
    return this.http.post<Player>(this.baseUrl,player);
  }

  update(player: Player): Observable<Player> {
  return this.http.put<Player>(this.baseUrl + player.playerId, player);
}

  delete(playerId: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}${playerId}`);
  }
}
