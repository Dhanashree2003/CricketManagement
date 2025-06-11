import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddplayerComponent } from './addplayer/addplayer.component';
import { HomepageComponent } from './homepage/homepage.component';
import { SearchplayerComponent } from './searchplayer/searchplayer.component';
import { UpdateplayerComponent } from './updateplayer/updateplayer.component';
import { ListplayerComponent } from './listplayer/listplayer.component';


const routes: Routes = [
  { path: 'home', component: HomepageComponent },
  { path: 'listplayer', component: ListplayerComponent },
  { path: 'addplayer', component: AddplayerComponent },
  { path: 'update/:id', component: UpdateplayerComponent },
  { path: 'search/:input', component: SearchplayerComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
