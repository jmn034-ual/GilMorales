import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%; position: fixed; justify-content: flex-start;" id="vaadinVerticalLayout" theme="spacing-xs">
 <h1 id="titulo" style="align-self: center; margin: var(--lumo-space-s); margin-top: var(--lumo-space-xl);">Eliminar Publicaciones</h1>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="justify-content: space-between; align-self: stretch; margin: var(--lumo-space-xs); flex-shrink: 0;">
  <label id="labelSelecionar" style="align-self: center; margin-left: var(--lumo-space-l); font-weight: bold;">Selecionar las publicaciones que desea: </label>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="flex-grow: 1; justify-content: flex-end; margin: var(--lumo-space-xs); z-index: 9999; flex-shrink: 0;">
   <vaadin-checkbox id="checkboxSelecionarTodas" style="flex-grow: 0; flex-shrink: 0; border-radius: 10px; border: 2px solid #F5F5F5; margin-right: var(--lumo-space-xl); padding: var(--lumo-space-s);">
     Seleccionar todas. 
   </vaadin-checkbox>
  </vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <hr style="width: 100%;">
 <vaadin-vertical-layout id="layoutLista" style="width: 100%; flex-grow: 1; align-self: center; align-items: center;"></vaadin-vertical-layout>
 <vaadin-horizontal-layout theme="spacing-xl" id="vaadinHorizontalLayout2" style="justify-content: flex-end; z-index: 9999; flex-shrink: 0; align-self: flex-end; margin-right: var(--lumo-space-xl); margin-bottom: 5%;">
  <vaadin-button id="botonCancelar" theme="error">
    Cancelar 
  </vaadin-button>
  <vaadin-button id="botonEliminar" theme="primary error">
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
