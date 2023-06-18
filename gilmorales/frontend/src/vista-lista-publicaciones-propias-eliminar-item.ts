import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';

@customElement('vista-lista-publicaciones-propias-eliminar-item')
export class VistaListaPublicacionesPropiasEliminarItem extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; justify-content: flex-start; height: 100%;" id="layoutItem">
 <vaadin-vertical-layout id="layoutPublicacion" style="align-self: stretch; flex-grow: 0; flex-shrink: 0; align-items: center;">
  <vaadin-vertical-layout id="layoutVideo" style="flex-shrink: 0; flex-grow: 0; align-self: stretch; align-items: center;"></vaadin-vertical-layout>
  <label id="numVisualizaciones">0</label>
 </vaadin-vertical-layout>
 <vaadin-checkbox id="checkboxEliminar" style="align-self: center;">
   Eliminar 
 </vaadin-checkbox>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
