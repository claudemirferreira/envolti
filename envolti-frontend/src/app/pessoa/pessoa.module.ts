import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ListaPessoaComponent } from './lista-pessoa/lista-pessoa.component';
import { CadastroPessoaComponent } from './cadastro-pessoa/cadastro-pessoa.component';
import { PessoaRoutingModule } from './pessoa-routing.module';

@NgModule({
  declarations: [ListaPessoaComponent, CadastroPessoaComponent],
  imports: [
    CommonModule,
    PessoaRoutingModule,
  ]
})
export class PessoaModule { }
