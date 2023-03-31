import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-filtrar-resultado')
export class VistaFiltrarResultado extends LitElement {
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
<vaadin-vertical-layout id="layoutRealizarBusqueda" style="flex-grow: 1; margin: var(--lumo-space-s); justify-content: center;">
 <vaadin-horizontal-layout theme="spacing-xs" id="layoutFiltrar" style="margin: var(--lumo-space-m); flex-grow: 0; justify-content: flex-end; align-self: center;">
  <label id="labelFiltrar" style="align-self: center;">Filtrar</label>
  <vaadin-select value="Item one" style="align-self: center;" id="vaadinSelect">
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
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
