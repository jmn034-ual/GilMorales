import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-realizar-busqueda')
export class VistaRealizarBusqueda extends LitElement {
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
<vaadin-vertical-layout id="layoutListaResultadoBusqueda" style="flex-grow: 1; align-items: stretch; flex-shrink: 0; overflow-y: auto; width: 100%; height: 100%;">
 <h2 id="tituloResultadoBusqueda" style="align-self: center; margin: var(--lumo-space-s);">Resultado de la Busqueda</h2>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout2" style="align-self: stretch; justify-content: space-around; margin: var(--lumo-space-s);">
  <vaadin-horizontal-layout id="layoutTituloUsuarios" style="flex-grow: 0; justify-content: flex-start; flex-shrink: 0; margin-left: 15%;">
   <h3 id="tituloUsuarios">Usuarios</h3>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xs" id="layoutFiltrar" style="margin: var(--lumo-space-m); flex-grow: 0; justify-content: flex-end; width: 100%;"></vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout id="layoutListaResultadoUsuarios" style="margin: var(--lumo-space-s); justify-content: center; flex-shrink: 0; flex-grow: 1;"></vaadin-vertical-layout>
 <vaadin-horizontal-layout id="layoutTituloUsuarios" style="flex-grow: 0; justify-content: flex-start; margin: var(--lumo-space-s); align-self: stretch;">
  <vaadin-horizontal-layout id="layoutTituloHashtags" style="flex-grow: 0; justify-content: flex-start; flex-shrink: 0; margin-left: 14%;">
   <h3 id="tituloHashtags" style="flex-grow: 0; align-self: center;">Hashtags</h3>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xs" id="vaadinHorizontalLayout3" style="flex-grow: 1; margin: var(--lumo-space-m); justify-content: flex-end; width: 100%;"></vaadin-horizontal-layout>
 </vaadin-horizontal-layout>
 <vaadin-vertical-layout style="margin: var(--lumo-space-s); justify-content: center; flex-shrink: 0; flex-grow: 1;" id="layoutListaResultadoHashtags"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
