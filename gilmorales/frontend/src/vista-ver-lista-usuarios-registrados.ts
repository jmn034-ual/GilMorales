import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver-lista-usuarios-registrados')
export class VistaVerListaUsuariosRegistrados extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center; position: fixed; overflow-y: auto;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout style="width: 100%; justify-content: center;" id="layoutTitulo">
  <h1 style="flex-grow: 0; align-self: center; flex-shrink: 0;" id="titulo">Lista de Usuarios Registrados</h1>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="align-self: flex-end; margin: var(--lumo-space-s); margin-right: var(--lumo-space-xl);" id="layoutBotonOrdenar">
  <vaadin-select value="Item one" id="botonOrdenar">
   <template id="template">
    <vaadin-list-box id="vaadinListBox" selected="0">
     <vaadin-item id="vaadinItem1" selected>
       Me gustas 
     </vaadin-item>
     <vaadin-item id="vaadinItem">
       Seguidores 
     </vaadin-item>
    </vaadin-list-box>
   </template>
  </vaadin-select>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutVerticalLista" style="flex-grow: 1; width: 100%;">
  <vaadin-horizontal-layout id="layoutHorizontalLista" style="flex-grow: 1; align-items: center; flex-shrink: 0; width: 100%;"></vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
