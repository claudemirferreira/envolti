import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CadastroPessoaComponent } from './cadastro-pessoa/cadastro-pessoa.component';
import { ListaPessoaComponent } from './lista-pessoa/lista-pessoa.component';

const routes: Routes = [
  { path: 'lista-pessoa', component: ListaPessoaComponent },
  { path: 'cadastro-pessoa', component: CadastroPessoaComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class PessoaRoutingModule { }
