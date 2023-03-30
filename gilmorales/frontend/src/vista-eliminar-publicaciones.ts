import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-eliminar-publicaciones')
export class VistaEliminarPublicaciones extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout" theme="spacing-xs">
 <vaadin-horizontal-layout theme="spacing" id="cabecera" style="align-self: stretch;"></vaadin-horizontal-layout>
 <h1 id="titulo" style="align-self: center; margin: var(--lumo-space-s);">Eliminar Publicaciones</h1>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="justify-content: space-between; align-self: stretch; margin: var(--lumo-space-xs);">
  <label id="labelSelecionar" style="align-self: center; margin: var(--lumo-space-s);">Selecionar las publicaciones que desea: </label>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="flex-grow: 1; justify-content: flex-end; margin: var(--lumo-space-xs);">
   <vaadin-checkbox id="checkboxSelecionarTodas" style="flex-grow: 0;">
    Seleccionar todas.
   </vaadin-checkbox>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutLista" style="align-self: stretch; flex-grow: 1; margin: var(--lumo-space-xs);"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing-xl" id="vaadinHorizontalLayout2" style="align-self: stretch; margin: var(--lumo-space-s); justify-content: flex-end;">
  <vaadin-button id="botonCancelar">
   Cancelar
  </vaadin-button>
  <vaadin-button id="botonEliminar">
   Eliminar selección
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
