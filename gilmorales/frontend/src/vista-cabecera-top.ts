import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-cabecera-top')
export class VistaCabeceraTop extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="flex-grow: 1; align-self: stretch;">
  <vaadin-vertical-layout id="cabeceraTop" style="margin: var(--lumo-space-xl);">
   <h3 id="tituloUsuarios" style="align-self: center;">Top Usuarios</h3>
   <vaadin-vertical-layout theme="spacing" id="listaUsuarios" style="align-self: center; flex-grow: 1;"></vaadin-vertical-layout>
   <vaadin-button id="botonVerListaUsuarios" style="align-self: center;">
     Ver Lista Usuarios 
   </vaadin-button>
   <h3 style="align-self: center;" id="tituloHashtag">Top Hashtags</h3>
   <vaadin-vertical-layout theme="spacing" style="align-self: center; flex-grow: 1; align-items: center;" id="listaTopHashtag"></vaadin-vertical-layout>
   <vaadin-button style="align-self: center;" id="botonVerListaHashtag">
     Ver Lista Hashtags 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout id="layoutListaResultadoBusqueda" style="flex-grow: 1; margin: var(--lumo-space-xs); align-self: stretch;">
   <h2 id="tituloResultadoBusqueda" style="align-self: center; margin: var(--lumo-space-s);">Resultado de la Busqueda</h2>
   <vaadin-horizontal-layout id="vaadinHorizontalLayout2" style="align-self: stretch; justify-content: space-around; margin: var(--lumo-space-s);">
    <vaadin-horizontal-layout id="layoutTituloUsuarios" style="flex-grow: 0; justify-content: center; margin: var(--lumo-space-m); width: 100%;">
     <h3 id="tituloUsuarios">Usuarios</h3>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing-xs" id="layoutFiltrar" style="margin: var(--lumo-space-m); flex-grow: 0; justify-content: flex-end; width: 100%;">
     <label id="labelFiltrar" style="align-self: center;">Filtrar</label>
     <vaadin-select value="Item one" id="vaadinSelect" style="align-self: center;">
      <template>
       <vaadin-list-box id="vaadinListBox" selected="0">
        <vaadin-item id="filtrarNone" selected>
          None 
        </vaadin-item>
        <vaadin-item id="filtrarUsuarios">
          Usuarios 
        </vaadin-item>
        <vaadin-item id="filtrarHashtag">
          Hashtags 
        </vaadin-item>
       </vaadin-list-box>
      </template>
     </vaadin-select>
    </vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout id="layoutListaResultadoUsuarios" style="align-self: stretch; margin: var(--lumo-space-s); justify-content: center;"></vaadin-vertical-layout>
   <vaadin-horizontal-layout id="layoutTituloUsuarios" style="flex-grow: 0; justify-content: flex-start; margin: var(--lumo-space-s); align-self: stretch;">
    <vaadin-horizontal-layout id="layoutTituloHashtags" style="flex-grow: 1; justify-content: center; margin: var(--lumo-space-m); width: 100%;">
     <h3 id="tituloHashtags" style="flex-grow: 0; align-self: center;">Hashtags</h3>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing-xs" id="vaadinHorizontalLayout3" style="flex-grow: 1; margin: var(--lumo-space-m); justify-content: flex-end; width: 100%;"></vaadin-horizontal-layout>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout style="align-self: stretch; margin: var(--lumo-space-s); justify-content: center;" id="layoutListaResultadoHashtags"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
