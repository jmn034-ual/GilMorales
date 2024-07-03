import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-lista-publicaciones-propias-eliminar')
export class VistaListaPublicacionesPropiasEliminar extends LitElement {
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
<vaadin-vertical-layout style="flex-grow: 0; width: 80%; flex-shrink: 1; border-radius: 10px; border: 2px solid #F5F5F5; align-self: center; margin-top: var(--lumo-space-l); align-items: center;" id="layoutPublicacionesEliminar"></vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
